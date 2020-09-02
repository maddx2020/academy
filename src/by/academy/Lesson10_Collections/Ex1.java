package by.academy.Lesson10_Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex1 {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(7);
		arrayList.add(5);
		arrayList.add(12);
		arrayList.add(7);
		arrayList.add(14);
		arrayList.add(5);
		arrayList.add(7);
		arrayList.add(99);
		arrayList.add(88);
		HashSet<Integer> hs = new HashSet<Integer>(arrayList);
		System.out.println(hs);

	}
}
