package com.srini.car;

public class Test {
	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		Car car = factory.getCar();
		System.out.println(car.iengine.getEngineType());
	}
}
