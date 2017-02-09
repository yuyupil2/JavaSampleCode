// ------------------------------------------------------------------------------------------
// Name: Daniel Loscherblanco
// Class: Java 1
// Abstract: Homework 3A. This program explores loops
// ------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------
// Imports
// ------------------------------------------------------------------------------------------
import java.io.*;
public class CHomework3A {
	// --------------------------------------------------------------------------------
	// Name: main
	// Abstract: This is where the program starts.  Examples of loops and user inputs
	// Homework 3A and 3B are in the same file as per extra credit
	// --------------------------------------------------------------------------------

	

	public static void main(String[] args) {	
	Step1();
	Step2();	
	}
	
	// ----------------------------------------------------------------------
	// Name: Step1
	// Abstract: Runs through various examples of loops
	// ----------------------------------------------------------------------
	public static void Step1()
	{
	//Write a loop that will print all the whole numbers from 1 to 100.
			//Declare the variables
			int intNumber=0; 
			int intIndex=0;
			int intTotal=0;
				
			System.out.println("Start of printing whole numbers:");
			for(intNumber=1; intNumber<=100;intNumber+=1)
			{
				System.out.println(intNumber);
			}
			System.out.println("End of printing whole numbers");
				
	//Write a loop that will add all the whole numbers from 1 to 1000 
	//and print only the total.
			for (intIndex=1; intIndex<=1000; intIndex+=1)
			{
				intTotal+=intIndex;
			}
			System.out.println("The total of all numbers from 1 to 1000 is: "+intTotal);
			//Reset total for next loop problem
			intTotal=0;
				
	//Write a loop that will add all the ODD numbers from 1 to 300 
	//and print only the total.
			for (intIndex=1; intIndex<=300; intIndex+=2)
			{
				intTotal+=intIndex;
			}
			System.out.println("The total of all odd numbers from 1 to 300 is: "+intTotal);
			//Reset total for next loop problem
			intTotal=0;
				
	//Write a loop that will add all the EVEN numbers from 2 to 146
	//and print only the total
			for (intIndex=2; intIndex<=146; intIndex+=2)
			{
				intTotal+=intIndex;
			}
			System.out.println("The total of all even numbers from 2 to 146 is: "+intTotal);
			//Reset total for next loop problem
			intTotal=0;
				
	//Write a loop that will add every 3rd number from 2000 to 6 and print the total
			for (intIndex=2000; intIndex>=6; intIndex-=3)
			{
				intTotal+=intIndex;
			}
			System.out.println("The total every 3rd number from 2000 to 6 is: "+intTotal);
			//Reset total for next loop problem
			intTotal=0;
	}
	
	// ----------------------------------------------------------------------
	// Name: Step2
	// Abstract: Call on ReadIntegerFromUser function and check if integer is 
	//odd or even. It also asks the user for a number between 1-100
	// ----------------------------------------------------------------------
	public static void Step2()
	{
	//	Read in an integer value from the user and print 
	//out if the number is even or odd.	
		
		//Declare variables
		int intInput=0;
		//Prompt User for integer
		System.out.println("Enter an integer to check if it is even or odd:");
		intInput= ReadIntegerFromUser();
		//Evaluate if the number is even or odd
		if(intInput %2 == 0)
		{
			System.out.println("The Number is Even");
		}
		else
			System.out.println("The number is odd");
	//Read in an integer value from the user from 1 and 100. 
	//Loop until a value in that range is entered. 
	//After a number in that range is entered print it out.
		//Prompt user for valid integer
		do
		{
			System.out.println("Enter a valid number between 1-100");
			intInput = ReadIntegerFromUser();
		} while( intInput <1 || intInput >100);
		System.out.println("The value you entered was: "+intInput);
	}

	
	// ----------------------------------------------------------------------
	// Name: ReadIntegerFromUser
	// Abstract: Read an integer from the user
	// ----------------------------------------------------------------------
	public static int ReadIntegerFromUser( )
	{
		int intValue = 0;
		try
		{
			String strBuffer = "";	
			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;
			// Read a line from the user
			strBuffer = burInput.readLine( );	
			// Convert from string to integer
			intValue = Integer.parseInt( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}	
		// Return integer value
		return intValue;
	}
}
