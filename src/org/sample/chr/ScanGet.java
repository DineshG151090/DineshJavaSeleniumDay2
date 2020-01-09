package org.sample.chr;

import java.util.Scanner;

public class ScanGet {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Employee id");
		int id = s.nextInt();
		System.out.println("Employee id is " + id);
		System.out.println("Enter the employee name");
		String name = s.next();
		System.out.println("Employee name is " + name);
		System.out.println("Enter the employee phone number");
		long phno = s.nextLong();
		System.out.println("Employee phone number is " + phno);
		
	}

}
