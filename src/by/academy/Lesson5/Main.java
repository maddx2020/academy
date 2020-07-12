package by.academy.Lesson5;

public class Main {
	public static void main(String[] args) {

		User user1 = new User("����");
		User user2 = new User("����");

		Product prod1 = new Product("����", 1, 1.40);
		Product prod2 = new Product("������", 3, 2.11);
		Apple prod3 = new Apple ("������", 2, 1.50);
		Vino prod4 = new Vino ("777", 5, 8);
		Chees prod5 = new Chees("������",5,3);

		Product[] products = { prod1, prod2, prod3,prod4, prod5 };

		Deal deal = new Deal(user1, user2, products);

		
		System.out.println("apple discount "+prod3.discount());
		System.out.println("apple full price "+prod3.fullSum());
		System.out.println("");
		System.out.println("vino discount "+prod4.discount());
		System.out.println("vino full price "+prod4.fullSum());
		System.out.println("");
		System.out.println("chees discount "+prod5.discount());
		System.out.println("chees full price "+prod5.fullSum());
		
		
		System.out.println(deal.fullPrice());

	}

}
