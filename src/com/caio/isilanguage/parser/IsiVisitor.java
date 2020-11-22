package com.caio.isilanguage.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.caio.isilanguage.parser.IsiLangParser.CmdContext;
import com.caio.isilanguage.parser.IsiLangParser.In_termoContext;
import com.caio.isilanguage.parser.IsiLangParser.In_fatorContext;
import com.caio.isilanguage.parser.IsiLangParser.CmdIfContext;

public class IsiVisitor extends IsiLangBaseVisitor<String> {

	private Map<String, String> tipos = new HashMap<String, String>();
	private List<String> naoUsadas = new ArrayList<String>();

	@Override
	public String visitProg(@NotNull IsiLangParser.ProgContext ctx) {
		String declara = "";
		String result = "";
		if (ctx.declara() != null) {
			declara = visit(ctx.declara());
		}
		result = visit(ctx.bloco());
		if (!this.naoUsadas.isEmpty()) {
			System.err.println("Warning! Variaves declaradas e nao atribuidas:");
			for (String var: this.naoUsadas) {
				System.err.println(" - " + var);
			}
		}
		return result;
	}
	@Override
	public String visitDeclara(@NotNull IsiLangParser.DeclaraContext ctx) {
		List<TerminalNode> nodes = ctx.ID();
		String result = "";
		for (TerminalNode id: nodes) {
			if (this.tipos.containsKey(id.toString())) {
				throw new ParseCancellationException("Variavel ja declarada: '"
						+ id.toString() + "' na linha " + ctx.getStart().getLine());
			}
			this.tipos.put(id.toString(), null);
			this.naoUsadas.add(id.toString());
			result = result + " " + id.toString();
		}
		return result;
	}
	@Override
	public String visitBloco(@NotNull IsiLangParser.BlocoContext ctx) {
		List<CmdContext> contexts = ctx.cmd();
		String result = "";
		for (CmdContext command : contexts) {
			result = result + visit(command) + "\n";
		}
		return result;
	}
	@Override
	public String visitCmdLeitura(@NotNull IsiLangParser.CmdLeituraContext ctx) {
		if (!this.tipos.containsKey(ctx.ID().toString())) {
			throw new ParseCancellationException("Variavel nao declarada: " + ctx.ID().toString());
		}
		if (this.tipos.get(ctx.ID().toString()) == "NUM") {
			throw new ParseCancellationException("A variavel: " + ctx.ID().toString() +
					                             " tem tipo: " + this.tipos.get(ctx.ID().toString()));
		}
		this.tipos.replace(ctx.ID().toString(), "TEXTO");
		return ctx.ID().getText() +" = input()";
	}
	@Override
	public String visitCmdExpr(@NotNull IsiLangParser.CmdExprContext ctx) {
		String result = visit(ctx.expr());
		if (!this.tipos.containsKey(ctx.ID().toString())) {
			throw new ParseCancellationException("Variavel nao declarada: " + ctx.ID().toString());
		}
		IsiLangParser.FatorContext fator  = ctx.expr().termo().fator();
		String tipoFator = null;
		if (fator.NUM() != null) {
			tipoFator = "NUM";
		}
		else if (fator.TEXTO() != null) {
			tipoFator = "TEXTO";
		}
		else if (fator.ID() != null) {
			tipoFator = this.tipos.get(fator.ID().toString());
		}
		if (this.tipos.get(ctx.ID().toString()) == null) {
			this.tipos.replace(ctx.ID().toString(), tipoFator);
			this.naoUsadas.remove(ctx.ID().toString());
		}
		else {
			if (this.tipos.get(ctx.ID().toString()) != tipoFator) {
				throw new ParseCancellationException("a variavel possui tipo: " + this.tipos.get(ctx.ID().toString()) +
						                              " e o lado direito tipo: " + tipoFator);
			}
		}
		return ctx.ID().getText() + " = " + result;
	}
	@Override
	public String visitEscreveID(@NotNull IsiLangParser.EscreveIDContext ctx ) {
		if (!this.tipos.containsKey(ctx.ID().toString())) {
			throw new ParseCancellationException("Variavel nao declarada: " + ctx.ID().toString());
		}
		if (this.tipos.get(ctx.ID().toString()) == null) {
			throw new ParseCancellationException("A Variavel "+ ctx.ID().toString() +" nao possui valor atribuido");
		}
		this.naoUsadas.remove(ctx.ID().toString());
		return "print(" + ctx.ID().getText() + ")";
	}
	@Override
	public String visitEscreveTexto(@NotNull IsiLangParser.EscreveTextoContext ctx) {
		return "print(" + ctx.TEXTO().getText() + ")";
	}
	@Override
	public String visitCmdIf(@NotNull IsiLangParser.CmdIfContext ctx) {
		String result = "if " + visit(ctx.compara()) + ":\n\t" +
				         visitBloco(ctx.ifBody);
		if (ctx.elseBody != null) {
			result = result + "else:\n\t" + visitBloco(ctx.elseBody);
		}
		return  result;
	}
	@Override
	public String visitCompara(@NotNull IsiLangParser.ComparaContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return left + " " + ctx.OP_REL().getText() + " " + right;
	}
	@Override
	public String visitExpr(@NotNull IsiLangParser.ExprContext ctx) {
		String result = visit(ctx.termo());
		if (ctx.in_termo() != null) {
			for (In_termoContext it: ctx.in_termo()) {
				if (it.termo().fator().ID() != null) {
					if (this.tipos.get(it.termo().fator().ID().toString()).equals("TEXTO")
					    && it.OP_SS().getText().equals("-")) {
						throw new ParseCancellationException("A operaçao '" + it.OP_SS().toString()
								+ "' eh invalida para tipo TEXTO");
					}
				}
				result = result + it.OP_SS().getText() + visit(it.termo());
			}
		}

		return result;
	}
	@Override
	public String visitTermo(@NotNull IsiLangParser.TermoContext ctx) {
		String result = visit(ctx.fator());
		if (ctx.in_fator() != null) {
			for (In_fatorContext it: ctx.in_fator()) {
				if (it.fator().ID() != null) {
					if (this.tipos.get(it.fator().ID().toString()).equals("TEXTO")) {
						throw new ParseCancellationException("A operaçao '" + it.OP_DM().toString()
								+ "' eh invalida para tipo TEXTO");
					}
				}
				result = result + it.OP_DM().getText() + visit(it.fator());
			}
		}
		return result;
	}
	@Override
	public String visitFator(@NotNull IsiLangParser.FatorContext ctx) {
		if (ctx.expr() != null) {
			return "(" + visit(ctx.expr()) + ")";
		}
		if (ctx.ID() != null) {
			this.naoUsadas.remove(ctx.ID().toString());
		}
		return ctx.getText();
	}
	@Override
	public String visitCmdEnq(@NotNull IsiLangParser.CmdEnqContext ctx) {
		return "while " + visit(ctx.compara()) + ":\n\t" + visit(ctx.bloco());
	}
}
