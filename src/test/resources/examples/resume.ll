define void @resume() {
  resume { i8*, i32 } { i8* bitcast (void ()* @f12 to i8*), i32 42 }
}