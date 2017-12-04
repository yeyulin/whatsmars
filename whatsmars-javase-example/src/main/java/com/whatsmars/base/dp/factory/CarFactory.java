package com.whatsmars.base.dp.factory;

public class CarFactory extends VehicleFactory {

	@Override
	Moveable create() {
		return new Car();
	}
}
