package by.academy.Lesson5;

public class Main {
	public static void main(String[] args) {

		User seller = new User("Max");
		System.out.println(seller.getName());
		
		User buyer = new User("Leo");
		System.out.println(buyer.getName());
		
		Product[] products = new Product[3];
		
		Deal deal = new Deal(seller,buyer,products);


	}

	

}
