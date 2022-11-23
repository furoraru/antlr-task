// Generated from /Users/19006837/IdeaProjects/language2/src/main/resources/lang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(langParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(langParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(langParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(langParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(langParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(langParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(langParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(langParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(langParser.MulContext ctx);
}