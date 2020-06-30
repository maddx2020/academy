
public class lesson5 {
	public static void main(String[] args) {

		int x;
		int i;
		int mass[];
		int size = (int) (Math.random() * 10 + 1);
		mass = new int[size];
				for (i = 0; i < size; i++) {
			mass[i] = (int) (Math.random() * 10);
			System.out.print(mass[i] + " ");
		}
				System.out.println("");
				System.out.println("длина массива " + mass.length);
		for (i = 0; i < (mass.length - i); i++) {
			x = mass[i];
			mass[i] = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = x;
		}
		for (i = 0; i < size; i++) {
			System.out.print(mass[i] + " ");
			
		}

	}
}
