package by.academy.Lesson5;

public class Vino extends Product {
	
	int discount;

	public Vino(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	public int discount() {

		if (quantity < 5) {
			discount = 10;
		} else {
			if (quantity >= 5 && quantity <= 10) {
				discount = 15;
			} else {
				discount = 20;
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
