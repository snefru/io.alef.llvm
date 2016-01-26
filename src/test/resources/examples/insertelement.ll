define void @insertelement() {
    insertelement <16 x float*> undef, float* %base, i32 0
    insertelement <8 x i8> <i8 undef, i8 undef, i8 undef, i8 undef, i8 undef, i8 undef, i8 undef, i8 undef>, i8 %tmp1, i32 0
    insertelement <2 x double> <double undef, double undef>, double %tmp1, i32 0
}