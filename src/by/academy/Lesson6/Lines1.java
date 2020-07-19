package by.academy.Lesson6;

public class Lines1 {

	public static void main(String[] args) {

		String a = "Какойто текст11111111";
		String b = "Теперь уже новый тек";
		String c = "Вот новый текст11111111";

		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());


		if (a.length() > b.length()) {
			if (b.length() > c.length()) {
				System.out.println("Самая длинная строка :" + a);
				System.out.println("Самая короткая строка :" + c);
			} else {
				if (a.length() > c.length()) {
					System.out.println("Самая длинная строка :" + a);
					System.out.println("Самая короткая строка :" + b);
				}else {
				System.out.println("Самая длинная строка :" + c);
				System.out.println("Самая короткая строка :" + b);
			}
		} else {
			if (b.length() > c.length()) {
				if (a.length() > c.length()) {
					System.out.println("Самая длинная строка :" + b);
					System.out.println("Самая короткая строка :" + c);
				} else {
					System.out.println("Самая длинная строка :" + b);
					System.out.println("Самая короткая строка :" + a);
				}
			} else {
				System.out.println("Самая длинная строка :" + c);
				System.out.println("Самая короткая строка :" + a);
			}
		}
	}

}
