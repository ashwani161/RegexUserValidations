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
	public boolean validateLastName(String lastName) {
		String regExp = "^[A-Z][a-zA-Z]{3,3}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration system to ensure all Validations");
		System.out.println("Enter your first name");
		System.out.println("Enter your last name");
		String firstName = scanner.next();
		String lastName = scanner.next();
		boolean result = new UserValidations().validateFirstName(firstName);
		boolean result1 = new UserValidations().validateLastName(lastName);
        System.out.println(result);
        System.out.println(result1);
	}

}
