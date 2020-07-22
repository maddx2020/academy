package by.academy.H2.OOP.Ex2;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String fullName;
	protected int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void move() {
		System.out.println("Person " + fullName + " move");
	}

	public void speak() {
		System.out.println("Person " + fullName + " speak");
	}

}
