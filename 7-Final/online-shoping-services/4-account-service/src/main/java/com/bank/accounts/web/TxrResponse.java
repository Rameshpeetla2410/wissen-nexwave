package com.bank.accounts.web;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TxrResponse {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
