define void @extractvalue() {
      extractvalue { i8*, i32 } %0, 0
      extractvalue [4 x [4 x i8]] %x2, 0, 1
}