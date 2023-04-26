package com.Bridgelabz;
import java.util.Scanner;
/**
 * 
 * @author pmoha
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int a=sc.nextInt();
		if (a%4==0 && a%100!=0)
			System.out.println(a+" is a leap yer");
		else
			System.out.println(a+" not a leap year");
		sc.close();
	}

}
