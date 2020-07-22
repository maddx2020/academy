package by.academy.H2.OOP.Ex7.details;

public class Engine {

	private int power;
	private String company;

	public Engine() {
		super();
	}

	public Engine(int power, String company) {
		super();
		this.power = power;
		this.company = company;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
