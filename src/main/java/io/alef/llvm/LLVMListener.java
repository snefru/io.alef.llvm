// Generated from io/alef/llvm/LLVM.g4 by ANTLR 4.5.1
package io.alef.llvm;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LLVMParser}.
 */
public interface LLVMListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link LLVMParser#module}.
     *
     * @param ctx the parse tree
     */
    void enterModule(LLVMParser.ModuleContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#module}.
     *
     * @param ctx the parse tree
     */
    void exitModule(LLVMParser.ModuleContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#argumentList}.
     *
     * @param ctx the parse tree
     */
    void enterArgumentList(LLVMParser.ArgumentListContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#argumentList}.
     *
     * @param ctx the parse tree
     */
    void exitArgumentList(LLVMParser.ArgumentListContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#basicBlock}.
     *
     * @param ctx the parse tree
     */
    void enterBasicBlock(LLVMParser.BasicBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#basicBlock}.
     *
     * @param ctx the parse tree
     */
    void exitBasicBlock(LLVMParser.BasicBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#clause}.
     *
     * @param ctx the parse tree
     */
    void enterClause(LLVMParser.ClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#clause}.
     *
     * @param ctx the parse tree
     */
    void exitClause(LLVMParser.ClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#comdat}.
     *
     * @param ctx the parse tree
     */
    void enterComdat(LLVMParser.ComdatContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#comdat}.
     *
     * @param ctx the parse tree
     */
    void exitComdat(LLVMParser.ComdatContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#entity}.
     *
     * @param ctx the parse tree
     */
    void enterEntity(LLVMParser.EntityContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#entity}.
     *
     * @param ctx the parse tree
     */
    void exitEntity(LLVMParser.EntityContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#functionAttribute}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionAttribute(LLVMParser.FunctionAttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#functionAttribute}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionAttribute(LLVMParser.FunctionAttributeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#functionHeader}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionHeader(LLVMParser.FunctionHeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#functionHeader}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionHeader(LLVMParser.FunctionHeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#functionBody}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionBody(LLVMParser.FunctionBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#functionBody}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionBody(LLVMParser.FunctionBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterInstruction(LLVMParser.InstructionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitInstruction(LLVMParser.InstructionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#operandBundle}.
     *
     * @param ctx the parse tree
     */
    void enterOperandBundle(LLVMParser.OperandBundleContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#operandBundle}.
     *
     * @param ctx the parse tree
     */
    void exitOperandBundle(LLVMParser.OperandBundleContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#parameter}.
     *
     * @param ctx the parse tree
     */
    void enterParameter(LLVMParser.ParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#parameter}.
     *
     * @param ctx the parse tree
     */
    void exitParameter(LLVMParser.ParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#parameterAttribute}.
     *
     * @param ctx the parse tree
     */
    void enterParameterAttribute(LLVMParser.ParameterAttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#parameterAttribute}.
     *
     * @param ctx the parse tree
     */
    void exitParameterAttribute(LLVMParser.ParameterAttributeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#parameterList}.
     *
     * @param ctx the parse tree
     */
    void enterParameterList(LLVMParser.ParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#parameterList}.
     *
     * @param ctx the parse tree
     */
    void exitParameterList(LLVMParser.ParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#returnAttribute}.
     *
     * @param ctx the parse tree
     */
    void enterReturnAttribute(LLVMParser.ReturnAttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#returnAttribute}.
     *
     * @param ctx the parse tree
     */
    void exitReturnAttribute(LLVMParser.ReturnAttributeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#section}.
     *
     * @param ctx the parse tree
     */
    void enterSection(LLVMParser.SectionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#section}.
     *
     * @param ctx the parse tree
     */
    void exitSection(LLVMParser.SectionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(LLVMParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(LLVMParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code struct}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterStruct(LLVMParser.StructContext ctx);

    /**
     * Exit a parse tree produced by the {@code struct}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitStruct(LLVMParser.StructContext ctx);

    /**
     * Enter a parse tree produced by the {@code metadata}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterMetadata(LLVMParser.MetadataContext ctx);

    /**
     * Exit a parse tree produced by the {@code metadata}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitMetadata(LLVMParser.MetadataContext ctx);

    /**
     * Enter a parse tree produced by the {@code pointer}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterPointer(LLVMParser.PointerContext ctx);

    /**
     * Exit a parse tree produced by the {@code pointer}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitPointer(LLVMParser.PointerContext ctx);

    /**
     * Enter a parse tree produced by the {@code half}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterHalf(LLVMParser.HalfContext ctx);

    /**
     * Exit a parse tree produced by the {@code half}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitHalf(LLVMParser.HalfContext ctx);

    /**
     * Enter a parse tree produced by the {@code opaque}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterOpaque(LLVMParser.OpaqueContext ctx);

    /**
     * Exit a parse tree produced by the {@code opaque}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitOpaque(LLVMParser.OpaqueContext ctx);

    /**
     * Enter a parse tree produced by the {@code void}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterVoid(LLVMParser.VoidContext ctx);

    /**
     * Exit a parse tree produced by the {@code void}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitVoid(LLVMParser.VoidContext ctx);

    /**
     * Enter a parse tree produced by the {@code double}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterDouble(LLVMParser.DoubleContext ctx);

    /**
     * Exit a parse tree produced by the {@code double}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitDouble(LLVMParser.DoubleContext ctx);

    /**
     * Enter a parse tree produced by the {@code integer}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterInteger(LLVMParser.IntegerContext ctx);

    /**
     * Exit a parse tree produced by the {@code integer}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitInteger(LLVMParser.IntegerContext ctx);

    /**
     * Enter a parse tree produced by the {@code label}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterLabel(LLVMParser.LabelContext ctx);

    /**
     * Exit a parse tree produced by the {@code label}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitLabel(LLVMParser.LabelContext ctx);

    /**
     * Enter a parse tree produced by the {@code float}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterFloat(LLVMParser.FloatContext ctx);

    /**
     * Exit a parse tree produced by the {@code float}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitFloat(LLVMParser.FloatContext ctx);

    /**
     * Enter a parse tree produced by the {@code packedStruct}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterPackedStruct(LLVMParser.PackedStructContext ctx);

    /**
     * Exit a parse tree produced by the {@code packedStruct}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitPackedStruct(LLVMParser.PackedStructContext ctx);

    /**
     * Enter a parse tree produced by the {@code x86_mmx}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterX86_mmx(LLVMParser.X86_mmxContext ctx);

    /**
     * Exit a parse tree produced by the {@code x86_mmx}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitX86_mmx(LLVMParser.X86_mmxContext ctx);

    /**
     * Enter a parse tree produced by the {@code token}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterToken(LLVMParser.TokenContext ctx);

    /**
     * Exit a parse tree produced by the {@code token}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitToken(LLVMParser.TokenContext ctx);

    /**
     * Enter a parse tree produced by the {@code x86_fp80}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterX86_fp80(LLVMParser.X86_fp80Context ctx);

    /**
     * Exit a parse tree produced by the {@code x86_fp80}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitX86_fp80(LLVMParser.X86_fp80Context ctx);

    /**
     * Enter a parse tree produced by the {@code array}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterArray(LLVMParser.ArrayContext ctx);

    /**
     * Exit a parse tree produced by the {@code array}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitArray(LLVMParser.ArrayContext ctx);

    /**
     * Enter a parse tree produced by the {@code vector}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterVector(LLVMParser.VectorContext ctx);

    /**
     * Exit a parse tree produced by the {@code vector}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitVector(LLVMParser.VectorContext ctx);

    /**
     * Enter a parse tree produced by the {@code ppc_fp128}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterPpc_fp128(LLVMParser.Ppc_fp128Context ctx);

    /**
     * Exit a parse tree produced by the {@code ppc_fp128}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitPpc_fp128(LLVMParser.Ppc_fp128Context ctx);

    /**
     * Enter a parse tree produced by the {@code functionType}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionType(LLVMParser.FunctionTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code functionType}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionType(LLVMParser.FunctionTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code fp128}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterFp128(LLVMParser.Fp128Context ctx);

    /**
     * Exit a parse tree produced by the {@code fp128}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitFp128(LLVMParser.Fp128Context ctx);

    /**
     * Enter a parse tree produced by the {@code IdentifiedType}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifiedType(LLVMParser.IdentifiedTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code IdentifiedType}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifiedType(LLVMParser.IdentifiedTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#typedValue}.
     *
     * @param ctx the parse tree
     */
    void enterTypedValue(LLVMParser.TypedValueContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#typedValue}.
     *
     * @param ctx the parse tree
     */
    void exitTypedValue(LLVMParser.TypedValueContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#value}.
     *
     * @param ctx the parse tree
     */
    void enterValue(LLVMParser.ValueContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#value}.
     *
     * @param ctx the parse tree
     */
    void exitValue(LLVMParser.ValueContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMParser#index}.
     *
     * @param ctx the parse tree
     */
    void enterIndex(LLVMParser.IndexContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMParser#index}.
     *
     * @param ctx the parse tree
     */
    void exitIndex(LLVMParser.IndexContext ctx);
}