define void @invoke() {
    invoke void @llvm.donothing() to label %normal unwind label %exception
    invoke fastcc void @f.fastcc()
    ; CHECK: invoke fastcc void @f.fastcc()
         to label %defaultdest unwind label %exc
         ; CHECK: to label %defaultdest unwind label %exc

    invoke void @op_bundle_callee_0() [ "foo"(i32 42, i64 100, i32 %x), "bar"(float  0.000000e+00, i64 100, i32 %l) ] to label %normal unwind label %exception
    ; CHECK: invoke void @op_bundle_callee_0() [ "foo"(i32 42, i64 100, i32 %x), "bar"(float  0.000000e+00, i64 100, i32 %l) ]


    invoke void @op_bundle_callee_0() [ "foo"(i32 42, i64 100, i32 %x), "foo"(i32 42, float  0.000000e+00, i32 %l) ] to label %normal2 unwind label %exception2
    ; CHECK: invoke void @op_bundle_callee_0() [ "foo"(i32 42, i64 100, i32 %x), "foo"(i32 42, float  0.000000e+00, i32 %l) ]


    invoke void @op_bundle_callee_0() [ "foo"(i32 42, i64 100, i32 %x), "foo"(i32 42, float  0.000000e+00, i32 %l) ] to label %normal unwind label %exception

    invoke void @__cxa_throw(i8* %exception.i, i8* bitcast (%0* @_ZTI1A to i8*), i8* bitcast (void (%struct.A*)* @_ZN1AD1Ev to i8*)) noreturn
          to label %.noexc unwind label %lpad

    invoke %struct.wxStringBase* @_ZN12wxStringBaseaSEPKw( %struct.wxStringBase* null, i32* getelementptr ([5 x i32], [5 x i32]* @.str89, i32 0, i32 0) )
    			to label %bb3314 unwind label %lpad		; <%struct.wxStringBase*> [#uses=0]


;      %call177 = invoke zeroext i1 undef(%"class.Foam::primitiveMesh.135"* undef, i1 zeroext true, %"class.Foam::HashSet.127"* undef)
;              to label %invoke.cont176 unwind label %lpad175

}