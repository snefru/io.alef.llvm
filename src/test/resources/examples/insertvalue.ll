define void @insertvalue() {
    insertvalue { i8*, i32 } undef, i32 0, 1
    insertvalue [4 x [4 x i8]] %x1, i8 0, 0, 0
}