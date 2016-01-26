define void @catchpad() {
  catchpad within %cs2 [i32* %arg1]
  catchpad within %cs []
}