package by.academy.H2.OOP.Ex8;

public class Vet {

	static void treatAnimal(Animal animal) {
		System.out.println("Класс животного: " + animal.getClas());
		System.out.println("Местонахождение: " + animal.getLocation());
		System.out.println("В рацион входит: " + animal.getFood());
	}

}
