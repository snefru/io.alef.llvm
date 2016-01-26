define void @getelementptr() {
      getelementptr inbounds [9 x i8], [9 x i8]* %arr0, i32 0, i32 4
      getelementptr [193 x [4 x <4 x float>]], [193 x [4 x <4 x float>]]* null, i32 0, i32 173, i32 3		; <<4 x float>*>:7 [#uses=0]
      getelementptr inbounds [16000 x double], [16000 x double]* @Y, i64 0, i64 %indvars.iv.next.819
}