package by.academy.Lesson5.OOP.Ex11;

public class Circle extends Shape {

	private int x1, x2;
	private int y1, y2;

	double r = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

	public Circle() {
		super();
	}
	
	public Circle(int x1, int y1,int x2, int y2) {
		super();
		this.x1=x1;
		this.y1=y1;
		this.x2 = x2;
		this.y2=y2;
	}
	
	

	@Override
	void drow() {

	}

}
