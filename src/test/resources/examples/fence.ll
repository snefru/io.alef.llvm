define void @fence() {
    fence singlethread seq_cst
    fence acquire
    fence release
    fence acq_rel
}