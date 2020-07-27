package by.academy.Lesson9;

public class Main9 {

	public static void main(String[] args) {
		Integer[] intArray2 = { 24, 18, 3, 99, 66 };
		MinMax<Integer> intArray = new MinMax<Integer>(intArray2);

	System.out.println(intArray.maxArray());
	System.out.println(intArray.minArray());
	
	
	}
	

}
