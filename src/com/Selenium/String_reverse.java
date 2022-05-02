package com.Selenium;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalstr, reversestr=" ";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		originalstr = sc.nextLine();
		for(int i=originalstr.length()-1;i>=0;i--)
		{
			reversestr=reversestr+originalstr.charAt(i);
		}
		System.out.println(reversestr);
		
		
		
		
		
			//String str1 = "Annamu";
			//StringBuffer str=new StringBuffer(str1);
			//str.reverse().toString();
			//System.out.println(str);
			
			//reversed string will be stored in rev variable
			//String rev = new StringBuffer(str1).reverse().toString();
			//print string before reverse
			//System.out.println("\nString before reversal : "+str1);
			//print string after reverse
			//System.out.println("String after reversal : "+rev);
			}
			}


