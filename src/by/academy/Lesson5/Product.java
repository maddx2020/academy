package by.academy.Lesson5;

public class Product {

	private String name;
	private int quantity;

	public Product() {
		super();
	}

	public Product[](String name, int quantity) {
		super();
		System.out.println("Конструктор Product");
		this.name = name;
		this.quantity = quantity;
	}

	public void getName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public String result() {
		String s =name + " " + quantity;
		return s;
	}
}
