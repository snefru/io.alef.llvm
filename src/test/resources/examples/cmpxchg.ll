define void @cmpxchg() {
    cmpxchg i32* @X, i32 0, i32 -1 monotonic monotonic
    cmpxchg i32* %x, i32 1, i32 0 singlethread monotonic monotonic
    cmpxchg i32* %addr, i32 42, i32 0 acq_rel acquire
}