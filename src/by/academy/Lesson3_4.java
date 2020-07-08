package by.academy;

import java.util.Scanner;

public class Lesson3_4 {
	int i;

	public static void main(String[] args) {
		int number = 0;
		int mcount=0,pcount=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сколько чисел будете вводить с клавиатуры: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Введите   " + (i + 1) + " число: ");
			number = sc.nextInt();
			if (number>0) {
				pcount++;
			}
			else{
				if(number<0) {
					mcount++;
			}
				else
					count++;
		}
		
		}
		System.out.println("Количество положительных чисел: " + pcount + " Количество отрицательных чисел: " + mcount + " Количество чисел c 0: " + count);
	}
	
}
