package Print;

//Importing a package to be able to take in input.
import java.util.Scanner;

public class Text

{
	public void start()
	
	{
//Println is a way to print the entire text on one line
		System.out.println("Standard Output for Java :)");
		
//Print is just gonna print the following text in front of what ever other text is behind it.
		System.out.print("OH boy more ");
		System.out.println("Words ");
		
		
//--------------------Calling a method--------------------------------
		questions();
//--------------------Calling a method---------------------------------
	}
	
	
	
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
	
		
	
		
//----------------ASKS TO USE THE CALCULATOR------------------------+
		System.out.print("Would you like to use a Calculator?");
		Scanner inputScanner3 = new Scanner(System.in);
		String calAnswer = inputScanner3.nextLine();

		System.out.println(calAnswer);
//----------------ASKS TO USE THE CALCULATOR------------------------+
		

//For SECURITY this closes the Scanner so it CANT GET ANY INPUT
		inputScanner.close();
		inputScanner2.close();
		inputScanner3.close();
//-----------------------------------------------------------------------
		
		
//---------------THIS INTRODUCES AND ASKES FOR ONE NUMBER TO ADD---------		
		if(calAnswer.equals ("y") || calAnswer.equals ("yes")) 
		
		{
			System.out.println("Welcome to the Calculator (BETA)");
			System.out.println("Input first number:>");
			Scanner inputScanner4 = new Scanner(System.in);
			
			//PROBLEM
			String addAnswer1 = inputScanner4.nextLine();
			
//-----------------------------------------------------------------------

			
			
			
//THIS ASKES FOR THE SECOND NUMBER TO ADD AND PASSES IT TO CALCULATOR METHOD
			System.out.println("Input second number:>");
			Scanner inputScanner5 = new Scanner(System.in);
			int addAnswer2 = inputScanner5.nextInt();
			inputScanner5.close();
			//calculator(addAnswer1,addAnswer2);
//For SECURITY this closes the Scanner so it CANT GET ANY INPUT
			inputScanner4.close();
			inputScanner5.close();
//------------------------------------------------------------------------
		} else {
			System.out.println("Okay then :(");
	}
}
	
	
	
//------------------------------CALCULATOR--------------------------------
	public int calculator(int one, int two) 
	
	{
		int mathAnswer = one + two;
		return mathAnswer;
	}
//------------------------------CALCULATOR-------------------------------
}
