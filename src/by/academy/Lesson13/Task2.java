package by.academy.Lesson13;

import java.util.function.Predicate;

public class Task2 {
	public static void main(String[] args) {
		
		Predicate<String> pr = s -> s != null;
		System.out.println(pr.test("test"));
	}
}
