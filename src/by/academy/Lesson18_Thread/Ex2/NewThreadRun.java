package by.academy.Lesson18_Thread.Ex2;

public class NewThreadRun implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<100;i++) {
			if(i%10==0) {
				
				System.out.println(Thread.currentThread().getName() + " - " + i);
			}
		}
		
	}
	

}
