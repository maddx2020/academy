import java.util.Scanner;

public class Lesson2_7 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите первое число: ");
			int n1 = sc.nextInt();
			System.out.print("Введите второе число: ");
			int n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("Большее число " + n1 + " Меньшее число " + n2);
			} else {
				System.out.println("Большее число " + n2 + " Меньшее число " + n1);
			}

			double z = (double)(n1 + n2) / 2;
			System.out.println("Среднее арифметическое: " + z);
		}

	}

}
