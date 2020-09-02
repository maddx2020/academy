package by.academy.Lesson13.Task1;

import java.util.HashMap;
import java.util.Map;

public class Task10 {

	public static void main(String[] args) {

		Map<String, MathOperation> calc = new HashMap<String, MathOperation>();
		calc.put("+", (a, b) -> a + b);
		calc.put("-", (a, b) -> a + b);
		calc.put("/", (a, b) -> a + b);
		calc.put("*", (a, b) -> a + b);

		System.out.println(calculate(1, 2, calc.get("+")));

	}

	public static double calculate(double a, double b, MathOperation operation) {
		return operation.calc(a, b);
	}

}
