/**
 *
 * @author CCottingham
 */

//package Chapter2;
//import java.util.*;
//
//public class CompoundValue {
//    public static void main(String[] args) {
//        // get the amount to save
//        System.out.print("Enter the montly saving amount e.g., 100.00: ");
//        Scanner input = new Scanner(System.in);
//        double savingsAmount = input.nextDouble();
//        
//       // Get annual Interest Rate
//       System.out.print("Enter the annual interest rate, e.g., 5: ");
//       double annualRate = input.nextInt();
//               
//       // Calculate the Interest Rate
//       double interestRate = (annualRate / 100) / 12;
//       
//       // Calculate the Savings after 6 mos
//       double totalSaved = 0.00;
//       totalSaved = (savingsAmount + totalSaved) * (1 + interestRate);
//       double totalSavedMO2 = (savingsAmount + totalSaved) * (1 + interestRate); 
//       double totalSavedMO3 = (savingsAmount + totalSavedMO2) * (1 + interestRate);
//       double totalSavedMO4 = (savingsAmount + totalSavedMO3) * (1 + interestRate);
//       double totalSavedMO5= (savingsAmount + totalSavedMO4) * (1 + interestRate);
//       double totalSavedMO6 = (savingsAmount + totalSavedMO5) * (1 + interestRate);
//      
//       
//       // Display the results
//       System.out.println("After one month the account value is: $" + totalSaved);
//       System.out.println("After two months the account value is: $" + totalSavedMO2);
//       System.out.println("After three months the account value is: $" + totalSavedMO3);
//       System.out.println("After four months the account value is: $" + totalSavedMO4);
//       System.out.println("After five months the account value is: $" + totalSavedMO5);       
//       System.out.println("After six months the account value is: $" + totalSavedMO6);
//       
//    }
//}
