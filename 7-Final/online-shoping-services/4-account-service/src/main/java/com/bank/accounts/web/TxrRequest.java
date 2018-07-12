package com.bank.accounts.web;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TxrRequest {
	
	@NotBlank
	private String fromAccNum;
	@NotBlank
	private String toAccNum;
	private double amount;

	public String getFromAccNum() {
		return fromAccNum;
	}

	public void setFromAccNum(String fromAccNum) {
		this.fromAccNum = fromAccNum;
	}

	public String getToAccNum() {
		return toAccNum;
	}

	public void setToAccNum(String toAccNum) {
		this.toAccNum = toAccNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
