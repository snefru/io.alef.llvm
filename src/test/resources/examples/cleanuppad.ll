define void @cleanuppad() {
    cleanuppad within none [i32 undef]
    cleanuppad within %cs []
}