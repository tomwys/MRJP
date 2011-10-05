package info.wysocki.study.mrjp.calculus.lexer;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.Test;

public class LexerTest {
	@Test
	public void testIfEmptyForEmtyInput() throws Exception {
		Lexer l = getLexerForString("");
		assertFalse(l.hasNext());
	}

	@Test
	public void testIfHasNextReturnTrueForNonEmptySource() throws Exception {
		Lexer l = getLexerForString("9");
		assertTrue(l.hasNext());
	}

	@Test
	public void testIfEmptyForWhiteInput() throws Exception {
		Lexer l = getLexerForString(" \t\n");
		assertFalse(l.hasNext());
	}

	private Lexer getLexerForString(String input) throws LexerException {
		return new Lexer(new StringReader(input));
	}
}
