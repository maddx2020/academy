package by.academy.Lesson5;

public class Main {
	public static void main(String[] args) {

		User user1 = new User("����");
		User user2 = new User("����");

		Product prod1 = new Product("����", 1, 1.40);
		Product prod2 = new Product("������", 3, 2.11);

		Product[] products = { prod1, prod2 };

		Deal deal = new Deal(user1, user2, products);

		System.out.println(deal.fullPrice());

	}

}
