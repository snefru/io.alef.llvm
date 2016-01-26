declare void @llvm.ppc.altivec.stvewx(<4 x i32>, i8*)
declare <4 x float> @llvm.ppc.altivec.vrsqrtefp(<4 x float>)
declare <4 x float> @llvm.ppc.altivec.vcfsx(<4 x i32>, i32)
declare i32 @llvm.ppc.altivec.vcmpequw.p(i32, <4 x i32>, <4 x i32>)
declare <4 x i32> @llvm.ppc.altivec.vcmpgtfp(<4 x float>, <4 x float>)


declare i8* @llvm.stacksave() nounwind
declare void @Foo(i8**)
declare void @Bar(i64, %struct.Range*)
declare void @llvm.stackrestore(i8*) nounwind
declare i32 @__gxx_personality_v0(...)



declare void @llvm.memcpy.i32(i8*, i8*, i32, i32) nounwind
declare i32 @_Z40LoopFilter_Internal_FilterLumaPlaneMBAFFPK14LoopFilterInfojjj(%struct.LoopFilterInfo*, i32, i32, i32) nounwind
declare void @_Z18LoopFilter_DestroyP14LoopFilterInfo(%struct.LoopFilterInfo*)
declare void @MutexDispose(%struct.Mutex*)
declare void @_ZdaPv(i8*) nounwind
declare void @jvtDisposePTRVectorAligned(i8*)
declare void @jvtDisposePTR(i8*)
declare void @jvtDisposePTRMemAligned(i8*)
declare void @_Z31LoopFilter_Internal_ResetTablesP14LoopFilterInfo(%struct.LoopFilterInfo*) nounwind
declare void @llvm.memset.i32(i8*, i8, i32, i32) nounwind
declare i16 @llvm.bswap.i16(i16) nounwind readnone
declare i8* @jvtNewPtrVectorAligned(i32)
declare i8* @jvtNewPtr(i32)
declare i8* @jvtNewPtrMemAligned(i32)
declare %struct.Mutex* @MutexNew()
declare i8* @_Znam(i32)

declare void @MutexLock(%struct.Mutex*)
declare void @MutexUnlock(%struct.Mutex*)
declare i32 @_Z35LoopFilter_Internal_FilterLumaPlanePK14LoopFilterInfojjjjj(%struct.LoopFilterInfo*, i32, i32, i32, i32, i32)
declare i32 @_Z37LoopFilter_Internal_FilterChromaPlanePK14LoopFilterInfojjjjj(%struct.LoopFilterInfo*, i32, i32, i32, i32, i32)
declare i32 @_Z42LoopFilter_Internal_FilterChromaPlaneMBAFFPK14LoopFilterInfojjj(%struct.LoopFilterInfo*, i32, i32, i32) nounwind
declare i32 @_Z26LF_Threading2_ProcessTasksP14LoopFilterInfoP11FramePixelsP22FrameMotionVectorCacheij(%struct.LoopFilterInfo*, %struct.FramePixels*, %struct.FrameMotionVectorCache*, i32, i32)
declare i32 @_Z46LoopFilter_Internal_CalculateBoundaryStrengthsPK14LoopFilterInfoP22FrameMotionVectorCachejj(%struct.LoopFilterInfo*, %struct.FrameMotionVectorCache*, i32, i32)
declare i32 @_Z44LoopFilter_Internal_FilterLumaChromaPlane_PPP14LoopFilterInfojjjjj(%struct.LoopFilterInfo*, i32, i32, i32, i32, i32)
declare void @_Z34LF_Threading2_ProcessTasks_WrapperPv(i8*)
declare void @llvm.memset.i64(i8*, i8, i64, i32) nounwind

declare i32 @_Z20LoopFilter_ConstructP14LoopFilterInfojj(%struct.LoopFilterInfo*, i32, i32)
declare i32 @_Z25LF_Threading2_assert_doneP14LoopFilterInfo(%struct.LoopFilterInfo*) nounwind
declare i32 @_Z54S_CalcIfLargeMVDeltaForBMbBothPredictionsFromSameFramePK19BiPartSrcDescriptorS1_ijj(%struct.BiPartSrcDescriptor*, %struct.BiPartSrcDescriptor*, i32, i32, i32) nounwind
declare void @_Z30LoopFilter_Internal_FilterLumaPhiiiiii(i8*, i32, i32, i32, i32, i32, i32) nounwind
declare void @_Z33LoopFilter_Internal_FilterChromaVPhiiiiiiiiii(i8*, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32) nounwind
declare void @_Z33LoopFilter_Internal_FilterChromaHPhiiiiii(i8*, i32, i32, i32, i32, i32, i32) nounwind
declare void @llvm.ppc.altivec.dst(i8*, i32, i32)
declare void @llvm.ppc.altivec.dstt(i8*, i32, i32)
declare void @llvm.ppc.altivec.dstst(i8*, i32, i32)
declare void @llvm.ppc.altivec.dststt(i8*, i32, i32)
declare <4 x i32> @llvm.ppc.altivec.lvewx(i8*)
declare i32 @llvm.ppc.altivec.vcmpequw.p(i32, <4 x i32>, <4 x i32>)
declare i32 @bar(...)
declare i32 @baz(...)
declare i32 @foo(...)
declare i32 @quux(...)
declare void @test({[2 x i32],[2 x i32]}* %A, i64 %X, i64 %Y)
declare i32 @test(i32 *%Ptr, i64 %V)
declare void @test([17 x i16]* %mask_bits)
declare void @table_reindex(%struct..apr_table_t* %t.1)
declare i32 @MTConcat([3 x i32]* %a.1)
declare i32 @BMT_CommitPartDrawObj()
declare void @foo(i32* noalias %p, i32* noalias %q, i32 %i, i32 %j)
declare <8 x i16> @llvm.arm.neon.vld1.v8i16.p0i8(i8*, i32) nounwind readonly
declare void @llvm.arm.neon.vst1.p0i8.v8i16(i8*, <8 x i16>, i32) nounwind
declare i1 @cond(i32*)
declare void @inc(i32*)
declare i8 @llvm.ctlz.i8(i8)
declare i16 @llvm.ctlz.i16(i16)
declare i32 @llvm.ctlz.i32(i32)
declare i42 @llvm.ctlz.i42(i42)  ; Not a power-of-2
declare i32 @llvm.objectsize.i32(i8*, i1) nounwind readonly
declare i32 @llvm.arm.ssat(i32, i32) nounwind readnone
declare void @llvm.assume(i1) nounwind
declare i32 @llvm.hexagon.A2.addi(i32, i32)
declare i32 @llvm.hexagon.A2.add(i32, i32)
declare i32 @llvm.hexagon.A2.addsat(i32, i32)
declare i32 @llvm.hexagon.A2.and(i32, i32)
declare void @llvm.va_start(i8*)
declare double @foo(i8*)
declare <4 x float> @llvm.ppc.altivec.vmaddfp(<4 x float>, <4 x float>, <4 x float>)
declare i16 @llvm.bswap.i16(i16)
declare i32 @bar(...)
declare <4 x i32> @llvm.ppc.altivec.vsel(<4 x i32>, <4 x i32>, <4 x i32>)


declare double @gen_random(double) #0
declare void @benchmark_heapsort(i32 signext, double* nocapture) #0
declare noalias i8* @malloc(i64) #0
declare signext i32 @printf(i8* nocapture, ...) #0
declare void @free(i8* nocapture) #0
declare i64 @strtol(i8*, i8** nocapture, i32 signext) #0
declare i32 @zadd(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare i32 @zdup(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare i32 @zexch(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare i32 @zifelse(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare i32 @zle(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare i32 @zpop(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare i32 @zsub(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*)
declare void @interp_init(i32) nounwind
declare void @interp_fix_op(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211* nocapture) nounwind
declare i32 @interp_exit(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211* nocapture) nounwind readnone
declare i32 @interp(%struct.ref_s.1.49.91.115.121.139.145.151.157.163.169.175.181.211*) nounwind
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* nocapture, i8* nocapture, i64, i32, i1) nounwind
declare i32 @obj_compare(...)
declare i32 @file_check_read(...)
declare i32 @scan_token(...)
declare i32 @file_close(...)
declare void @sread_string(%struct.stream_s.5.53.95.119.125.143.149.155.161.167.173.179.185.215*, i8*, i32)
declare dereferenceable(56) %"class.Foam::Ostream.189"* @_ZN4FoamlsERNS_7OstreamEPKc() #0
declare void @_ZN4Foam13messageStreamcvRNS_8OSstreamEEv() #0
declare i32 @__gxx_personality_v0(...)
declare void @_ZN4Foam7cellSetC1ERKNS_8polyMeshERKNS_4wordEiNS_8IOobject11writeOptionE() #0
declare void @_ZN4FoamlsERNS_7OstreamEi() #0
declare void @_ZN4Foam8pointSetC1ERKNS_8polyMeshERKNS_4wordEiNS_8IOobject11writeOptionE() #0
declare void @_ZN4Foam8pointSetD1Ev() #0
declare void @_ZN4Foam7faceSetC1ERKNS_8polyMeshERKNS_4wordEiNS_8IOobject11writeOptionE() #0
declare void @_ZN4Foam7faceSetD1Ev() #0
declare void @_ZN4Foam4word12stripInvalidEv() #1 align 2
declare void @_ZN4Foam11regIOobjectD2Ev() #0
declare void @_ZN4Foam6reduceIiNS_5sumOpIiEEEEvRKNS_4ListINS_8UPstream11commsStructEEERT_RKT0_ii() #0
declare float @fmaxf(float, float)
declare double @fmax(double, double)
declare ppc_fp128 @fmaxl(ppc_fp128, ppc_fp128)
declare float @llvm.maxnum.f32(float, float)
declare double @llvm.maxnum.f64(double, double)
declare ppc_fp128 @llvm.maxnum.ppcf128(ppc_fp128, ppc_fp128)
declare <2 x float> @llvm.maxnum.v2f32(<2 x float>, <2 x float>)
declare <4 x float> @llvm.maxnum.v4f32(<4 x float>, <4 x float>)
declare <8 x float> @llvm.maxnum.v8f32(<8 x float>, <8 x float>)
declare i32 @__gxx_personality_v0(...)
declare void @_ZNSt3__117__assoc_sub_state10__sub_waitERNS_11unique_lockINS_5mutexEEE(%"class.std::__1::__assoc_sub_state"*, %"class.std::__1::unique_lock"*) #0 align 2
declare zeroext i1 @_ZNSt15__exception_ptrneERKNS_13exception_ptrES2_(%"class.std::__exception_ptr::exception_ptr"*, %"class.std::__exception_ptr::exception_ptr"*) #1
declare void @_ZNSt15__exception_ptr13exception_ptrC1EMS0_FvvE(%"class.std::__exception_ptr::exception_ptr"*, { i64, i64 }* byval) #1
declare void @_ZNSt15__exception_ptr13exception_ptrD1Ev(%"class.std::__exception_ptr::exception_ptr"*) #1
declare void @_ZSt17rethrow_exceptionNSt15__exception_ptr13exception_ptrE(%"class.std::__exception_ptr::exception_ptr"*) #2
declare void @_ZNSt15__exception_ptr13exception_ptrC1ERKS0_(%"class.std::__exception_ptr::exception_ptr"*, %"class.std::__exception_ptr::exception_ptr"*) #1
declare void @_ZNSt3__15mutex6unlockEv(%"class.std::__1::mutex"*) #1
declare void @_ZNSt3__15mutex4lockEv(%"class.std::__1::mutex"*) #0
declare void @llvm.memset.p0i8.i64(i8* nocapture, i8, i64, i32, i1) #3
declare <4 x float> @llvm.floor.v4f32(<4 x float>) nounwind readnone
declare <4 x double> @llvm.floor.v4f64(<4 x double>) nounwind readnone
declare <4 x float> @llvm.nearbyint.v4f32(<4 x float>) nounwind readnone
declare <4 x double> @llvm.nearbyint.v4f64(<4 x double>) nounwind readnone
declare <4 x float> @llvm.ceil.v4f32(<4 x float>) nounwind readnone
declare <4 x double> @llvm.ceil.v4f64(<4 x double>) nounwind readnone
declare <4 x float> @llvm.trunc.v4f32(<4 x float>) nounwind readnone
declare <4 x double> @llvm.trunc.v4f64(<4 x double>) nounwind readnone