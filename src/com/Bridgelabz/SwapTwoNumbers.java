package com.Bridgelabz;

public class SwapTwoNumbers {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * initialization
		 * result
		 */
		int firstNumber=10;
		int secondNumber=20;
		/*
		 * first  number=10+20=30
		 * second number=30-20=10
		 * first  number=30-10=20
		 */
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		/*
		 * result
		 */
		System.out.println("firstNumber="+secondNumber);
		System.out.println("secondNumber="+firstNumber);

		
	}

}
