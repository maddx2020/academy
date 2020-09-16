package by.academy.Lesson18_Thread.Ex3;

public class Ex3 extends Thread {


	private StringBuilder sb;



	Ex3(StringBuilder sb) {
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 100; i++) {
				sb.append("X");
				System.out.println(sb);
			}
			System.out.println((sb.append((char)('X'+1))));
		}
	}

}
