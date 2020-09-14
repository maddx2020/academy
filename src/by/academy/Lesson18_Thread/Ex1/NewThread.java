package by.academy.Lesson18_Thread.Ex1;

public class NewThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("ABC");
		}
		
	}
	

}
