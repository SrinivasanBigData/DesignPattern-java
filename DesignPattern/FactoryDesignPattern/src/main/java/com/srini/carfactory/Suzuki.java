package com.srini.carfactory;

public class Suzuki extends Car {
	private String companyName;
	public String model;
	public int speed;

	public Suzuki(String model, int speed) {
		this.companyName = "Suzuki";
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
