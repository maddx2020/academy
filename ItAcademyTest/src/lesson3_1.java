
public class lesson3_1 {
	public static void main(String[] args) {
		int m = 31;
//		int m = 3412;
//		int m = 102;
		if (m % 10 == 1 && m % 100 != 11)
			System.out.println(m + " рубль");
		else 
				if (m % 100 >= 2 && m % 100 <= 4)
					System.out.println(m + " рубля");
				else
					System.out.println(m + " рублей");
			
	}
}