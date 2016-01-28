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
    %0 = call i32 (%struct.FILE*, i8*, ...) @fscanf(%struct.FILE* %fp, i8* getelementptr inbounds ([14 x i8], [14 x i8]* @.str2708, i32 0, i32 0), i32* undef, i32* undef, i32* %xcenter, i32* null) nounwind ; <i32> [#uses=1]
    %malloccall = tail call i8* @malloc(i32 trunc (i64 mul nuw (i64 ptrtoint (i1** getelementptr (i1*, i1** null, i32 1) to i64), i64 2) to i32))
}