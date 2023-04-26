
package com.Bridgelabz;

import java.util.Scanner;

/**
 * 
 * @author pmoha
 *
 */

public class QuotientAndRemender {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         /*
          * input Dividend
          */
         System.out.println("Dividend: ");
         int Dividend= sc.nextInt();
         /*
          * input Divisor
          */
         System.out.println("Divisor: ");
         int Divisor= sc.nextInt();
         int Quotient=0;
         int Remainder=0;
         /*
          * Quotient
          */
         Quotient =Dividend/Divisor;
         /*
          * Remainder
          */
         Remainder=Dividend%Divisor;
         System.out.println("Quotient :"+Dividend+"/"+Divisor+"is"+Quotient);
         System.out.println("Remainder :"+Dividend+"/"+Divisor+"is"+Remainder);
         sc.close();
		
	}

}
