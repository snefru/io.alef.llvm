define void @cleanupret() {
  catchswitch within %o [label %inner] unwind to caller
  catchswitch within none [label %catch.body] unwind to caller
  catchswitch within %cleanpad [label %pad.inner] unwind to caller
  catchswitch within none [label %catch.inner] unwind label %catchpad.outer
}