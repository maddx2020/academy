package by.academy.lesson2;
import java.util.Scanner;

public class Lesson2_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введенное число: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Является ЧЕТНЫМ");
		} else {
			System.out.println("Является НЕЧЕТНЫМ");
		}
	}

}
