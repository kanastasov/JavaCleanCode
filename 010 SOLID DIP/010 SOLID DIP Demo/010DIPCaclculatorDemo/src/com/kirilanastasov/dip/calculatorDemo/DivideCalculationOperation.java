package com.kirilanastasov.dip.calculatorDemo;

public class DivideCalculationOperation implements CalculatorOperation {

	@Override
	public double calculate(double firstValue, double secondValue) {
		if (secondValue == 0)
			return 0;
		return firstValue / secondValue;
	}

}
