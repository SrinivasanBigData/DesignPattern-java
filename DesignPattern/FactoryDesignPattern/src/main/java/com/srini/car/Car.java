package com.srini.car;

public class Car implements Ivehicle {
	public Iengine iengine;

	public Car(Iengine iengine) {
		this.iengine = iengine;
	}

	@Override
	public int wheelsDrive() {
		return 2;
	}

	@Override
	public String model() {
		return "Honda i10";
	}

	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public Iengine iengine() {
		return iengine;
	}

}
