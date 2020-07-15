package by.academy.Lesson5.OOP.Ex3;

public class Matrix {
	static int a = 2;
	static int b = 3;
//vyvod na pechat'
	public static void printArray(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
//unojenie na chislo
	public static double[][] multiNumber(double[][] array1, double number) {
		double[][] array3 = new double[a][b];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] * number;
			}
		}
		return array3;
	}
	
//summa matric
	public static double[][] summMatrix(double[][] array1, double[][] array2) {
		double[][] array3 = new double[a][b];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return array3;
	}

	public static void main(String[] args) {

		double[][] array1 = new double[a][b];

		double array2[][] = { { 3.1, 4.2, 5.3 }, { 6.4, 7.5, 8.6 } };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = Math.random() * 10 + 1;
			}
		}

		printArray(array1);
		System.out.println();
		
		printArray(array2);
		System.out.println();
		
		printArray(multiNumber(array2, 5));
		System.out.println();
		
		printArray(summMatrix(array2, array2));
		
	}
}
