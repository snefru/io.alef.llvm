define void @cleanupret() {
    cleanupret from %cleanup unwind to caller
    cleanupret from %cleanup unwind label %continue
}