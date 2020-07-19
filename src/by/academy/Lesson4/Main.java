package by.academy.Lesson4;



public class Main {

	public static void main(String[] args) {
		Product1 product1 = new Product1("макарошки", 11, 1.5);
		product1.bill();

		System.out.println("");
		System.out.println("");
		System.out.println("");
				
		Vino caberne = new Vino("Каберне", 10, 20);
		caberne.bill();
		System.out.println("");
		System.out.println("");
		System.out.println("");		
		Eda bread = new Eda("Батон", 2, 5.5,"Хлебобулка"); 
		bread.bill();
		System.out.println("");
		
	}

}
