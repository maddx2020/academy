package by.academy.Lesson4;

import by.academy.Lesson5.Product;

public class Main {

	public static void main(String[] args) {
		Product1 product1 = new Product1("���������", 11, 1.5);
		product1.bill();

		System.out.println("");
		System.out.println("");
		System.out.println("");
				
		Vino caberne = new Vino("�������", 10, 20);
		caberne.bill();
		System.out.println("");
		System.out.println("");
		System.out.println("");		
		Eda bread = new Eda("�����", 2, 5.5,"����������"); 
		bread.bill();
		System.out.println("");
		
	}

}
