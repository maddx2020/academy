package by.academy.Lesson6;

import java.util.Scanner;

public class Lines2 {
	public static void main(String[] args) {
		String line = new String();
		Scanner str = new Scanner(System.in);
		int n = 0;
		String[] arrayLines;

		System.out.println("Сортировка строк в порядке возрастания(убывания).Для окончания - ввод пустой строки");
		System.out.println("Введите n строк для сортировки");

		do {
			System.out.print("Введите строку: ");
			arrayLines = new String[4];
			arrayLines[n] = str.nextLine();
			n++;
		} while (arrayLines[n-1].length() != 0);

		for (String s : arrayLines) {
			System.out.println(s);
		}

		str.close();
	}

}
