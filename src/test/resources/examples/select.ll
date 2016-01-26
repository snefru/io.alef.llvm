define void @select() {
    select i1 %rand1, i32 %A, i32 %Y
    select <2 x i1> <i1 true, i1 false>, <2 x i8> <i8 2, i8 3>, <2 x i8> <i8 3, i8 2>

}