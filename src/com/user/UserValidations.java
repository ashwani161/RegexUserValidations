package com.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidations {
	public boolean validateFirstName(String firstName) {
		String regExp = "^[A-Z][a-zA-Z]{3,3}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration system to ensure all Validations");
		System.out.println("Enter your first name");
		String firstName = scanner.next();
		boolean result = new UserValidations().validateFirstName(firstName);
		System.out.println(result);
	}

}
