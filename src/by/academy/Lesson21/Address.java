package by.academy.Lesson21;

public class Address {

	private int doorNumber;
	private String street;
	private String city;
	private String zipcode;
	public Address(int doorNumber, String street, String city, String zipcode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
