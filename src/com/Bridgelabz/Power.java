package com.Bridgelabz;

import java.util.Scanner;

/**
 * 
 * @author Prasanna
 *
 */

public class Power {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * variable
		 * input power value
		 * while loop 
		 * result
		 */
		/*
		 * create variable for base
		 */
		int base=2;
		/*
		 * input to take power value
		 */
		
		Scanner sc=new Scanner(System.in);
		/*
		 * input power value
		 */
		System.out.println("enter the power value:");
		int power=sc.nextInt();
		System.out.println(2+"^"+power);
		/*
		 * result variable to store output
		 */
		int result=1;
		/*
		 * calculating power using while loop
		 */
		while(power>0) {
			result=result*base;
			power--;
		}
		sc.close();

		System.out.println("Result = "+result);
	}
}
