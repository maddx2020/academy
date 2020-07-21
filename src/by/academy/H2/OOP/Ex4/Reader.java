package by.academy.H2.OOP.Ex4;

public class Reader {
	private String fio;
	private int biletNumber;
	private String facultet;
	private int phoneNumber;
	private String birthday;
	private Reader[] readers;

	public Reader() {
		super();
	}

	public Reader(String fio, int biletNumber, String facultet, String birthday, int phoneNumber) {
		super();
		this.fio = fio;
		this.biletNumber = biletNumber;
		this.facultet = facultet;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getBiletNumber() {
		return biletNumber;
	}

	public void setBiletNumber(int biletNumber) {
		this.biletNumber = biletNumber;
	}

	public String getFacultet() {
		return facultet;
	}

	public void setFacultet(String facultet) {
		this.facultet = facultet;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Reader[] getReaders() {
		return readers;
	}

	public void setReaders(Reader[] readers) {
		this.readers = readers;
	}

	public void takeBook() {
		System.out.println("Читатель " + fio + " взял книгу.");
	}

	public void returnBook() {
		System.out.println("Читатель " + fio + " вернул книгу.");
	}

	public void takeBook(int n) {
		System.out.println(fio + " взял " + n + " книги");
	}

	public void returnBook(int n) {
		System.out.println(fio + " вернул " + n + " книги");
	}

	public void takeBook(String... titles) {
		System.out.print(fio + " взял книги: ");
		for (int i = 0; i < titles.length; i++) {
			if (i == (titles.length - 1)) {
				System.out.println(titles[i] + ".");
			} else {
				System.out.print(titles[i] + ", ");
			}
		}
	}

	public void returnBook(String... titles) {
		System.out.print(fio + " вернул книги: ");
		for (int i = 0; i < titles.length; i++) {
			if (i == (titles.length - 1)) {
				System.out.println(titles[i] + ".");
			} else {
				System.out.print(titles[i] + ", ");
			}
		}
	}

	public void takeBook(Book... books) {
		System.out.print(fio + " взял книги: ");
		for (int i = 0; i < books.length; i++) {
			if (i == (books.length - 1)) {
				System.out.println(books[i].getAuthor() + " - " + books[i].getTitle() + ".");
			} else {
				System.out.print(books[i].getAuthor() + " - " + books[i].getTitle() + ", ");
			}
		}
	}

	public void returnBook(Book... books) {
		System.out.print(fio + " вернул книги: ");
		for (int i = 0; i < books.length; i++) {
			if (i == (books.length - 1)) {
				System.out.println(books[i].getAuthor() + " - " + books[i].getTitle() + ".");
			} else {
				System.out.print(books[i].getAuthor() + " - " + books[i].getTitle() + ", ");
			}
		}
	}

}
