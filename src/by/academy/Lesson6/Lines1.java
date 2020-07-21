package by.academy.Lesson6;

import java.util.Scanner;

public class Lines1 {

	public static void main(String[] args) {

		String line = new String();
		String minLine = new String();
		String maxLine = new String();
		int maxLength = 0;
		int minLength = Integer.MAX_VALUE;

		Scanner str = new Scanner(System.in);
		System.out.println("Введите n строк для нахождения Большей и Меньшей по длине(окончание - пустая строка)");
		do {
			System.out.print("Введите строку: ");
			line = str.nextLine();

			if (line.length() > maxLength) {
				maxLength = line.length();
				maxLine = line;
			}
			if (line.length() != 0 && line.length() <= minLength) {
				minLength = line.length();
				minLine = line;
			}
		} while (line.length() != 0);
		if (maxLength == minLength) {
			System.out.println("Одинаковые строки: " + maxLine + ", " + minLength + " символов.");
		} else {
			System.out.println("Самая длинная строка - " + maxLine + ", " + maxLength + " символов.");
			System.out.println("Самая короткая строка - " + minLine + ", " + minLength + " символов.");
		}

		str.close();
	}

}
