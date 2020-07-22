package by.academy.H2.OOP.Ex2;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.fullName = "Bill Colins";
		person.age = 27;
		person.move();
		person.speak();

		Person person1 = new Person("Tom Spenser", 29);
		person1.move();
		person1.speak();

	}

}
