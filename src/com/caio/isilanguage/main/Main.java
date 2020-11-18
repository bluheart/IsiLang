package com.caio.isilanguage.main;

import com.caio.isilanguage.parser.ThrowingErrorListener;
import org.antlr.v4.runtime.*;

import com.caio.isilanguage.parser.IsiLangLexer;
import com.caio.isilanguage.parser.IsiLangParser;
import com.caio.isilanguage.parser.IsiVisitor;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;

public class Main {

	public static String parse(CharStream program) throws ParseCancellationException {
		IsiLangLexer lexer;
		IsiLangParser parser;
		lexer = new IsiLangLexer(program);
		lexer.removeErrorListeners();
		lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		parser = new IsiLangParser(tokenStream);
		//parser.removeErrorListeners();
		//parser.addErrorListener(ThrowingErrorListener.INSTANCE);
		IsiVisitor visitor = new IsiVisitor();
		String result = visitor.visit(parser.prog());
		return result;
	}
	public static void main(String[] args) {
		try {
			CharStream program = CharStreams.fromFileName("input.isi");
			System.out.println(parse(program));
		}
		catch (IOException e) {
			System.err.println(e);
		}
	}

}
