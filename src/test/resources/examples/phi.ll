define void @phi() {
      phi i32 [ 0, %LoopHeader ], [ %nextindvar, %Loop ]
}