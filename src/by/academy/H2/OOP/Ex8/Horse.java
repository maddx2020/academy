package by.academy.H2.OOP.Ex8;

public class Horse extends Animal {

	private String color;

	public Horse() {
		super();
	}

	public Horse(String clas, String food, String locstion, String color) {
		super(clas, food, locstion);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void makeNoise() {
		System.out.println("Резво скачет");
	}

	@Override
	public void eat() {
		System.out.println("Лошадка жует травинку");
	}

}
