define void @extractelement() {
    extractelement <2 x i32> <i32 1, i32 1>, i32 1
    extractelement <2 x double> bitcast (<1 x i128> < i128 85070591730234615870450834276742070272 > to <2 x double>), i32 0
}