package by.academy.Produkt;

public class Product {

	private double price;
	private double discount;
	private String name;
	private int quantity;

	public Product(String name,int quantity,double price) {
	super();
	this.name = name;
	this.quantity = quantity;
//	this.discount = discount;
	this.price=price;
	}
	
	
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price*quantity/100*(100-getDiscount());
	}

//	public void setDiscount(double discount) {
//		this.discount = discount;
//	}

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

	public static void main(String[] args) {

	}
}
