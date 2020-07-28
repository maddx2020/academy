package by.academy.Lesson9_Generic;

public class Main9 {

	public static void main(String[] args) {
		Integer[] intArray2 = { 24, 18, 3, 99, 66 };
		Double[] dArray3 = { 99.0, 102.0, 144.0, 287.0, 650.0 };
		MinMax<Integer> intArray = new MinMax<Integer>(intArray2);
		MinMax<Double> dArray = new MinMax<Double>(dArray3);

		System.out.println("min= " + intArray.minArray());
		System.out.println("max= " + intArray.maxArray());
		System.out.println("min2= " + dArray.minArray());
		
		dArray.maxArray();
//		Double max = intArray.maxArray();
//		Double min = intArray.minArray();

		System.out.println("max = min - " + intArray.equalMinMax(intArray.maxArray(), dArray.minArray()));
		System.out.println();
		System.out.println(dArray.toString());
	}

}
