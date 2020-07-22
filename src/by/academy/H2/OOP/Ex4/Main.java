package by.academy.H2.OOP.Ex4;

public class Main {
	public static void main(String[] args) {

		Reader reader1 = new Reader("Петров В. В.", 143, "ФРЭ", "1 января 2000", 12_13_789);
		Reader reader2 = new Reader("Сидоров А. А.", 199, "КСиС", "21 февраля 2002", 56_89_000);

		Book book1 = new Book("Стихи", "Маяковский В.В.");
		Book book2 = new Book("Рассказы", "Чехов А.П.");

		Book[] books = { book1, book2 };

		reader2.takeBook();
		System.out.println();

		reader1.returnBook(4);
		System.out.println();

		reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
		System.out.println();

		reader1.returnBook(books);
		System.out.println();

	}

}
