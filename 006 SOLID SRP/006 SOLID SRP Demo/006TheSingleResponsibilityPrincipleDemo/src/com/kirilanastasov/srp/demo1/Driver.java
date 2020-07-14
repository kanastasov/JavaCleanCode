package com.kirilanastasov.srp.demo1;

import java.math.BigDecimal;
import java.util.Date;

public class Driver {
	private String driverId;
	private String driverName;
	private String address;
	private Date dateOfJoining;
	private Owner owner;
	private DriverTaxes taxes;

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", address=" + address
				+ ", dateOfJoining=" + dateOfJoining + ", owner=" + owner + ", taxes=" + taxes + "]";
	}

}