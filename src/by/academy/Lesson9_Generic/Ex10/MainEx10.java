package by.academy.Lesson9_Generic.Ex10;

public class MainEx10 {

	public static void main(String[] args) {

		Integer[] intArr = { 3, 7, 9, 15, 23, 48, 64, null };
		Integer[] intArr2 = { 31, 72, 93, 154, 235, 486, 627 };
		Double[] doubArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

		Modification<Integer> mod = new Modification<Integer>(intArr);
		Modification<Integer> mod22 = new Modification<Integer>();
		Modification<Double> doubleMod = new Modification<Double>();
//task1

		System.out.println(mod.indexReturnValue(intArr, 7) + "\n");
		System.out.println(mod22.indexReturnValue(intArr2, -9) + "\n");
		System.out.println(doubleMod.indexReturnValue(doubArray, 7) + "\n");

//task 2
		Integer[] intArr3 = { 9, 8, 7, null, 2 };
		Integer[] intArr33 = { 9, 8, 7, null, null };

		for (Integer i : intArr3) {
			System.out.print(i + " ");
		}
		mod22.setItems(intArr3);
		mod22.addItemToEnd(intArr3, 5);

		for (Integer i : mod22.getItems()) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();

		for (Integer i : intArr33) {
			System.out.print(i + " ");
		}
		mod22.setItems(intArr33);
		mod22.addItemToEnd(intArr33, 11);

		for (Integer i : mod22.getItems()) {
			System.out.print(i + " ");
		}
	}

}
