package by.academy.Lesson6;

public class Lines1 {
	
	public static void main(String [] args) {
		
		String a = "Какойто текст";
		String b = "Теперь уже новый текст";
		String c  = "Вот новый текст";
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		
		
		if (a.length()>b.length()) {
			System.out.println("Самая длинная строка :"+a);
		}else{
			if (b.length()>c.length()) {
				System.out.println("Самая длинная строка :"+b);
			}else {
				System.out.println("Самая длинная строка :"+c);
			}
		}
		
		
	}
	

}
