package com.kirilanastasov.dip.calculatorDemo;

public class MultiplyCalculationOperation implements CalculatorOperation{

	@Override
	public double calculate(double firstValue, double secondValue) {
		return firstValue * secondValue;
	}

}
