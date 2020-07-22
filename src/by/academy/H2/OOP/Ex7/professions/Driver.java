package by.academy.H2.OOP.Ex7.professions;

import by.academy.H2.OOP.Ex2.Person;

public class Driver extends Person {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private int experience;
	private Person person;

	public Driver() {
		super();
	}

	public Driver(Person person, int experience) {
		super();
		this.experience = experience;
		this.person = person;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
