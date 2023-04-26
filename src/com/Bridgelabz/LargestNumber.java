package com.Bridgelabz;

import java.util.Scanner;
/**
 * 
 * @author Prasanna
 *
 */
public class LargestNumber {
	/*
	 * input
	 * if condition 
	 * result
	 */

	public static void main(String[] args) {
		/*
		 * input
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number ");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number ");
		int b=sc.nextInt();
		System.out.println("enter the 3rd number ");
		int c=sc.nextInt();
		/*
		 * if condition
		 */
		if(a>=b && a>=c)
			System.out.println(a+" is the largest number");
		else if(b>=a && b>=c)
			System.out.println(b+" is the largest number");
		else
			System.out.println(c+" is the largest number");
		
		sc.close();


	}

}
