package com.Selenium;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original,reverse=" ";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		Original=sc.nextLine();
		for(int i = Original.length()-1;i>0;i--)
		{
			reverse=reverse+Original.charAt(i);
		}
		
		System.out.println(reverse);
		
	}

}
