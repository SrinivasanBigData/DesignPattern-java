package com.srini.carfactory;

public class Toyota extends Car {

	private String companyName;
	public String model;
	public int speed;

	public Toyota(String model, int speed) {
		this.companyName = "Toyota";
		this.model = model;
		this.speed = speed;
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public int speed() {
		return speed;
	}

}
