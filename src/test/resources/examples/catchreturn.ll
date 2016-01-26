define void @cleanupret() {
  catchret from %catch to label %return
}