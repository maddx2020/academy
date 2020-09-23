package by.academy.Lesson18_Thread.Ex2;

public class Main_TH_RUN {

	public static void main(String[] args) {

		NewThreadRun ntr1 = new NewThreadRun();
		NewThreadRun ntr2 = new NewThreadRun();
		NewThreadRun ntr3 = new NewThreadRun();
		
		Thread t1 = new Thread(ntr1);
		Thread t2 = new Thread(ntr2);
		Thread t3 = new Thread(ntr3);

		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t3.start();
		

	}

}
