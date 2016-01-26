// Generated from io/alef/llvm/LLVM.g4 by ANTLR 4.5.1
package io.alef.llvm;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LLVMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface LLVMVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link LLVMParser#module}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitModule(LLVMParser.ModuleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#argumentList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgumentList(LLVMParser.ArgumentListContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#basicBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBasicBlock(LLVMParser.BasicBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#clause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClause(LLVMParser.ClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#comdat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComdat(LLVMParser.ComdatContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#entity}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEntity(LLVMParser.EntityContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#functionAttribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionAttribute(LLVMParser.FunctionAttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#functionHeader}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionHeader(LLVMParser.FunctionHeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#functionBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionBody(LLVMParser.FunctionBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInstruction(LLVMParser.InstructionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#operandBundle}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOperandBundle(LLVMParser.OperandBundleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#parameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameter(LLVMParser.ParameterContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#parameterAttribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameterAttribute(LLVMParser.ParameterAttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#parameterList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameterList(LLVMParser.ParameterListContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#returnAttribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnAttribute(LLVMParser.ReturnAttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#section}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSection(LLVMParser.SectionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(LLVMParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by the {@code struct}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStruct(LLVMParser.StructContext ctx);

    /**
     * Visit a parse tree produced by the {@code metadata}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetadata(LLVMParser.MetadataContext ctx);

    /**
     * Visit a parse tree produced by the {@code pointer}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPointer(LLVMParser.PointerContext ctx);

    /**
     * Visit a parse tree produced by the {@code half}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHalf(LLVMParser.HalfContext ctx);

    /**
     * Visit a parse tree produced by the {@code opaque}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOpaque(LLVMParser.OpaqueContext ctx);

    /**
     * Visit a parse tree produced by the {@code void}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVoid(LLVMParser.VoidContext ctx);

    /**
     * Visit a parse tree produced by the {@code double}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDouble(LLVMParser.DoubleContext ctx);

    /**
     * Visit a parse tree produced by the {@code integer}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInteger(LLVMParser.IntegerContext ctx);

    /**
     * Visit a parse tree produced by the {@code label}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLabel(LLVMParser.LabelContext ctx);

    /**
     * Visit a parse tree produced by the {@code float}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloat(LLVMParser.FloatContext ctx);

    /**
     * Visit a parse tree produced by the {@code packedStruct}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPackedStruct(LLVMParser.PackedStructContext ctx);

    /**
     * Visit a parse tree produced by the {@code x86_mmx}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitX86_mmx(LLVMParser.X86_mmxContext ctx);

    /**
     * Visit a parse tree produced by the {@code token}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitToken(LLVMParser.TokenContext ctx);

    /**
     * Visit a parse tree produced by the {@code x86_fp80}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitX86_fp80(LLVMParser.X86_fp80Context ctx);

    /**
     * Visit a parse tree produced by the {@code array}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArray(LLVMParser.ArrayContext ctx);

    /**
     * Visit a parse tree produced by the {@code vector}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVector(LLVMParser.VectorContext ctx);

    /**
     * Visit a parse tree produced by the {@code ppc_fp128}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPpc_fp128(LLVMParser.Ppc_fp128Context ctx);

    /**
     * Visit a parse tree produced by the {@code functionType}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionType(LLVMParser.FunctionTypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code fp128}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFp128(LLVMParser.Fp128Context ctx);

    /**
     * Visit a parse tree produced by the {@code IdentifiedType}
     * labeled alternative in {@link LLVMParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifiedType(LLVMParser.IdentifiedTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#typedValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypedValue(LLVMParser.TypedValueContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue(LLVMParser.ValueContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMParser#index}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndex(LLVMParser.IndexContext ctx);
}