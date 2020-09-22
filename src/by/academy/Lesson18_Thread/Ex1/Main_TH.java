package by.academy.Lesson18_Thread.Ex1;

public class Main_TH {

	public static void main(String[] args) {
		
		
		NewThread nt = new NewThread();
		NewThread nt1 = new NewThread();
		nt.start();
		nt1.start();

	}

}
