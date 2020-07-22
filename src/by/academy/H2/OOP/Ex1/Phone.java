package by.academy.H2.OOP.Ex1;

import java.io.Serializable;

public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int number;
	protected String model;
	protected double weight;
	protected String name;
//	protected Numbers[] numbers;

	public Phone() {
		super();
	}

	public Phone(int number, String model) {
		super();
		this.number = number;
		this.model = model;
	}

	protected Phone(int number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	protected int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected double getWeight() {
		return weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}

	void receiveCall(String name) {
		this.name = name;
		System.out.println("Call " + name);

	}

	protected void receiveCall(String name, int number) {
		this.name = name;
		this.number = number;
		System.out.println("Call " + name + ", phone number " + number);

	}

	void sendMessage(int... numbers) {
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

}
