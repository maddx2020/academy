package by.academy.lesson3;

import java.util.Scanner;

public class Lesson3_2 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �����: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("����� ����� ����� " + sum);
		sc.close();
	}

}
