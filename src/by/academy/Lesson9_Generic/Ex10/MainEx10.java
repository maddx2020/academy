package by.academy.Lesson9_Generic.Ex10;

public class MainEx10 {

	public static void main(String[] args) {
		Integer[] intArr = { 3, 7, 9, 15, 23, 48, 62 };
		Integer[] intArr2 = { 31, 72, 93, 154, 235, 486, 627 };

		Modification<Integer> mod = new Modification<Integer>(intArr);
		Modification<Integer> mod22 = new Modification<Integer>();

		mod.indexReturnValue(intArr, 6);

		System.out.println();
				
		mod22.indexReturnValue(intArr2, 4);

	}

}
