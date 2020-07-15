package by.academy.Lesson5.OOP.Ex4;

public class Reader {
	private String fio;
	private int biletNumber;
	private String facultet;
	private int phoneNumber;
	private String birthday;

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

	public void takeBook() {
		System.out.println("�������� ���� �����.");
	}

	public void returnBook() {
		System.out.println("�������� ������ �����.");
	}

	public void takeBook(int n) {
		System.out.println(fio + " ���� " + n + " �����");
	}

	public void takeBook(String[] titles) {
		System.out.print(fio + " ���� �����: ");
		for(String i:titles) {
			System.out.print(i +" ");
		}
	}
}
