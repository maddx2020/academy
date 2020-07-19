package by.academy.Lesson7;

public class Reg2 {
	public static void main(String[] args) {

		String str = "Имеется строка с текстом. GHjkj, hhhhh, opoo ";

		String[] arr = str.split("[\\s+]");

		System.out.println(arr.length);

	}
}
