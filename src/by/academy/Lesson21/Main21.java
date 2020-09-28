package by.academy.Lesson21;

public class Main21 {

	public static void main(String[] args) {

		OrderItem ordItem = new OrderItem(16.4, 3);
		Address adr = new Address(438, "Odoevskog", "Minsk", "220015");
		Order order = new Order("Pizza-18", ordItem);
		Customer customer = new Customer("Max", adr);

		customer.createOrder(order);
		 
	}

}
