package com.Bridgelabz;

import java.util.Scanner;

/**
 * 
 * @author pmoha
 *
 */
public class EvenOdd {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/*
		 * input
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        /*
         * checking 
         */
        if(n%2==0)
        	System.out.println(n+" is a even number");
        else
        	System.out.println(n+" is an odd number");
    	sc.close();

	}
}
