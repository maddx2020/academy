package by.academy.Lesson5;

public class Deal {
	private User seller;
	private User buyer;
	private Product[] products;

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		System.out.println("Конструктор DEAL");
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;

	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getSeller() {
		return seller;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Product[] getProducts() {
		return products;
	}
}
