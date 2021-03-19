package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class EmailSamples {

	public static void main(String args[]) {
	      List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("abc@yahoo.com");
	       emails.add("abc-100@yahoo.com");
	       emails.add("abc.100@yahoo.com");
	       emails.add("abc111@abc.com");
	       emails.add("abc-100@abc.net");
	       emails.add("abc.100@abc.com.au");
	       emails.add("abc@1.com");
	       emails.add("abc@gmail.com.com");
	       emails.add("abc+100@gmail.com");
	       //invalid email addresses
	       emails.add("abc");
	       emails.add("abc@.com");
	       emails.add("abc123@gmail.a");
	       emails.add("abc123@.com");
	       emails.add("abc123@.com.com");
	       emails.add(".abc@abc.com");
	       emails.add("abc()*@gmail.com");
	       emails.add("abc@%*.com");
	       emails.add("abc..2002@gmail.com");
	       emails.add("abc.@gmail.com");
	       emails.add("abc@abc@gmail.com");
	       emails.add("abc@gmail.com.1a");
	       emails.add("abc@gmail.com.aa.au");
	       
	       Pattern pattern = Pattern.compile("^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9]*[^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.]*[a-z^la]*)$");

	       for (String email : emails) {
	    	   Matcher matcher = pattern.matcher(email);
	    	   System.out.println(email + " : " + matcher.matches());
	       }
	}

	
}