package by.academy.lesson3;

import java.util.Scanner;

public class Lesson3_3 {

	public static void main(String[] args) {
		int sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.println("Произведение чисел равна " + sum);
		sc.close();
	}

}
