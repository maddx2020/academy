package by.academy.H2.OOP.Ex7;

import by.academy.H2.OOP.Ex2.Person;
import by.academy.H2.OOP.Ex7.details.Engine;
import by.academy.H2.OOP.Ex7.professions.Driver;
import by.academy.H2.OOP.Ex7.vehicles.Lorry;
import by.academy.H2.OOP.Ex7.vehicles.SportCar;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person("Вася Чемоданов", 37);
		Person person2 = new Person("Саша Самолетов", 25);

		Driver driver1 = new Driver(person1/* person1.getFullName() */, 15);
		Driver driver2 = new Driver(person2/* person2.getFullName() */, 5);

		Engine engine1 = new Engine(570, "BMW");
		Engine engine2 = new Engine(380, "Volvo");

		SportCar sportcar = new SportCar("BMW", "Кроссовер", 3000, driver1, engine1, 330);
		Lorry lorry = new Lorry("Volvo", "Рефрижератор", 11000, driver2, engine2, 20000);

		sportcar.start();
		lorry.stop();
		sportcar.turnLeft();
		lorry.turnRight();
		System.out.println();
		sportcar.printInfo();
		System.out.println();
		lorry.printInfo();

	}

}
