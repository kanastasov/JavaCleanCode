package com.kirilanastasov.dip.calculatorDemo;

public class Calculator {

	CalculatorOperation operation;
	
	
	
	public Calculator(CalculatorOperation operation) {
		super();
		this.operation = operation;
	}
	
	
	public double solve(double firstValue, double secondValue) {
		return operation.calculate(firstValue, secondValue);
	}

	public double add(double firstValue, double secondValue) {
		return firstValue + secondValue;
	}

	public double subtract(double firstvalue, double secondValue) {
		return firstvalue - secondValue;
	}
	
	
	
}