package com.Bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
	/*
	 * variable
	 * taking harmonic count as input
	 * for loop
	 * calculating number and storing
	 * result 
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * variable
		 */
		double result=0;
		double number=0;
		double j ;
		int n ;
		/*
		 * input
		 */
		System.out.println("enter the number");
		n=sc.nextInt();
		/*
		 * for loop 
		 */
		for(j=1;j<=n;j++) {
			/*
			 * calculating number and storing
			 */
			number=number+(1/j);
			result=number;
			sc.close();
		}
		System.out.println("the value of harmonicNumber :"+result);
	}

}
