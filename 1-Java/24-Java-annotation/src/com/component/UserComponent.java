package com.component;

import com.container.RequestMapping;

public class UserComponent {

	@RequestMapping(url = "/login", method = "POST")
	public void doLogin(String userName, String password) {
		// ....
		System.out.println("login...." + userName + "\t" + password);
	}

	@RequestMapping(url = "/register", method = "POST")
	public void doRegister() {
		// ....
		System.out.println("register....");
	}

}
