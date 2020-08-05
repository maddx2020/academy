package by.academy.Lesson10_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main11_2 {
//	static int i=0;

	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		List<Integer> lList = new LinkedList<>();

		long start = System.currentTimeMillis();

		add(aList);
		System.out.println("Time add ArrayList, s: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		add(lList);
		System.out.println("Time add LinkedList, s: " + (System.currentTimeMillis() - start));
	
		start = System.currentTimeMillis();
		get(aList);
		System.out.println("Time get ArrayList, s: " + (System.currentTimeMillis() - start));
	
		start = System.currentTimeMillis();
		get(lList);
		System.out.println("Time get LinkedList, s: " + (System.currentTimeMillis() - start));
	
	}

	public static void add(List<Integer> list) {
		int i =0;
		while (i++ != 1000_000) {
			list.add(i);
		}
	}

	public static void get(List<Integer> list) {
		int i=0;
		while (i++ != 1000_00) {
			list.get(i);
		}
	}

}
