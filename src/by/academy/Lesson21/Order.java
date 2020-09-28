package by.academy.Lesson21;

public class Order {
	
	private OrderItem orderItem;

	private String orderNumber;

	public Order(String orderNumber, OrderItem orderItem) {
		super();
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
	
}
