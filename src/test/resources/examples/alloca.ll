define void @alloca() {
    alloca i32, align 4
    alloca inalloca [2 x i32]
    alloca inalloca i32, i32 2
    alloca inalloca i32, i32 2, align 16
}