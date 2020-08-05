package by.academy.Lesson10_Collection;

import java.util.ArrayList;

public class Main11_2 {

	public static void main(String[] args) {
		
		long start =System.currentTimeMillis();
				
		ArrayList<Integer> aList = new ArrayList<>();
		addAL(aList);
		System.out.println("Time, s: "+ (System.currentTimeMillis()-start));
	}

	public static void addAL(ArrayList<Integer> list) {
		int i=0;
		while(i++!=1000_000) {
			list.add(i);
		}
	}
	
}
