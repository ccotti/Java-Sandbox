// import java.util.Scanner; 

// public class a7p1RectangleTest {
    
// 	public static void main(String[] args) {
// 		System.out.println("Chris Cottingham – Assignment 7\n");
// 		//Substitute your name for student name and 
// 		//the lab number for #
		
// 		// Get length from user input
// 		Scanner inputL = new Scanner(System.in);
// 		System.out.print("Enter a value between 0.0 and 20.0 for the length: ");
// 		double length = inputL.nextDouble();
		
// 		// Get width from user input
// 		Scanner inputW = new Scanner(System.in);
// 		System.out.print("Enter a value between 0.0 and 20.0 for the width: ");
// 		double width = inputW.nextDouble();
		
// 		// Try - Catch to check to ensure length and width are within limits and if not, an exception message is presented. 
// 			try {
// 				if (length > 0.0 && length < 20.0 && width > 0.0 && width < 20.0) {
// 					System.out.println();
// 					System.out.println("Area is : " + a7p1Rectangle.calculateArea(length, width) + " and Perimeter is : " + a7p1Rectangle.calculatePerimeter(length, width));
// 				}
// 				else {
// 					inputL.close();
// 					inputW.close();
// 					throw new IllegalArgumentException("IllegalArgumentException: Length and Width need to be between 0.0 and 20.0");
// 				}
// 			}	
// 				catch (IllegalArgumentException e){
// 					System.out.println();
// 					System.out.print(e.getMessage());
// 				}
					
// 		// to close the scanners
// 		inputL.close();
// 		inputW.close();
				
// 	}// end of main

// } // end of class
