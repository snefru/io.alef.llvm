// Generated from io/alef/llvm/LLVM.g4 by ANTLR 4.5.1
package io.alef.llvm;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LLVMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LLVMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LLVMParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(LLVMParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(LLVMParser.AlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LLVMParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(LLVMParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#basicBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicBlock(LLVMParser.BasicBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(LLVMParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#comdat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComdat(LLVMParser.ComdatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(LLVMParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(LLVMParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#addressSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressSpace(LLVMParser.AddressSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#functionAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAttribute(LLVMParser.FunctionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#functionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHeader(LLVMParser.FunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(LLVMParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LLVMParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(LLVMParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#operandBundle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandBundle(LLVMParser.OperandBundleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(LLVMParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#parameterAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterAttribute(LLVMParser.ParameterAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(LLVMParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#returnAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAttribute(LLVMParser.ReturnAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(LLVMParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LLVMParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LLVMParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#typedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedValue(LLVMParser.TypedValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LLVMParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(LLVMParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#fpPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpPredicate(LLVMParser.FpPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLVMParser#intPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPredicate(LLVMParser.IntPredicateContext ctx);
}