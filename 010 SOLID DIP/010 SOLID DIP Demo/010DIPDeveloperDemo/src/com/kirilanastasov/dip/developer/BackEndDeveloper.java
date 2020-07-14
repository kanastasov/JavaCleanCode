package com.kirilanastasov.dip.developer;

public class BackEndDeveloper implements Developer {

	public void writeJava() {
		System.out.println("Java");
	}

	@Override
	public void develop() {
		writeJava();
	}
}
