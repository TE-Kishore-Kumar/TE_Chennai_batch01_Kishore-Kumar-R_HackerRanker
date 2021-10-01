package com.te.hackerrank;

import java.util.Scanner;

public class HackerRanker1 {
	
	public void hr1() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Value :");
		int N = scn.nextInt();
    
		if(N%2!=0) {
			System.out.println("Weird");
		} else if(N%2==0 && N>2 && N<5) {
			System.out.println("Not Weird");
		} else if(N%2==0 && N>6 && N<20) {
			System.out.println("Weird");
		} else if(N%2==0 && N>20) {
			System.out.println("Not Weird");
		}

		scn.close();
	}
}
