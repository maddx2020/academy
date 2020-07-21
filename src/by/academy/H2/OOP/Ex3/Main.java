package by.academy.H2.OOP.Ex3;

public class Main {

	public static void main(String[] args) {

		Matrix m1 = new Matrix(2, 4);

		float[][] ar1 = m1.createArray();
		float[][] ar2 = m1.createArray();

		System.out.println("Первый двумерный массив: ");
		m1.printArray(ar1);
		System.out.println();

		System.out.println("Второй двумерный массив:");
		m1.printArray(ar2);
		System.out.println();

		System.out.println("Сумма матриц:");
		m1.printArray(m1.summMatrix(ar1, ar2));
		System.out.println();

		System.out.println("Умножение матрицы на число:");
		m1.printArray(m1.multiplicationOnNumber(ar1, 10));
	}

}
