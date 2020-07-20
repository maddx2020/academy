package by.academy.Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg44 {

	public static void main(String[] args) {

		String[] test1 = { "50/50/9999", "00/00/000", "12/11/2020", "4/9/1970" };
		
		String[] test2 = { "50-50-9999", "00-00-000", "12-11-2020", "4-9-1970" };

		Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3]|[0|1])/([0]?[1-9]|1[0-2])/\\d{4}");
		
		Pattern p2 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3]|[0|1])-([0]?[1-9]|1[0-2])-\\d{4}");

		for (String t : test2) {
			Matcher m2 = p2.matcher(t);
			if (m2.find()) {
				System.out.println(m2.group(0));
			} else {
				System.out.println("Неверная дата");
			}

		}
	}
}
