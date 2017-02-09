// ------------------------------------------------------------------------------------------
// Name: Daniel Loscherblanco
// Class: Java 1
// Abstract: Homework 4A. This program creates letter triangles and a pyramid based on user input
// ------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------
// Imports
// ------------------------------------------------------------------------------------------
import java.io.*;
import java.util.Scanner;

public class Chomework4 {
	// --------------------------------------------------------------------------------
	// Name: main
	// Abstract: This is where the program starts.  Examples of loops and user inputs
	// Homework 4A, 4B, 4C are in the same file as per extra credit
	// --------------------------------------------------------------------------------

	public static void main(String[] args) {
		Problem1();
		Problem2();
		Problem3();
	}
	// ----------------------------------------------------------------------
	// Name: Problem1
	// Abstract: $ pyramid from user input
	//$
	//$$
	//$$$
	//$$$$

	// ----------------------------------------------------------------------
	public static void Problem1()
	{
		//Declare variables
		int intInput;
		int intColumn=0;
		int intRow=0;
		
		//Prompt user for a valid number between 1-20
		do
		{
			Scanner MyScan=new Scanner(System.in);
			System.out.println("Please enter a valid number between 1-20");
			intInput = MyScan.nextInt();
		} while( intInput <1 || intInput >20);
		//Create $ triangle based on input
		for(intColumn=1; intColumn<=intInput;intColumn+=1)
		{
			for(intRow=1;intRow<=intColumn;intRow+=1)
			{
				System.out.print("$");
			}
			System.out.print("\n");
		}
	}
	
	// ----------------------------------------------------------------------
		// Name: Problem2
		// Abstract: letter triangle from user input
		//Enter letter A-Z? E
		//E
		//ED
		//EDC
		//EDCB
		//EDCBA


		// ----------------------------------------------------------------------
	public static void Problem2()
	{
		//Declare variables
		//Declare a string and char in order to use Scanner object
		String strInput;
		char chInput=0;
		//Variables for the for loop
		int intColumn=0;
		int intRow=0;
		int intIndex;
		char chReference;
		 
		//Prompt user for a valid letter from A to Z
		do
		{
			Scanner MyScan=new Scanner(System.in);
			System.out.println("Please enter a letter from A-Z");
			strInput = MyScan.nextLine();
			//Get the string value and convert it to a character only and make it upper case
			chInput=strInput.toUpperCase().charAt(0);
		} while((strInput.length()>1) && (chInput>'A'|| chInput< 'Z'));
		//Assign the number value from user input for the loop count
		intIndex= (chInput-'A') +1;
		chReference=chInput;
		//Create the triangle
		//outer loop creates the columns or height
		for(intColumn=1; intColumn<=intIndex;intColumn+=1)
		{
			//inner loop creates the letters on each row
			for(intRow=1;intRow<=intColumn;intRow+=1)
			{
				System.out.print(chInput);
				chInput-=1;
				
			}
			chInput=chReference;
			System.out.print("\n");
		}
	}
	// ----------------------------------------------------------------------
	// Name: Problem3
	// Abstract: letter pyramid from user input
	//Enter letter A-Z? E
	//	  A
	// 	 ABA
	//  ABCBA
	// ABCDCBA
	//ABCDEDCBA
	// ----------------------------------------------------------------------
	
	public static void Problem3()
	{
		//Declare variables
		//Declare a string and char in order to use Scanner object
		String strInput;
		char chInput=0;
		//Variables for the loops
		int intColumn=0;
		int intRow=0;
		int intSpaces=0;
		int intIndex;
		int intSpaceIndex=0;
		char chReference='A';
		
		
		//Prompt user for a valid letter from A to Z
		do
		{
			Scanner MyScan=new Scanner(System.in);
			System.out.println("Please enter a letter from A-Z");
			strInput = MyScan.nextLine();
			//Get the string value and convert it to a character only and make it upper case
			chInput=strInput.toUpperCase().charAt(0);
		} while((strInput.length()>1) && (chInput>'A'|| chInput< 'Z'));
		//Assign the number value from user input for the loop count
		intIndex= (chInput-'A') +1;	
		intSpaceIndex=intIndex;
		//outer loop creates the columns or height
		for(intColumn=1; intColumn<=intIndex;intColumn+=1)
		{	
			//inner loop creates spaces
				for(intSpaces=1;intSpaces<=intSpaceIndex;intSpaces+=1)
				{
					System.out.print(" ");
				}
			//inner loop creates ascending characters of pyramid	
				for(intRow=2; intRow<=intColumn;intRow+=1)
				{
					System.out.print(chReference);
					chReference+=1;
			//inner loop creates descending characters on the other side		
				}
				for(intRow=1; intRow<=intColumn;intRow+=1)
				{
					System.out.print(chReference);
					chReference-=1;		
				}	
			intSpaceIndex-=1;
			chReference='A';
			System.out.print("\n");
		}
	}

	
}