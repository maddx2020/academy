package by.academy.Lesson9_Generic.Ex10;

public class MainEx10 {

	public static void main(String[] args) {
		Integer[] intArr = { 3, 7, 9, 15, 23, 48, 62 };
		Integer[] intArr2 = { 31, 72, 93, 154, 235, 486, 627 };
		Double[] doubArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

		Modification<Integer> mod = new Modification<Integer>(intArr);
		Modification<Integer> mod22 = new Modification<Integer>();
		Modification<Double> doubleMod = new Modification<Double>();
//task1
		mod.indexReturnValue(intArr, 6);
		System.out.println();
		mod22.indexReturnValue(intArr2, 4);
		System.out.println();
		doubleMod.indexReturnValue(doubArray, 7);
		System.out.println();

//task 2

		Integer[] someAr = new Integer[5];
		someAr[0] = 9;
		someAr[1] = 8;
		someAr[2] = 7;
//		someAr[4] = 2;
		for (Integer i : someAr) {
			System.out.print(i + " ");
		}

	
	
	
	}

}
