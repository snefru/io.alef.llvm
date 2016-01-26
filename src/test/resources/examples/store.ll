define void @store() {
    store <4 x float> %2, <4 x float>* %1, align 4
;    store i32 addrspace(33)* %tmp1, i32 addrspace(33)* addrspace(66)* getelementptr (%struct.mystruct, %struct.mystruct addrspace(66)* @output, i32 0, i32 1), align 4
    store [2 x i32] [i32 7, i32 9], [2 x i32]* %x
    store atomic volatile i32 3, i32* %x singlethread monotonic, align 4
    store half 0xH4200, half* %a, align 2
    store {{i32},{float, double}} %r, {{i32},{float, double}}* %p
    store void ()* bitcast (%struct.S_102 ()* @f_102 to void ()*), void ()** @callthis, align 8
    store %0 { %1 { i32 4 }, %2 { float 4.000000e+00, double 2.000000e+01 } }, %0* %p
    store atomic volatile i8 2, i8* %ptr1 unordered, align 1
}