
// import java.util.Scanner;

// public class a2p1Salary {
    
//     public static void main(String [] args) {
		
// 		System.out.println("Chris Cottingham Assignment 2\n");
// 		//Substitute your name for student name and 
// 		//the lab number for #
		
// 		double employeePay = 0.00;
// 		double hourlyRate = 0.00;
// 		double overTimeHours = 0.00;
// 		double overTimePay = 0.00;
// 		double overTimePayTemp = 0.00;
// 		int hoursWorked = 0;
// 		int counter = 1;
		
// 		// Create Scanner Object
// 		Scanner input = new Scanner(System.in);
		
// 		// Looping through the 3 employees
// 		while (counter <= 3) {
		
// 		// Get Hourly Rate from User
// 		System.out.print("Enter the hourly rate: ");
// 		hourlyRate = input.nextDouble();
// 		// Get Hours Worked from User
// 		System.out.print("Enter hours worked: ");
// 		hoursWorked = input.nextInt();
		
// 		// Calculate Employee Pay
// 		if (hoursWorked <= 40) {
// 			employeePay = hoursWorked * hourlyRate;
// 		}
// 		if (hoursWorked > 40) {
// 			overTimeHours = hoursWorked - 40;
// 			overTimePayTemp = hourlyRate * 1.5;
// 			overTimePay = overTimeHours * overTimePayTemp;	
// 			employeePay = (hoursWorked - overTimeHours) * hourlyRate + overTimePay;
// 		}
		
// 		// Print results
// 		System.out.printf("Pay for employee " + counter + " is " + "$%.2f\n", employeePay);
		
// 		counter ++; // add one to counter
		
// 		} //end of while statement
		
// 		input.close();
		
// 	} // end of main	
	
// } // end of Class
