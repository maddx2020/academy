package by.academy.Lesson5;

public class Main {
	public static void main(String[] args) {

		User user1 = new User("Вася");
		User user2 = new User("Леха");

		Product prod1 = new Product("хлеб", 1, 1.40);
		Product prod2 = new Product("молоко", 3, 2.11);
		Apple prod3 = new Apple("яблоко", 2, 1.50);
		Vino prod4 = new Vino("777", 5, 8);
		Chees prod5 = new Chees("дружба", 5, 3);

		Product[] products = { prod1, prod2, prod3, prod4, prod5 };

		Deal deal = new Deal(user1, user2, products);

		System.out.println(deal.fullPrice());

		Product[] products1 = { prod4, prod5 };
		Deal deal1 = new Deal(user1, user2, products1);

		System.out.println(deal1.fullPrice());

		System.out.println(deal1.fullPrice() + deal.fullPrice());
	}

}
