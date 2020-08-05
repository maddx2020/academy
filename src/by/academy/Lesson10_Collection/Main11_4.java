package by.academy.Lesson10_Collection;

import java.util.HashMap;
import java.util.Map;

public class Main11_4 {

	public static void main(String[] args) {
		Map<String, Integer> catalog = new HashMap<>();
		addToMap(catalog, "prod");
	}

	public static void addToMap(Map<String, Integer> someMap, String str) {
		someMap.compute(str, (k, v) -> v != null ? v + 1 : 1);
	}

}
 