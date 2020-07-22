package by.academy.H2.OOP.Ex7.vehicles;

import by.academy.H2.OOP.Ex7.details.Engine;
import by.academy.H2.OOP.Ex7.professions.Driver;

public class SportCar extends Car {

	private double speed;

	public SportCar() {
		super();
	}

	public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine, double speed) {
		super(marka, carClass, weight, driver, engine);
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Максимальная скорость: " + getSpeed() + " км/ч");
	}

}
