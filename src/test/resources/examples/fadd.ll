define void @fadd() {
    fadd double %conv1, %d7
    fadd <4 x float> undef, %.22
    fadd float %vecext624, 0xC064033340000000
    fadd float %vecext817, -4.830000e+02
    fadd <4 x float> zeroinitializer, %1164
    fadd nnan ninf  float %x, %y
}