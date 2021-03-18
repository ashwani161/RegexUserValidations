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
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,3}");
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	public boolean validateMobileFormat(String mobileFormat) {
		Pattern pattern = Pattern.compile("^(?:[0-9] ?{6,14}[0-9]$)");
		Matcher matcher = pattern.matcher(mobileFormat);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration system to ensure all Validations");
		System.out.println("Enter your first name");
		System.out.println("Enter your last name");
		System.out.println("Enter your email");
		System.out.println("Enter your mobile format");
		String firstName = scanner.next();
		String lastName = scanner.next();
		String email = scanner.next();
		String mobileFormat = scanner.next();
		boolean result = new UserValidations().validateFirstName(firstName);
		boolean result1 = new UserValidations().validateLastName(lastName);
		boolean result2 = new UserValidations().validateEmail(email);
		boolean result3 = new UserValidations().validateMobileFormat(mobileFormat);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
