package by.academy;

public class Lesson3 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		int mass[] = new int[10];
		for (i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 10);
			System.out.print(mass[i]);
			sum += mass[i];
		}
		System.out.println("");
		System.out.println("среднее арифметическое: " + sum / 10);
		for (i = 0; i < mass.length; i++) {
			if (mass[i] < sum / 10)
				System.out.print(mass[i]);
		}
	}

}
