// ------------------------------------------------------------------------------------------
// Name: Daniel Loscherblanco
// Class: Java 1
// Abstract: Homework 6. This program will manipulate strings
// ------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------
// Imports
// ------------------------------------------------------------------------------------------

public class CHomework6 {

	public static void main(String[] args)
	{
		// --------------------------------------------------------------------------------
		// Name: main
		// Abstract: This is where the program starts. A program that involves
		// 10 steps from the homework
		// --------------------------------------------------------------------------------
		
		// Problem #1 – Count Vowels
		 int intVowelCount = CountVowels( "I Love Star Trek" );		// Should return 5
		System.out.println( "Vowel Count = " + intVowelCount );

		
		//2. Count the index of the first occurrence of a specified character
		int intLetterIndex = FindletterInString("I Love Star Trek",'T');		// Should return 8: index of first T
		System.out.println( "Letter index = " + intLetterIndex );

		//3. Count Letter
		int intLetterCount = CountLetterInString( "I Love Star Trek", 't' );		// Should return 2
		System.out.println( "Letter Count = " + intLetterCount );

		// Problem #4 – Left
		String strBuffer = left("I Love Star Trek", 3 );					// Should return “I L”
		System.out.println( "Left(3) = " + strBuffer );
		
		// Problem #5 – Right
		strBuffer = Right( "I Love Star Trek", 3 );					// Should return “rek”
		System.out.println( "Right(3) = " + strBuffer );
		
		// Problem #6 – VB SubString
		strBuffer = VBSubString ( "I Love Star Trek", 2, 4 );			// Should return “Love”
		System.out.println( "VB SubString = " + strBuffer );
		
		// Problem #7 – Java SubString
		strBuffer = JavaSubString ( "I Love Star Trek", 2, 6 );			// Should return “Love”
		System.out.println( "Java SubString = " + strBuffer );
		
		// Problem #8 – Java Compare
		String strSource= "I Love Star Trek";
		if( CompareStrings( strSource, new String("I Love Star Trek") ) == true ) 		// Should return true
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		
		// Problem #9 – Count Words
		int intWordCount = CountWordsInString( "     I      Love Star      Trek     " );	// Should return 4
		System.out.println( "Word Count = " + intWordCount );

	}

		// --------------------------------------------------------------------------------
		// Name: CountVowelsInString()
		// Abstract: Counts the vowels in a string that is passed to it
		// --------------------------------------------------------------------------------
	
	public static int CountVowels(String strInput)
	{
		int intVowelCount=0;
		int intIndex;
		String strModifiedInput= strInput.toUpperCase();
			
		for (intIndex=0; intIndex < strModifiedInput.length(); intIndex++)
		{
			if((strModifiedInput.charAt(intIndex)=='A')||(strModifiedInput.charAt(intIndex)=='E')||(strModifiedInput.charAt(intIndex)=='I')||(strModifiedInput.charAt(intIndex)=='O'||(strModifiedInput.charAt(intIndex)=='U')))
			{
			intVowelCount++;
			}
		}		
		return intVowelCount;
	}
	
	
	
		// --------------------------------------------------------------------------------
		// Name: FindLetterInString()
		// Abstract: returns the the index value of the first occurrence of a specified character
		// --------------------------------------------------------------------------------
	
	public static int FindletterInString( String strInput, char chCompare)
	{
		int intIndex;
		String strModifiedInput= strInput.toUpperCase();
		
		for (intIndex=0; intIndex < strModifiedInput.length(); intIndex++)
		{
			if (strModifiedInput.charAt(intIndex)==chCompare)
			{
				break;
			}
		}
		return intIndex;
	}
		// --------------------------------------------------------------------------------
		// Name: CountLetterInString()
		// Abstract: returns the the index value of the first occurrence of a specified character
		// --------------------------------------------------------------------------------
	public static int CountLetterInString(String strInput, char chCompare)
	{
		
		int intCount=0;
		int intIndex;
		String strModifiedInput=strInput.toUpperCase();
		
		for (intIndex=0; intIndex < strModifiedInput.length(); intIndex++)
		{
			if (strModifiedInput.charAt(intIndex)==chCompare)
			{
				intCount++;
			}
		}
		return intCount;
	}
	
		// --------------------------------------------------------------------------------
		// Name: Left()
		// Abstract: returns the values of an input string to the left of the provided index location
		// --------------------------------------------------------------------------------
	public static String left(String strInput, int intIndexIn)
	{
		if(intIndexIn>strInput.length() || intIndexIn<0)
		{
			intIndexIn=0;
		}
		char  astrLeft[];
		astrLeft=new char[intIndexIn];
		int intIndex;
		
		for(intIndex=0; intIndex< astrLeft.length;intIndex++)
		{
			astrLeft[intIndex]=strInput.charAt(intIndex);
		}
		String strOutput= new String(astrLeft);
		return strOutput;
	}
	
		// --------------------------------------------------------------------------------
		// Name: Right()
		// Abstract: returns the values of an input string to the Right of the provided index location
		// --------------------------------------------------------------------------------
		public static String Right(String strInput, int intIndexIn)
		{
			if(intIndexIn>strInput.length() || intIndexIn<0)
			{
				intIndexIn=0;
			}
			char  astrRight[];
			astrRight=new char[intIndexIn];
			int intIndex;
			int intIndexOut=0;
			
			for(intIndex=(strInput.length()-intIndexIn); intIndex< strInput.length();intIndex++)
			{
				astrRight[intIndexOut]=strInput.charAt(intIndex);
				intIndexOut++;
			}
			String strOutput= new String(astrRight);
			return strOutput;
		}
		
		// --------------------------------------------------------------------------------
		// Name: VBSubString()
		// Abstract: returns a substring based on the input string, start index and number of characters
		// --------------------------------------------------------------------------------
		public static String VBSubString(String strInput, int intStartIndex, int intLength)
		{
			// Trim the input. defaults to zero start index if number is less than 0 or greater than the length
			//of the input string
			if(intStartIndex<0 || intStartIndex>strInput.length())
			{
				intStartIndex=0;
			}
			//Trim the length input value to 0 if the value is larger than the input string length
			if(intLength>strInput.length())
			{
				intLength=0;
			}
			int intIndex;
			char  astrSubString[];
			astrSubString=new char[intLength];
			int intIndexOut=0;
			
			for (intIndex=0;intIndex<intLength;intIndex++)
			{
				astrSubString[intIndexOut]=strInput.charAt(intStartIndex);
				intIndexOut++;
				intStartIndex++;			
			}
			String strOutput=new String(astrSubString);
			return strOutput;
		}
		
		// --------------------------------------------------------------------------------
		// Name: JavaSubString()
		// Abstract: returns a substring based on the input string, start index and end index
		// --------------------------------------------------------------------------------
		public static String JavaSubString(String strInput, int intStartIndex, int intStopIndex)
		{
			if(intStartIndex<0||intStartIndex>strInput.length())
			{
				intStartIndex=0;
			}
			if(intStopIndex>strInput.length())
			{
				intStopIndex=strInput.length();
			}
			
			int intIndex;
			char  astrSubString[];
			astrSubString=new char[intStopIndex-intStartIndex];
			int intNumberOfCharacters=intStopIndex-intStartIndex;
			
			for (intIndex=0; intIndex<intNumberOfCharacters;intIndex++)
			{
				astrSubString[intIndex]=strInput.charAt(intStartIndex);
				intStartIndex++;
			}
			
			String strOutput=new String (astrSubString);
			return strOutput;
		}
		
		// --------------------------------------------------------------------------------
		// Name: CompareStrings()
		// Abstract: Compares two strings that are passed to it and returns true if they are the same
		// --------------------------------------------------------------------------------
		public static Boolean CompareStrings(String strSource, String strCompare)
		{
			if(strSource.length()!=strCompare.length())
			{
				return false;
			}
			else
			{
				for(int intIndex=0; intIndex< strSource.length();intIndex++)
				{
					if(strSource.charAt(intIndex)!=strCompare.charAt(intIndex))
					{
						return false;
					}
				}
			}
			return true;
		}
		
		// --------------------------------------------------------------------------------
		// Name: CountWordsInString()
		// Abstract: Counts the number of words in a string that is passed to it
		// --------------------------------------------------------------------------------
		public static int CountWordsInString(String strInput)
		{
			int intWordCount=0;
			int intIndex;					
			for(intIndex=0; intIndex< strInput.length();)
			{
				if(strInput.charAt(intIndex)!=' ')
				{
					while(strInput.charAt(intIndex)!=' ')
					{
						intIndex++;
						if(intIndex>=strInput.length())
							break;
					}
					intWordCount++;
				}
				else
				{
					intIndex++;
				}
			}
			return intWordCount;
		}

}
