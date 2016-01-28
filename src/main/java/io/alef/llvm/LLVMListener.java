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
	 * @param ctx the parse tree
	 */
	void enterModule(LLVMParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(LLVMParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#alignment}.
	 * @param ctx the parse tree
	 */
	void enterAlignment(LLVMParser.AlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#alignment}.
	 * @param ctx the parse tree
	 */
	void exitAlignment(LLVMParser.AlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(LLVMParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(LLVMParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LLVMParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LLVMParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#basicBlock}.
	 * @param ctx the parse tree
	 */
	void enterBasicBlock(LLVMParser.BasicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#basicBlock}.
	 * @param ctx the parse tree
	 */
	void exitBasicBlock(LLVMParser.BasicBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(LLVMParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(LLVMParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#comdat}.
	 * @param ctx the parse tree
	 */
	void enterComdat(LLVMParser.ComdatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#comdat}.
	 * @param ctx the parse tree
	 */
	void exitComdat(LLVMParser.ComdatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(LLVMParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(LLVMParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(LLVMParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(LLVMParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#addressSpace}.
	 * @param ctx the parse tree
	 */
	void enterAddressSpace(LLVMParser.AddressSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#addressSpace}.
	 * @param ctx the parse tree
	 */
	void exitAddressSpace(LLVMParser.AddressSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#functionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAttribute(LLVMParser.FunctionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#functionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAttribute(LLVMParser.FunctionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeader(LLVMParser.FunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeader(LLVMParser.FunctionHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(LLVMParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(LLVMParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LLVMParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LLVMParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(LLVMParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(LLVMParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#operandBundle}.
	 * @param ctx the parse tree
	 */
	void enterOperandBundle(LLVMParser.OperandBundleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#operandBundle}.
	 * @param ctx the parse tree
	 */
	void exitOperandBundle(LLVMParser.OperandBundleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(LLVMParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(LLVMParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#parameterAttribute}.
	 * @param ctx the parse tree
	 */
	void enterParameterAttribute(LLVMParser.ParameterAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#parameterAttribute}.
	 * @param ctx the parse tree
	 */
	void exitParameterAttribute(LLVMParser.ParameterAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(LLVMParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(LLVMParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#returnAttribute}.
	 * @param ctx the parse tree
	 */
	void enterReturnAttribute(LLVMParser.ReturnAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#returnAttribute}.
	 * @param ctx the parse tree
	 */
	void exitReturnAttribute(LLVMParser.ReturnAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(LLVMParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(LLVMParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LLVMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LLVMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LLVMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LLVMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#typedValue}.
	 * @param ctx the parse tree
	 */
	void enterTypedValue(LLVMParser.TypedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#typedValue}.
	 * @param ctx the parse tree
	 */
	void exitTypedValue(LLVMParser.TypedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LLVMParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LLVMParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(LLVMParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(LLVMParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#fpPredicate}.
	 * @param ctx the parse tree
	 */
	void enterFpPredicate(LLVMParser.FpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#fpPredicate}.
	 * @param ctx the parse tree
	 */
	void exitFpPredicate(LLVMParser.FpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLVMParser#intPredicate}.
	 * @param ctx the parse tree
	 */
	void enterIntPredicate(LLVMParser.IntPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLVMParser#intPredicate}.
	 * @param ctx the parse tree
	 */
	void exitIntPredicate(LLVMParser.IntPredicateContext ctx);
}