define void @shufflevector() {
    shufflevector <8 x i16> %bin.rdx, <8 x i16> undef, <8 x i32> <i32 4, i32 5, i32 6, i32 7, i32 undef, i32 undef,i32 undef, i32 undef>
    shufflevector <4 x i32> %v1, <4 x i32> %v2,
                            <4 x i32> <i32 0, i32 4, i32 1, i32 5>  ; yields <4 x i32>
    shufflevector <4 x i32> %v1, <4 x i32> undef,
                            <4 x i32> <i32 0, i32 1, i32 2, i32 3>  ; yields <4 x i32> - Identity shuffle.
    shufflevector <8 x i32> %v1, <8 x i32> undef,
                            <4 x i32> <i32 0, i32 1, i32 2, i32 3>  ; yields <4 x i32>
    shufflevector <4 x i32> %v1, <4 x i32> %v2,
                            <8 x i32> <i32 0, i32 1, i32 2, i32 3, i32 4, i32 5, i32 6, i32 7 >  ; yields <8 x i32>
}