package by.academy.Lesson21;

import java.sql.Date;

public class CreditCard implements Payment {

	private String issuer;
	private Long cardNumber;
	private Date expireDate;
	
		
	public CreditCard(String issuer, Long cardNumber, Date expireDate) {
		super();
		this.issuer = issuer;
		this.cardNumber = cardNumber;
		this.expireDate = expireDate;
	}

	@Override
	public boolean pay(Double d) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	
}
