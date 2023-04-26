package com.Bridgelabz;

import java.util.Scanner;

/**
 * 
 * @author Prasanna
 *
 */

public class Factor{
	/**
	 * 
	 * @param args
	 */
     public static void main(String[] args) {
     /*
      * input number
      *  finding and printing factors between 1 to number
      *  for loop
      */
    Scanner sc=new Scanner(System.in);
    /*
     * input
     */
    System.out.println("enter the number");
    int number=sc.nextInt();
    System.out.println( "Factors of " + number + " are " );

    /*
     *  finding and printing factors between 1 to number
     */
    for(int i = 1; i <= number; i++)
    {
        if(number % i == 0)
            System.out.println(i + " "); 
    }
    sc.close();

     }
}
