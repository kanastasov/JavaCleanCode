package com.kirilanastasov.dip.calculatorDemo;

public class AddCalculationOperator implements CalculatorOperation {

	@Override
	public double calculate(double firstValue, double secondValue) {
		return firstValue + secondValue;
	}

}