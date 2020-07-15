package by.academy.Lesson5.OOP.Ex11;

public class Main {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		Shape[] shapes = { circle, rectangle };

		for (Shape i : shapes) {
			i.drow();
		}

	}

}
