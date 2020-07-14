package com.kirilanastasov.srp.demo1;

import java.math.BigDecimal;

public class DriverTaxes {
	private String driverTaxesId;
	private BigDecimal companyTaxes;

	public DriverTaxes() {
	}

	public BigDecimal calculateTaxesForCompany() {
		return companyTaxes;
	}
}