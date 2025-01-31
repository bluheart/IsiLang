// Generated from IsiLang.g4 by ANTLR 4.8
package com.caio.isilanguage.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IsiLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IsiLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#escreveID}.
	 * @param ctx the parse tree
	 */
	void enterEscreveID(IsiLangParser.EscreveIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#escreveID}.
	 * @param ctx the parse tree
	 */
	void exitEscreveID(IsiLangParser.EscreveIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#escreveTexto}.
	 * @param ctx the parse tree
	 */
	void enterEscreveTexto(IsiLangParser.EscreveTextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#escreveTexto}.
	 * @param ctx the parse tree
	 */
	void exitEscreveTexto(IsiLangParser.EscreveTextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdEnq}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnq(IsiLangParser.CmdEnqContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdEnq}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnq(IsiLangParser.CmdEnqContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpr(IsiLangParser.CmdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpr(IsiLangParser.CmdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#compara}.
	 * @param ctx the parse tree
	 */
	void enterCompara(IsiLangParser.ComparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#compara}.
	 * @param ctx the parse tree
	 */
	void exitCompara(IsiLangParser.ComparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#in_termo}.
	 * @param ctx the parse tree
	 */
	void enterIn_termo(IsiLangParser.In_termoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#in_termo}.
	 * @param ctx the parse tree
	 */
	void exitIn_termo(IsiLangParser.In_termoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#in_fator}.
	 * @param ctx the parse tree
	 */
	void enterIn_fator(IsiLangParser.In_fatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#in_fator}.
	 * @param ctx the parse tree
	 */
	void exitIn_fator(IsiLangParser.In_fatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(IsiLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(IsiLangParser.FatorContext ctx);
}