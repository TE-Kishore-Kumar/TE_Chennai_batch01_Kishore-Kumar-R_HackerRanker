package com.te.hackerrank;

import java.util.Scanner;

public class HackerRanker3 {

	public void hr3() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String :");
		String st = scn.next();
		boolean flag = true;
		char[] ch = st.toCharArray();
		st = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			st = st + ch[i];
		}
		for (int j = 0; j <= st.length() / 2;) {
			if (st.charAt(j) != st.charAt(st.length() - 1) - j)
				flag = false;
			break;
		}

		System.out.println("After Reverse: " + st);
		String msg = flag == true ? "Yes" : "No";
		System.out.println("Palindrome: " + msg);
		scn.close();
	}
}
