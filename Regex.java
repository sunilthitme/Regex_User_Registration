package com.blz;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the User Registration Problem using Regex!!");
	UserOperation user = new UserOperation();
	System.out.println("Enter your First Name:: ");
	String name = sc.next();
	user.firstName(name);
	System.out.println("Enter your Lirst Name:: ");
	String lastName = sc.next();
	user.lastName(lastName);
	System.out.println("Enter your Email Id:: ");
	String emailId = sc.next();
	user.emailaddress(emailId);
	System.out.println("Enter your phoneNo:: ");
	String phoneNo = sc.next();
	user.phoneNo(phoneNo);
	System.out.println("Enter your Password:: ");
	String passRule1 = sc.next();
	user.passRule1(passRule1);
	
	
	
	}
}

