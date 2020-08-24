package by.academy.Lesson13.Task1;

import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {
		Predicate<String> notNull = n -> n != null;
		Predicate<String> notEmpty = n -> !n.isEmpty();
		
		System.out.println(notNull.and(notEmpty).test("test"));

	}

}
