package by.academy.H2.OOP.Ex1;

public class Main {
	public static void main(String[] args) {

		Phone phone = new Phone();

		phone.model = "Xiaomi";
		phone.weight = 214.59;
		phone.number = 1502356;
		System.out.println(phone.model + " " + phone.weight + " " + phone.number);
		System.out.println("");

		Phone nokia = new Nokia(150_278_23, "Nokia", 121.1);
		Phone samsung = new Samsung(111_234_11, "Samsung", 150);
		Phone apple = new Apple(100_118_58, "Apple", 114.14);

		System.out.println("Phone model is " + nokia.getModel() + ", weight is " + nokia.getWeight()
				+ ", phone number is " + nokia.getNumber());
		System.out.println("Phone model is " + samsung.getModel() + ", weight is " + samsung.getWeight()
				+ ", phone number is " + samsung.getNumber());
		System.out.println("Phone model is " + apple.getModel() + ", weight is " + apple.getWeight()
				+ ", phone number is " + apple.getNumber());
		System.out.println("");

		nokia.receiveCall("Bob");
		System.out.println("phone number " + nokia.getNumber());
		samsung.receiveCall("Tom");
		System.out.println("phone number " + samsung.getNumber());
		apple.receiveCall("Max");
		System.out.println("phone number " + apple.getNumber());
		System.out.println("");

		nokia.receiveCall("Tomas", 11_11_111);
		System.out.println("");
		nokia.sendMessage(101, 102, 103, 104, 105);
	}

}
