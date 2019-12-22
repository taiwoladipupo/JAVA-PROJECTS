package Applications;

import java.util.Scanner;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		// write your code here
		/*
		 * The user defines a whole range of numbers, the problem is to determine the
		 * mean/Average from a range of numbers.
		 *  Determine how many times a number  occurred number
		 * Determine the maximum number.
		 *  Determine the minimum number.
		 */
		// imports the Scanner class
		java.util.Scanner input = new Scanner(System.in);

		// Prompt the user to enter how many numbers are available
		System.out.print("Enter the number of items:");

		// Allows user to be able to type in values/text
		int n = input.nextInt();

		// creates the array
		double[] numbers = new double[n];

		// Creates the double value sum which adds up the whole numbers
		double sum = 0;
		
		//Prompt the user to input the numbers
		System.out.print("Enter the numbers:");
		//A loop that ends repetition once the condition is met
		for(int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		//line of code to determine the average of the sum of the numbers
		double average = sum / n;
		
		/*line of code of how many times numbers in the array where greater than the average
		 * line of code for count of how many times numbers in the array where either greater or lesser than the average
		  
		 * 
		 */
		int count = 0;
		
		int min_count = 0;
		for(int i = 0; i < n; i++) {
			if(numbers[i] > average )
			count++;
			
			else
				if(numbers[i] < average)
					min_count++;
				
		}
		

	
		
		/*Displays statements at the console*/
		
		
		System.out.println("Average is " + average);
		System.out.println("Numbers of elements above the average is " + count);
		System.out.println(" Numbers of elements below the average is " + min_count);
	}
}
