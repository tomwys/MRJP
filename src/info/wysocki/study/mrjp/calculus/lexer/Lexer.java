package info.wysocki.study.mrjp.calculus.lexer;

import java.io.Reader;
import java.util.Iterator;


public class Lexer implements Iterator<Lexem> {
	public Reader reader;
	public Lexer(Reader reader) {
		this.reader = reader;
	}

	@Override
	public boolean hasNext() {
		return false;
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