package info.wysocki.study.mrjp.calculus;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.Test;

public class LexerTest {
	@Test
	public void testIfEmtyForEmtyInput() throws Exception {
		Lexer l = new Lexer(new StringReader(""));
		assertFalse(l.hasNext());
	}
}
