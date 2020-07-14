package com.kirilanastasov.srp.demo1;

public class Owner {
	private String ownerId;
	private String newBusses;

	public Owner() {

	}

	public String getNewBusses() {
		return newBusses;
	}

	public void setNewBusses(String newBusses) {
		this.newBusses = newBusses;
	}
	
	public String buyNewBuses() {
		return newBusses + "logic about new buses ";
	}

}