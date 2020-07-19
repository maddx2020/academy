package by.academy.Lesson5.OOP.Ex3;

public class Matrix {
	int a;
	int b;
	float[][] array4 = new float[a][b];

	public Matrix() {
		super();
	}

	public Matrix(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public float[][] createArray() {
		getA();
		getB();
		float[][] array = new float[a][b];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (float) Math.random() * 10 + 1;
			}
		}
		return array;
	}

// vyvod na pechat'
	public void printArray(float[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}

//umnojenie na chislo
	public float[][] multiplicationOnNumber(float[][] array1, float number) {
		float[][] array3 = new float[a][b];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] * number;
			}
		}
		return array3;
	}

//summa matric
	public float[][] summMatrix(float[][] array1, float[][] array2) {
		float[][] array3 = new float[a][b];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return array3;
	}

}
