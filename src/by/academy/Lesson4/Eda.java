package by.academy.Lesson4;


public class Eda extends Product1{
	
	String kind;
	
	public Eda(String name, int quantity, double price, String kind) {
		super(name, quantity,price);
		this.kind = kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}

}
