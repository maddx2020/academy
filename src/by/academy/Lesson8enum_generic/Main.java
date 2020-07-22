package by.academy.Lesson8enum_generic;

public class Main {

	public static void main(String[] args) {

		Box<Beer> box = new Box<Beer>();
		box.setItem(new Beer());

		Box<Chips> box1 = new Box<Chips>();
		box1.setItem(new Chips());
	}

}
