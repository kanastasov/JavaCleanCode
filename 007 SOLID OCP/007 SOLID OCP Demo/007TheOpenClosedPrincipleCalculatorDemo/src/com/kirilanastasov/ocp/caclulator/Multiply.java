package com.kirilanastasov.ocp.caclulator;

public class Multiply implements IOperation {
	private double firstOperation;
	private double secondOperation;
	private double result = 0.0;

	public Multiply(double firstOperation, double secondOperation) {
		super();
		this.firstOperation = firstOperation;
		this.secondOperation = secondOperation;
	}

	public double getFirstOperation() {
		return firstOperation;
	}

	public void setFirstOperation(double firstOperation) {
		this.firstOperation = firstOperation;
	}

	public double getSecondOperation() {
		return secondOperation;
	}

	public void setSecondOperation(double secondOperation) {
		this.secondOperation = secondOperation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Addition [firstOperation=" + firstOperation + ", secondOperation=" + secondOperation + ", result="
				+ result + "]";
	}

	@Override
	public void performOperation() {
		result = firstOperation * secondOperation;
	}

}
