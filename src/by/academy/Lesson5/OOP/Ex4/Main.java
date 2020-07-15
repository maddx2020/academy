package by.academy.Lesson5.OOP.Ex4;

public class Main {
	public static void main(String[] args) {

		Reader reader1 = new Reader("Петров В.В.", 143, "ФРЭ", "1 января 2000", 12_13_789);

		reader1.takeBook(4);
		reader1.takeBook("Справочник" , "Философия", "Как свергнуть власть");
		
	}

}
