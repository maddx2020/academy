package by.academy.Lesson5;

public class Main {
	public static void main(String[] args) {

		User user1 = new User("����");
		User user2 = new User("����");

		Product prod1 = new Product("����", 1, 1.40);
		Product prod2 = new Product("������", 3, 2.11);
		Apple prod3 = new Apple("������", 2, 1.50);
		Vino prod4 = new Vino("777", 5, 8);
		Chees prod5 = new Chees("������", 5, 3);

		Product[] products = { prod1, prod2, prod3, prod4, prod5 };

		Deal deal = new Deal(user1, user2, products);

		System.out.println(deal.fullPrice());

		Product[] products1 = { prod4, prod5 };
		Deal deal1 = new Deal(user1, user2, products1);

		System.out.println(deal1.fullPrice());

		System.out.println(deal1.fullPrice() + deal.fullPrice());
	}

}
