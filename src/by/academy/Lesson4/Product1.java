package by.academy.Lesson4;

public class Product1 {

	private double price;
	private String name;
	private int quantity;

	public Product1() {
		super();
	}
	public Product1(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return 10;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int getQuantity() {
		return quantity;
	}
	
	void bill() {
		System.out.println("Итоговая сумма по чеку: ");
		
	
	
	
	}

}
