// import java.util.Collections;
// import java.util.ArrayList;
// import java.util.Random;

// public class a5p1DiceRolling {

//     public static void main(String [] args) {
		
// 		System.out.println("Chris Cottingham – Assignment 5\n");
// 		//Substitute your name for student name and 
// 		//the lab number for #
		
// 		//object of class Random (one for one dice and again for the second dice
// 		Random randomNum = new Random();
// 		int [] totals = new int[13];
// 		int dieOne = 0; // dice face 1
// 		int dieTwo = 0; // dice face 2
// 		ArrayList<Integer> sumList = new ArrayList<Integer>();  // mkyong
				
//  		System.out.printf("%4s%8s%n", "Face", "Results"); // prints table header
		
// 		// output the total number of times each dice face hits
// 		for (int face = 1; face < totals.length; face++) {
// 			// roll die 36,000 times
// 			for (int roll = 1; roll <= 36_000; roll++) {
// 				dieOne = 1 + randomNum.nextInt(6);  // roll dice one
// 				dieTwo = 1 + randomNum.nextInt(6);	// roll dice two
// 				int sum = dieOne + dieTwo;  // sum rolls
// 				sumList.add(sum); // add to list   // mkyong
// 			} // end of for loop
			
// 			System.out.printf("%2s%7s%n", face, Collections.frequency(sumList, face)); // print out the frequency of each roll. (mkyong)

// 		} // End of For Loop 
		
// 	} // end of main
	
// } // end of class