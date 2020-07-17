package by.academy.Lesson5.OOP.Ex11;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();

		Rectangle rect = new Rectangle(0,0,5,5);

		Shape[] shapes = { circle, rectangle };

//		for (Shape i : shapes) {
//			i.drow();
//		}

	rectangle.drow();
	
	
	}

}
