package by.academy.Lesson10_Collection;

import java.util.ArrayList;
import java.util.HashSet;
;

public class MainCollect11 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(7);
		list.add(9);
		list.add(11);
		list.add(7);
		list.add(9);
		list.add(12);
		
		System.out.println(list);
		System.out.println(returnOne(list));
	}

	public static HashSet<Integer> returnOne(ArrayList<Integer> list) {
		HashSet<Integer> hs = new HashSet<Integer>(list);
		return hs;
	}
	
}
