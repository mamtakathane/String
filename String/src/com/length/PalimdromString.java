package com.length;

import java.util.Scanner;

public class PalimdromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");

		String str = sc.nextLine();
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			reverse += str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str))
		{
			
			System.out.println("palimdrom");
		}
		else
		{
			System.out.println("not palimdrome");

	}

}
}
