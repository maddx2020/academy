package by.academy.Lesson4;

public class Product1 {

	private double finSumm;
	private double price;
	private String name;
	protected int quantity;
	protected int discount;

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
		return 1;
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

	public int getQuantity() {
		return quantity;
	}

	void bill() {
		System.out.println("Ваш чек:");
		System.out.println("Наименование покупки:   " + name);
		System.out.println("Количество:   " + quantity);
		finalDisount();
		System.out.println("Итоговая скидка:   " + discount);
		System.out.println("");
		finSumm();
		System.out.print("Общая сумма покупки:   " + finSumm);

	}

	protected int finalDisount() {

		if (quantity < 10) {
			discount = 5;
		} else {
			discount = 10;
		}
		return discount;
	}

	final double finSumm() {

		finSumm = price * quantity * (100 - discount) / 100;
		return finSumm;
	}

}
