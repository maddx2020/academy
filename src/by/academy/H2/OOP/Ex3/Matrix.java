package by.academy.H2.OOP.Ex3;

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

//array create
	public float[][] createArray() {
		getA();
		getB();
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				array4[i][j] = (float) Math.random() * 10 + 1;
			}
		}
		return array4;
	}

// print
	public void printArray(float[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}

//multiplication on a number
	public float[][] multiplicationOnNumber(float[][] array1, float number) {
		float[][] array3 = new float[a][b];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] * number;
			}
		}
		return array3;
	}

//sum matrix
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
