package info.wysocki.study.mrjp.calculus.lexer;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;


public class Lexer implements Iterator<Lexem> {
	private Reader reader;
	protected Integer currentChar;

	public Lexer(Reader reader) throws LexerException {
		this.reader = reader;
		getChar();
	}

	private void getChar() throws LexerException {
		try {
			currentChar = reader.read();
		} catch (IOException e) {
			throw new LexerException("input/output error");
		}
	}

	@Override
	public boolean hasNext() {
		return currentChar != -1;
	}

	@Override
	public Lexem next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
