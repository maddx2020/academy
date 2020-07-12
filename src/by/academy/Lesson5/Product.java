package by.academy.Lesson5;

public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product() {
		super();
	}

	public Product(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double fullSum() {
		return price * quantity;

	}
}
