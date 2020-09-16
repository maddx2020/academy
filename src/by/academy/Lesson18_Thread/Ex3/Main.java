package by.academy.Lesson18_Thread.Ex3;

public class Main {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder();
		sb1.append("XXX");
		Ex3 e1 = new Ex3(sb1);
		Ex3 e2 = new Ex3(sb1);
		Ex3 e4 = new Ex3(sb1);
		
//		Ex3 e1 = new Ex3(new StringBuilder('A'));
//		Ex3 e2 = new Ex3(new StringBuilder('C'));
		
		
		
		e1.start();
		e2.start();
		
		e4.start();
	}

}
