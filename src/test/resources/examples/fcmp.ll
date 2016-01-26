define void @fcmp() {
    fcmp false half %fop1, %fop2
    fcmp nnan nsz oge double %c, %d
}