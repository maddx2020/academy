package by.academy.Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
	public static void main(String[] args) {

		String str = "Предложение с пробелом, !запятыми, точкой";

//		String [] arr = str.split("[.,!?]");
//		System.out.println(arr.length);
	
	Pattern pt = Pattern.compile("[.,?!]");
	Matcher m = pt.matcher(str);
	
	int counter = 0;
	while(m.find()) {
		counter++;
	}
	
	System.out.println(counter);
	
	
	
	}

}
