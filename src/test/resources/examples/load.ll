define void @load() {
    load i32, i32* %ptr
    load i32, i32* @myglobal
    load %struct.NSString*, %struct.NSString** @NSXMLStoreType, align 8
    load ppc_fp128, ppc_fp128* @a, align 16
    load atomic i32, i32* %x unordered, align 4
    load atomic volatile i32, i32* %x singlethread acquire, align 4
}