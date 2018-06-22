package com.oo.patterns.structural;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

interface Dosa {
	String getDescription();
}

class RiceDosa implements Dosa {
	@Override
	public String getDescription() {
		return "rice-dosa";
	}
}

class RagiDosa implements Dosa {
	@Override
	public String getDescription() {
		return "ragi-dosa";
	}
}

class MasalaDosaDecorator implements Dosa {

	private Dosa dosa;

	public MasalaDosaDecorator(Dosa dosa) {
		this.dosa = dosa;
	}

	@Override
	public String getDescription() {
		return dosa.getDescription() + " with masala";
	}

}

class CheeseDosaDecorator implements Dosa {

	private Dosa dosa;

	public CheeseDosaDecorator(Dosa dosa) {
		this.dosa = dosa;
	}

	@Override
	public String getDescription() {
		return dosa.getDescription() + " with cheese";
	}

}

public class Decorator_Ex {

	public static void main(String[] args) {

		Dosa dosa = new RagiDosa();
		dosa = new MasalaDosaDecorator(dosa);
		dosa = new CheeseDosaDecorator(dosa);

		System.out.println(dosa.getDescription());

		// IO -api based on decorator-pattern
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		reader = new BufferedReader(reader);

	}

}
