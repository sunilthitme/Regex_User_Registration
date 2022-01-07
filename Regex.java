package com.blz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name:: ");
		String name = sc.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}{3,}");
		Matcher matcher = pattern.matcher(name);
		boolean b = matcher.matches();
		if(b != true) {
			System.out.println("Your name is invalid!! \n"
					+ "Please Enter Name as these Condition::"
					+ " \nFirst name starts with Cap and has\r\n"
					+ "minimum 3 characters");
		}else {
			System.out.println("Your name is valid:: "+name);
		}
	}
}

