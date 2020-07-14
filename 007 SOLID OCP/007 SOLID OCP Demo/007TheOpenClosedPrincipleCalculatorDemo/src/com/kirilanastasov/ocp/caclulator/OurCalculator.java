package com.kirilanastasov.ocp.caclulator;

import java.security.InvalidParameterException;

public class OurCalculator implements ICalculator {

	@Override
	public void calculate(IOperation operation) {
		
		if(operation == null) {
			throw new InvalidParameterException("operation can not be null");
		}
		
		operation.performOperation();
	}

}