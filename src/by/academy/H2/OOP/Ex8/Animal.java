package by.academy.H2.OOP.Ex8;

public class Animal {

	private String food;
	private String location;
	private String clas;

	public Animal() {
		super();
	}

	public Animal(String clas, String food, String location) {
		super();
		this.clas = clas;
		this.food = food;
		this.location = location;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocstion(String location) {
		this.location = location;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public void makeNoise() {

	}

	public void eat() {

	}

	public void sleep() {
		System.out.println(" cладко спит");
	}

}
