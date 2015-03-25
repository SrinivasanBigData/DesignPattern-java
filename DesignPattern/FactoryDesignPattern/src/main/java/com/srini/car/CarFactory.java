package com.srini.car;

public class CarFactory implements ICarFactory {

	@Override
	public Car getCar() {
		Iengine iengine = new TurboEngine();
		return new Car(iengine);
	}

}
