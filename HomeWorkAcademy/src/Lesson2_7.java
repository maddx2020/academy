import java.util.Scanner;

public class Lesson2_7 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("������� ������ �����: ");
			int n1 = sc.nextInt();
			System.out.print("������� ������ �����: ");
			int n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("������� ����� " + n1 + " ������� ����� " + n2);
			} else {
				System.out.println("������� ����� " + n2 + " ������� ����� " + n1);
			}

			double z = (double)(n1 + n2) / 2;
			System.out.println("������� ��������������: " + z);
		}

	}

}
