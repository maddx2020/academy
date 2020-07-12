package by.academy.Lesson4;

public class Vino extends Product1 {

	public Vino(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	protected final int finalDisount() {

		if (quantity < 5) {
			discount = 10;
		}else {
			if (quantity > 5 && quantity <= 10) {
				discount = 15;
			}
			else {
			discount = 20;
		}
		}
			return discount;
	

	}
}
