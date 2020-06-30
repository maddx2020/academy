
public class lesson4_1 {
	public static void main(String[] args) {

		int x = 870143;
		int y = 0;
		do {
			y += x % 10;
			x = x / 10;
		} while (x > 1);
		System.out.println(y);

	}
}
