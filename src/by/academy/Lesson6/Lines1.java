package by.academy.Lesson6;

public class Lines1 {
	
	public static void main(String [] args) {
		
		String a = "������� �����";
		String b = "������ ��� ����� �����";
		String c  = "��� ����� �����";
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		
		
		if (a.length()>b.length()) {
			System.out.println("����� ������� ������ :"+a);
		}else{
			if (b.length()>c.length()) {
				System.out.println("����� ������� ������ :"+b);
			}else {
				System.out.println("����� ������� ������ :"+c);
			}
		}
		
		
	}
	

}
