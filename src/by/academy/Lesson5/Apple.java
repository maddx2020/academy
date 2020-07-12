package by.academy.Lesson5;

public class Apple extends Product {

	int discount;

	public Apple(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	public int discount() {

		if (quantity < 5) {
			discount = 1;
		} else {
			if (quantity >= 5 && quantity <= 10) {
				discount = 3;
			} else {
				discount = 5;
			}
		}
		return discount;

	}

	@Override
	public double fullSum() {
		discount();
		return price * quantity * (100 - discount) / 100;
	}

}