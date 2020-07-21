package by.academy.H2.OOP.Ex8;

public class Cat extends Animal {

	private String size;

	public Cat() {
		super();
	}

	public Cat(String clas, String food, String locstion, String size) {
		super(food, clas, locstion);
		this.size = size;

	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void makeNoise() {
		System.out.println("Громко мурлычет");
	}

	@Override
	public void eat() {
		System.out.println("Лакомится украденой котлетой");
	}

}
