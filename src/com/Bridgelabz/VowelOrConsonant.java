package com.Bridgelabz;

import java.util.Scanner;
/**
 * 
 * @author Prasanna
 *
 */

public class VowelOrConsonant {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * input
		 * if condition
		 */
		Scanner sc=new Scanner(System.in);
		/*
		 * input
		 */
		char ch=sc.next().charAt(1);
		/*
		 * if condition
		 */
		if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is Consonant");
		sc.close();
		
	}

}
