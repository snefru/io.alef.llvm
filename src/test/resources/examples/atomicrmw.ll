define void @atomicrmw() {
    atomicrmw add i8* %Q, i8 1 monotonic
    atomicrmw add i32* %x, i32 10 seq_cst
    atomicrmw volatile umin i32* %word, i32 22 singlethread monotonic
}