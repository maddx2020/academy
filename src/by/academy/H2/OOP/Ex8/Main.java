package by.academy.H2.OOP.Ex8;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog("Собака", "Кости", "Будка", "Мухтар");
		Cat cat = new Cat("Кого поймал, того и съел", "Кот", "Где упал, там и спит", "Жирный");
		Horse horse = new Horse("Лошадь", "Овес", "Стойло", "Вороной");

		Animal[] animals = { dog, cat, horse };

		for (Animal a : animals) {
			Vet.treatAnimal(a);
			a.eat();
			a.makeNoise();

			System.out.println();
		}
		System.out.print(cat.getSize() + " " + cat.getClas());
		cat.sleep();
	}

}
