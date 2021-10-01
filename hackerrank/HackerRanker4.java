package com.te.hackerrank;

import java.util.Scanner;

public class HackerRanker4 {

	public void hr4() {
		
		 Scanner scan = new Scanner(System.in);
		 	System.out.println("Enter the Integer Value : ");
	        int i = scan.nextInt();
	        System.out.println("Enter the Double Value : ");
	        double d = scan.nextDouble();
	        System.out.println("Enter the String : ");
	        scan.nextLine();
	        String s = scan.nextLine();
	        // Write your code here.
	        
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        scan.close();
	}
}
