package Print;

//Importing a package to be able to take in input.
import java.util.Scanner;

public class Text
{
	
	public void start()
	{
		
//--------------------Calling a method--------------------------------
		questions();
		moreInput();
//--------------------Calling a method---------------------------------
	}
	
	
//----------------------------Questions----------------------------
	public void questions() 
	
	{
		
		
//----------------------ASKES NAME--------------------------------------
		System.out.print("What is your name?");
//This is scanning any input and will take it in
		Scanner inputScanner = new Scanner(System.in);
		String nameAnswer = inputScanner.nextLine();
//Printing out the answer that was taken
		System.out.println("Your Name is: " + nameAnswer);
//----------------------RETURNS NAME--------------------------------------
		
		
		
		
//---------------------ASKS PROGRAMMING LANGUAGE--------------------------
		System.out.print("What is your favorite Programming Language?");
		
//This is scanning any input and will take it in
		Scanner inputScanner2 = new Scanner(System.in);
		String langAnswer = inputScanner2.next();
		
//Printing out the answer that was taken
		System.out.println("Your Favorite Language is " + langAnswer);
		System.out.println(nameAnswer + " likes " + langAnswer);
//----------------RETURNES PROGRAMMING LANGUAGE AND NAME-------------------
	
		
//WORKING ON HOW TO KEEP INSIDE WHILE STATMENT IN ORDER TO DO MULTIPLE ADDITION PROBLEMS WHITHOUT ASKING TO STAY IN CALC MULTIPLE TIMES	
		
//----------------ASKS TO USE THE CALCULATOR------------------------+
		System.out.print("Would you like to use a Calculator?");
		Scanner inputScanner3 = new Scanner(System.in);
		String calAnswer = inputScanner3.nextLine();

		System.out.println(calAnswer);
//----------------ASKS TO USE THE CALCULATOR------------------------+
		
		
		
//---------------THIS INTRODUCES AND ASKES FOR ONE NUMBER TO ADD---------	
		
		if(calAnswer.equals ("y") || calAnswer.equals ("yes")) 
		{
			while(calAnswer.equals ("y") || calAnswer.equals ("yes")) 
			
			{
				
				System.out.println("Welcome to the Calculator (BETA)");
				System.out.println("Input first number:>");
				Scanner inputScanner4 = new Scanner(System.in);
				int addAnswer1 = inputScanner4.nextInt();			
//---------------THIS INTRODUCES AND ASKES FOR ONE NUMBER TO ADD----------

					
//THIS ASKES FOR THE SECOND NUMBER TO ADD AND PASSES IT TO CALCULATOR METHOD--
				System.out.println("Input second number:>");
				Scanner inputScanner5 = new Scanner(System.in);
				int addAnswer2 = inputScanner5.nextInt();
				calculator(addAnswer1,addAnswer2);

//Asks if you want to leave or stay in the calculator
				System.out.print("Would you like to still use the Calculator?");
			    calAnswer = inputScanner3.nextLine();
			 
		}
			
			System.out.println("See you later!");
		
	} else 
	
			System.out.println("Ok, Bye");
		
//WORKING ON HOW TO KEEP INSIDE WHILE STATMENT IN ORDER TO DO MULTIPLE ADDITION PROBLEMS WHITHOUT ASKING TO STAY IN CALC MULTIPLE TIMES
}
//----------------------------Questions----------------------------
	
	
//------------------------------CALCULATOR--------------------------------
	public int calculator(int one, int two) 
	
	{
		int mathAnswer = one + two;
		System.out.println(mathAnswer);
		return mathAnswer;
	}
//------------------------------CALCULATOR-------------------------------


	private void moreInput() 
	{
//Declaration is an empty variable
		Scanner anotherInputScanner;
		
//initializing variable
		anotherInputScanner = new Scanner(System.in);
	
		System.out.println("What is the meaning of life and everything?");
		int answer = anotherInputScanner.nextInt();
	
		System.out.println("you typed: " + answer);
		anotherInputScanner.nextLine();
		
		//double holds real numbers AKA numbers with a decimal point!
		double magicNumber;
		
		//initialization of magicNumber variable
		System.out.println("Type in your favorite fractional number AKA use a decimal");
		magicNumber = anotherInputScanner.nextDouble();
		
		//anotherInputScanner.nextDouble();
		System.out.println(magicNumber);
		anotherInputScanner.close();
	}

//Checks to see if its ok to convert data types
	public boolean validInt(String example) {
		boolean isValid = false;
		
		try {
			Integer.parseInt(example);
			isValid = true;
		} catch(NumberFormatException error) {
			System.out.println("Type in a valid int value!");
		}
		
		return isValid;
	}
	public boolean validDouble(String example) {
		boolean isValid = false;
		
//This object "TRY" will attempt to run some code
		try {
			Double.parseDouble(example);
			isValid = true;
			}
//If the TRY statment fails then it will go to this and print out text
		catch(NumberFormatException error) {
			System.out.println("Only floating point caluse are allawed for input");
		}
		
		return isValid;
	}
//Checks to see if its ok to convert data types
}
