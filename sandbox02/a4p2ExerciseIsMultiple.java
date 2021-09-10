
// import java.util.Scanner; 

// public class a4p2ExerciseIsMultiple {
    
//     public static void main(String [] args) {
		
// 		System.out.println("Chris Cottingham – Assignment 4\n");
// 		//Substitute your name for student name and 
// 		//the lab number for #
		
// 		// Variables to be used for input and calculations
// 		int number1 = 0;
// 		int number2 = 0;
		
// 		Scanner input = new Scanner(System.in);
		
// 		// Prompt user for input of First and Second Integers
// 		System.out.print("Enter first integer: ");
// 		number1 = input.nextInt();
// 		System.out.print("Enter second integer: ");
// 		number2 = input.nextInt();
		
// 		// Method call and return value assigned to "result"
// 		int result = isMultiple(number2, number1);
		
// 		// checking to see if result is equal to zero or not. Then printing out the results. 
// 		if (result == 0) {
// 			System.out.println(number2 + " is a multiple of " + number1);
// 		}
// 		else {
// 			System.out.println(number2 + " is not a multiple of " + number1);
// 		}
				
// 		input.close();  //Closes the scanner
		
// 	} // end of main
	
// 	// Method used to determine if the second value is a multiple of the first 
// 	public static int isMultiple(int x, int y) {
		
// 		int multipleReturn = y % x;
// 		return multipleReturn; 
		
// 	} // end of method isMultiple
	
// } // end of class
	
