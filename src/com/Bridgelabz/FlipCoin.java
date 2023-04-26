package com.Bridgelabz;

import java.util.Scanner;

/**
 * 
 * @author Prasanna
 *
 */
public class FlipCoin {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/*
		 * initialization
		 * taking input for no of toss
		 * for loop for number of toss
		 * count of heads and tails in percentage
		 * result 
		 */
		/*
		 * initialization 
		 */
        int headCount=0;
        int tailCount=0;
        int heads = 0;
        int tails = 0;
        /*
         * taking input for no of toss
         */
        Scanner toss = new Scanner(System.in);
        System.out.println("no of flip coin");
        int numberOfToss = toss.nextInt();
        /*
         * for loop for number of toss 
         */
        for(int i=0; i<numberOfToss; i++) {
        	  double coin = Math.random();
                if (coin > 0.5) {
            	headCount++;
                }
                else {
            	tailCount++;
                }
                toss.close();
        }
        /*
         * count of heads and tails in percentage
         */
        heads=headCount*100/numberOfToss;
        tails=tailCount*100/numberOfToss;
        System.out.println("heads percentage :"+heads+"%");
        System.out.println("tails percentage :"+tails+"%");  
	
	}
}
