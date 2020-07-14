package by.academy.Lesson5;

public class Vino extends Apple {
	int discount;

	public Vino(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	@Override
	public int discount() {
		if (quantity < 3) {
			discount = 10;
		} else {
			if (quantity >= 5 && quantity <= 10) {
				discount = 18;
			} else {
				discount = 25;
			}
		}
		return discount;

	}

}
