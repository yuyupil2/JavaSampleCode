import java.util.Scanner;
public class Chomework5A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --------------------------------------------------------------------------------
		// Name: main
		// Abstract: This is where the program starts. A program that involves
		// 10 steps from the homework
		// --------------------------------------------------------------------------------

		// 1. Declare an array
		int aintValues[];
		
		// 2. set the array size from user input
				int intArraySize;
		intArraySize = MakeArray();
		aintValues = new int[intArraySize];
		
		// 3.populate the array by prompting the user
		PopulateArray(aintValues);
		
		// 4. Print the array
		PrintArray(aintValues);
		
		// 5. Calculate average of array and print
		int intAverage;
		intAverage = CalculateAverage(aintValues);
		System.out.println("The average of the array is: " + intAverage);
		
		// 6. Find the max value in the array and print it out from main
		int intMaximumValue;
		intMaximumValue = MaxArrayValue(aintValues);
		System.out.println("The maximum value of the array is: " + intMaximumValue);
		
		// 7. copy the array and add a value at the end to the new array. Print
		// the new array
		aintValues = AddValueToEndOfArray(aintValues, 5);// insert 5 at the end of the array
		PrintArray(aintValues);
		
		//8. copy the array and add a value at the beginning to the new array. Print
		// the new array by call
		System.out.println("Reset the array for problems 8");
		aintValues=RestartProblems(aintValues,intArraySize);
		aintValues=AddValueToStartOfArray(aintValues,10); //insert 10 at the start of the array
		PrintArray(aintValues);
		
		//9. insert an item in a specified location in the array
		System.out.println("Reset the array for problems 9");
		aintValues=RestartProblems(aintValues,intArraySize);
		aintValues=InsertValueIntoArray(aintValues,42,0);// insert 42 at location 2
		PrintArray(aintValues);
		
		//10. Remove a value from the array at specified location
		System.out.println("Reset the array for problems 10");
		aintValues=RestartProblems(aintValues,intArraySize);
		aintValues=RemoveValueFromArray(aintValues,2);// remove value at location 2
		PrintArray(aintValues);
	}
	// --------------------------------------------------------------------------------
	// Name: restartProblems()
	// Abstract: restarts from problem 1 to reset the original array from user
	// --------------------------------------------------------------------------------
		public static  int [] RestartProblems( int [] aintValues, int intArraySize)
		{
			
			intArraySize = MakeArray();
			aintValues = new int[intArraySize];
			PopulateArray(aintValues);
			PrintArray(aintValues);
			return aintValues;
			
		}
	
	
	// --------------------------------------------------------------------------------
	// Name: MakeArray()
	// Abstract: Function that will prompt user for a number between 1-100 and allocate
	// the number provided to the size of the array in the calling code
	// --------------------------------------------------------------------------------
		public static int MakeArray() {
		// prompt the user until they provide the range requested
		int intInput;
		do {
			Scanner MyScan = new Scanner(System.in);
			System.out.println("Please enter the size of the array with a number between 1-100");
			intInput = MyScan.nextInt();
		} while (intInput < 1 || intInput >= 100);

		return intInput;
	}

	// --------------------------------------------------------------------------------
	// Name: PopulateArray()
	// Abstract: subroutine to prompt the user to populate the calling array
	// --------------------------------------------------------------------------------
		public static void PopulateArray(int aintValues[]) 
		{
			// Prompt the user for each value of array from the size of array of
			// calling function
			int intIndex = 0;
			int intInput;
			for (intIndex = 0; intIndex < aintValues.length; intIndex += 1)
			{
				// Input validation so the user doesn't enter an out of range
				// integer
				do {
					Scanner MyScan = new Scanner(System.in);
					System.out.print("Please enter value " + (intIndex + 1) + ": ");
					intInput = MyScan.nextInt();
				} while (intInput > 2147483647);
				aintValues[intIndex] = intInput;
			}
	
		}
	// --------------------------------------------------------------------------------
	// Name: PrintArray()
	// Abstract:  subroutine that will print elements inside the array from the calling
	// procedure
	// --------------------------------------------------------------------------------
	
		public static void PrintArray(int aintValues[]) 
		{
			// loop and print out each element of the array to console
			int intIndex = 0;
			System.out.println("The values in the array are:");
			for (intIndex = 0; intIndex < aintValues.length; intIndex += 1) 
			{
				System.out.print(aintValues[intIndex] + " ");
			}
			System.out.println("");
		}

	// --------------------------------------------------------------------------------
	// Name: CalculateAverage
	// Abstract: This function calculates the average of an array that is passed to it
	// --------------------------------------------------------------------------------	
		public static int CalculateAverage(int aintValues[]) 
		{
			// loop and add each value to calculate total
			int intTotal = 0;
			int intAverage;
			int intIndex = 0;
			for (intIndex = 0; intIndex < aintValues.length; intIndex += 1)
			{
				intTotal += aintValues[intIndex];
			}
			intAverage = intTotal / aintValues.length;
			return intAverage;
		}

	// --------------------------------------------------------------------------------
	// Name: MaxArrayvalue
	// Abstract: This function will return the max value of an array that is passed to it
	// --------------------------------------------------------------------------------	
	
		public static int MaxArrayValue(int aintValues[]) 
		{
			// loop and find and compare each value to find the maximum value
			int intMaximumValue = aintValues[0];
			int intIndex;
			for (intIndex = 0; intIndex < aintValues.length; intIndex += 1)
			{
				if (aintValues[intIndex] > intMaximumValue) 
				{
					intMaximumValue = aintValues[intIndex];
				}
			}
			return intMaximumValue;
		}

	// --------------------------------------------------------------------------------
	// Name: AddValueToEndOfArray
	// Abstract: This function will copy the contents of an array and add an extra value
	//			 from the calling code to the end of the array
	// --------------------------------------------------------------------------------	
	
		public static int[] AddValueToEndOfArray(int aintValues[], int intLastValue)
		{
			int aintValues2[];
			aintValues2 = new int[aintValues.length + 1];
			
			for (int i = 0; i < aintValues.length; i++)
			{
				aintValues2[i]=aintValues[i];
			}
			aintValues2[aintValues2.length-1]=intLastValue;
			return aintValues2;
		}

	// --------------------------------------------------------------------------------
	// Name: AddValueToEndOfArray
	// Abstract: This function will copy the contents of an array and add an extra value
	//			 from the calling code to the start of the array
	// --------------------------------------------------------------------------------	
		public static int[] AddValueToStartOfArray(int aintValues[],int intFirstValue)
		{
			int aintValues2[];
			aintValues2=new int[aintValues.length +1];
			aintValues2[0]=intFirstValue;
			for (int intIndex=1;intIndex <aintValues2.length; intIndex++)
			{
				aintValues2[intIndex]=aintValues[intIndex-1];
			}
			
			return aintValues2;
		}
	// --------------------------------------------------------------------------------
	// Name: InsertValueIntoArray
	// Abstract: This function will copy the contents of an array and add an extra value
	//			 from the calling code to the specified location in the array
	// --------------------------------------------------------------------------------	
		public static int[] InsertValueIntoArray(int aintValues[],int intValue,int intIndexIn)
		{
			int aintValues2[];
			aintValues2=new int[aintValues.length+1];
			if(intIndexIn<0)
			{
				intIndexIn=0;
			}
			for (int intIndex=0;intIndex <aintValues.length;intIndex++)
			{
				
				aintValues2[intIndex]=aintValues[intIndex];
				if(intIndex==intIndexIn)
				{
					aintValues2[intIndex]=intValue;
				}
				
			}
			for (int intIndex=(intIndexIn+1);intIndex<aintValues2.length;intIndex++)
			{
				aintValues2[intIndex]=aintValues[intIndex-1];
			}
			return aintValues2;
		}
		
	// --------------------------------------------------------------------------------
	// Name: RemoveValueFormArray()
	// Abstract: This function will copy the contents of an array and remove an item
	// at a specified location within the array	
	// --------------------------------------------------------------------------------	
		public static int[] RemoveValueFromArray(int aintValues[],int intIndexIn)
		{
			int aintValues2[];
		    aintValues2=new int[aintValues.length-1];
		    if(intIndexIn<0)
			{
				intIndexIn=0;
			}
			
		    for (int intIndex=0; intIndex <aintValues2.length;intIndex++)
		    {
		    	aintValues2[intIndex]=aintValues[intIndex];
		    	if(intIndex==intIndexIn)
		    	{
		    		aintValues2[intIndex]=aintValues[intIndex+1];
		    	}	
		    }
		    
		    for (int intIndex=(intIndexIn+1);intIndex < aintValues2.length;intIndex++)
		    {
		    	aintValues2[intIndex]=aintValues[intIndex+1];
		    }
			return aintValues2;
		}
}
