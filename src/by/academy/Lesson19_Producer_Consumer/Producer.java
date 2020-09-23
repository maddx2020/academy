package by.academy.Lesson19_Producer_Consumer;

public class Producer implements Runnable {

	private Store store;

	public Producer(Store store) {
		this.store = store;
	}

	public void run() {
		for (int i = 1; i < 30; i++) {
			store.put();
		}
	}

}
