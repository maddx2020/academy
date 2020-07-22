package by.academy.H2.OOP.Ex7.vehicles;

import by.academy.H2.OOP.Ex7.details.Engine;
import by.academy.H2.OOP.Ex7.professions.Driver;

public class Car {

	private String marka;
	private String carClass;
	private int weight;
	private Driver driver;
	private Engine engine;

	public Car() {
		super();
	}

	public Car(String marka, String carClass, int weight, Driver driver, Engine engine) {
		super();
		this.marka = marka;
		this.carClass = carClass;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Driver getDriver() {
		return driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void start() {
		System.out.println("Поехали !!!");
	}

	public void stop() {
		System.out.println("Останавливаемся");
	}

	public void turnRight() {
		System.out.println("Поворот направо");
	}

	public void turnLeft() {
		System.out.println("Поворот налево");
	}

	public void printInfo() {
		System.out.println("Марка: " + getMarka() + "\nКласс: " + getCarClass() + "\nВес: " + getWeight() + " кг");
		System.out.println("Фирма производитель двигателя: " + getEngine().getCompany() + "\nMощность: "
				+ getEngine().getPower() + " л.с.");
		System.out
				.println("Водитель: " + getDriver().getPerson().getFullName() + ", " + getDriver().getPerson().getAge()
						+ " лет" + "\nCтаж вождения: " + getDriver().getExperience() + " лет");
	}
}
