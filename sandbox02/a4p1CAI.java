// import java.util.Scanner;
// import java.lang.Math;

// public class a4p1CAI {
    
//     public static void main(String [] args) {
		
// 		System.out.println("Chris Cottingham – Assignment 4\n");
// 		//Substitute your name for student name and 
// 		//the lab number for #
		
// 		int x = 0;
// 		int y = 0;
		
// 		// Initial call to Method getRandom
// 		int result = getRandom(x, y);
		
// 		// Getting students answer
// 		Scanner input = new Scanner(System.in);
// 		int guess = input.nextInt();	
		
// 		while (guess == result) {
// 		System.out.println("Very Good");
// 		result = getRandom(x, y);
// 		guess = input.nextInt();
			
// 		if (guess != result){
// 			do {
// 			System.out.println("No. Please try again");
// 			guess = input.nextInt();
// 			}while (guess != result);
// 		}
// 		} // End of while loop
				
// 		input.close();
		
// 	} // end of main
	
// public static int getRandom(int x, int y) {

// 	// getting random numbers from 0 to 9		
// 	int ran1 = (int)(Math.random() * 10);
// 	int ran2 = (int)(Math.random() * 10);
	
// 	// Prompting student to answer multiplication question
// 	System.out.println("How much is " + ran1 + " times " + ran2 + "?");
	
// 	int result = ran1 * ran2;	
	
// 	return result; 
// }	

// } // end of class
