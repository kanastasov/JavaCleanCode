package com.kirilanastasov.dip.calculatorDemo;

public class SubtractCalculationOperation implements CalculatorOperation {

	@Override
	public double calculate(double firstValue, double secondValue) {
		return firstValue - secondValue;
	}

}
