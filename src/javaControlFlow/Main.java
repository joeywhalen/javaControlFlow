package javaControlFlow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Numbers:");// print the valid numbers from AsciiChar file
		AsciiChars.printNumbers();

		System.out.println("Lowercase letters:");
		AsciiChars.printLowerCase();// print the valid letters from AsciiChar file
		
		System.out.println("Uppercase letters:");
		AsciiChars.printUpperCase();// print the valid letters from AsciiChar file

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name:");//request and capture user name
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion? (y/n)");// determine if program ends or continues
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			System.out.println("What is the name of your favorite pet?");// request information to convert to lottery numbers
			String favPet = userInput.nextLine();
			
			
		}
	}

}
