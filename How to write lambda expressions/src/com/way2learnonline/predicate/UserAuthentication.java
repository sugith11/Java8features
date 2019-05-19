package com.way2learnonline.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	String userName;
	String password;

	public UserAuthentication(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public static void main(String[] args) {
		Predicate<UserAuthentication> p = UserAuthentication -> UserAuthentication.userName.equals("sugith")
				&& UserAuthentication.password.equals("kumar");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name :");
		String userName = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		sc.close();

		UserAuthentication uae = new UserAuthentication(userName, password);
		if (p.test(uae)) {
			System.out.println("Authentication Successful");
		} else {
			System.out.println("Authentication Failed / Invalid login");
		}

	}
}
