// Generated from IsiLang.g4 by ANTLR 4.8
package com.caio.isilanguage.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IsiLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IsiLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IsiLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#escreveID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreveID(IsiLangParser.EscreveIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#escreveTexto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreveTexto(IsiLangParser.EscreveTextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdEnq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnq(IsiLangParser.CmdEnqContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdExpr(IsiLangParser.CmdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#compara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompara(IsiLangParser.ComparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#in_termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_termo(IsiLangParser.In_termoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#in_fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_fator(IsiLangParser.In_fatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(IsiLangParser.FatorContext ctx);
}