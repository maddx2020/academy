
public class lesson4 {

	public static void main(String[] args) {
		int number = 2807;
		int count = 0;
		System.out.println("����� " + number);
		for (int i = 1; i <= number; i++) {
			
			if (number % i == 0) {
				count++;
				
				System.out.println("�������� �� " +  i);
			}		
		}
		if (count == 2)
			System.out.println("����� ������� ! ");
		else
			System.out.println("����� �� ������� ! ");
	}

}
