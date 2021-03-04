

/*
 * CIS 2122
 * 01/19/2020
 * Jeremy L. Shepherd
 * Calculator
 * A console program that takes in user input to 
 * calculate basic math functions of 2 numbers and return a calculation.
 * Also generate a random number based on a range of numbers.
 * The instructions did not specific an exit condition so I did not add one,
 * therefore program has to be manually terminated
 */

import java.util.Scanner;

public class ShepherdJeremyCalculator {
	
	//Not sure if this is a bad practice
	static Scanner input = new Scanner(System.in);
	
	//Method for getting number input
	public static double getNum(String message) {
		double num;
		
		System.out.print(message);
		num = input.nextDouble();
		return num;
	}
	
	//Method to generate number
	public static double generateRandomNum(double num1, double num2) {
		double randomVal = Math.random();
		return randomVal * num2 + num1;
	}	
		
	public static void main(String[] args) {
		
		//variables
		double num1, num2, result;
		int choice;		
		
		//menu
		System.out.println("Calculator Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Generate Random Number");
		System.out.print("What would you like to do? ");
		
		//User input for menu
		choice = input.nextInt();
		
		if(choice < 1 || choice > 5) {
			System.out.println("I'm sorry, " + choice + " wasn't one of the options");
			System.out.println("\nProgram exit...");
			System.exit(0);
		}
		//Eliminated repeated calls to getNum by employing ternary for different input message
		String message1 = choice == 5 ? "What is the lower limit? " : "What is the first number? ";
		String message2 = choice == 5 ? "What is the upper limit? " : "What is the second number? ";
		
		num1 = getNum(message1);
		num2 = getNum(message2);
		
		switch(choice) {
			case 1:
				result = num1 + num2;
				System.out.println("Answer: " + result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println("Answer: " + result);
				break;
			case 3:
				result = num1 * num2;
				System.out.println("Answer: " + result);
				break;
			case 4:
				if(num2 == 0) {
					System.out.println("I'm sorry, you can't divide by zero.");
					break;
				} else {
					result = num1 / num2;
					System.out.println("Answer: " + result);
					break;
				}
			case 5:
				result = generateRandomNum(num1, num2);
				System.out.println("Answer: " + result);
				break;						
					
		}
		
		input.close();
		System.out.println("\nProgram exit...");
	}
}
