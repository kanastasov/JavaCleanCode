package com.kirilanastasov.dip.calculatorDemo;

public class TestCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addCalculator();
		substractCalculator();
		multipleCalculator();
		divideCalculator();
	}

	
	public static void addCalculator() {
		Calculator calculator = new Calculator(new AddCalculationOperator());
		double result = calculator.solve(1, 2);
		System.out.println(result + " addCalculator");
	}
	
	public static void substractCalculator() {
		Calculator calculator = new Calculator(new SubtractCalculationOperation());
		double result = calculator.solve(3, 1);
		System.out.println(result + " substractCalculator");
	}
	
	public static void multipleCalculator() {
		Calculator calculator = new Calculator(new MultiplyCalculationOperation());
		double result = calculator.solve(6, 9);
		System.out.println(result + " multipleCalculator");
	}
	
	public static void divideCalculator() {
		Calculator calculator = new Calculator(new DivideCalculationOperation());
		double result = calculator.solve(12, 4);
		System.out.println(result + " divideCalculator");
	}
	

}
