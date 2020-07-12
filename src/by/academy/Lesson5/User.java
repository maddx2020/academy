package by.academy.Lesson5;

public class User {
	private String name;
	
	public User() {
		super();

	}
	public User(String name) {
		super();
		System.out.println("Конструктор User");
		this.name = name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
