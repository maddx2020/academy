package by.academy.Lesson5.OOP.Ex2;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	private int age;

	public Person() {
		super();
	}

	private Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	private String getFullName() {
		return fullName;
	}

	private void setFullName(String fullName) {
		this.fullName = fullName;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	void move() {
		System.out.println("Person " + fullName + " move");
	}

	void speak() {
		System.out.println("Person " + fullName + " speak");
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.fullName = "Bill Colins";
		person.move();
		person.speak();

		Person person1 = new Person("Tom Spenser", 29);
		person1.move();
		person1.speak();
		person1.getAge();

	}
}
