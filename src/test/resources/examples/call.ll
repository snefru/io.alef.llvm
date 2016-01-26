define void @call() {
    call void @foo( )
    call void (...) bitcast (void (i16*, i32)* @AddString to void (...)*)( i16* null, i32 0 )
    call void asm sideeffect "mov", "~{dirflag},~{fpsr},~{flags}"() nounwind
    call void asm sideeffect alignstack "mov", "~{dirflag},~{fpsr},~{flags}"() nounwind
    call i32 @zed(%struct.foobar* @foo.d, %struct.foobar* @bar.d) nounwind
    call x86_fastcallcc void @x86_fastcallcc()
    tail call x86_fastcallcc void @x86_fastcallcc()
    musttail call x86_fastcallcc void @x86_fastcallcc()
    notail call x86_fastcallcc void @x86_fastcallcc()
}