package by.academy.Lesson13;

import java.util.function.Predicate;

public class Task3 {

	public static void main(String[] args) {
	
		Predicate<String> pr = str->!str.isEmpty();
		
		System.out.println(pr.test(""));

	}

}
