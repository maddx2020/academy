package by.academy.Lesson13;

import java.util.function.Predicate;

public class Task5 {

	public static void main(String[] args) {


		Predicate<String> letIn = str -> ((str.charAt(0) == ('J')) || (str.charAt(0) == ('N'))) && (str.charAt(str.length()-1) ==('A'));

		System.out.println(letIn.test("JANETTA"));


	}

}
