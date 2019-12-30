/**
 * @author CCottingham
 */

//package Chapter2;
//import java.util.*;
//
//public class ComputeLoan {
//    public static void main(String[] args) {
//        // Create Scanner
//        Scanner input = new Scanner(System.in);
//        
//        // Enter annual interest rate in percentage, e.g.: 7.25%
//        System.out.print("Enter annual interest rate, e.g.: 7.25%: ");
//        double annualInterestRate = input.nextDouble();
//        
//        // Get Monthly Interest Rate
//        double montlyInterestRate = annualInterestRate / 1200;
//        
//        // Enter Number of Years
//        System.out.print("Enter the number of years as an integer, e.g., 5: ");
//        int numberOfYears = input.nextInt();
//        
//        // Enter Loan Amount 
//        System.out.print("Enter the loan amount, e.g., 120000.95: ");
//        double loanAmount = input.nextDouble();
//        
//        // Calculate Payment
//        double monthlyPayment = loanAmount * montlyInterestRate / (1 - 1 / Math.pow(1 + montlyInterestRate, numberOfYears * 12));
//        double totalPayment = monthlyPayment * numberOfYears * 12;
//        
//        // Display Results
//        System.out.println("The monthly payment is: $" + (int)(monthlyPayment * 100) / 100.0);
//        System.out.println("The total payment is: $" + (int)(totalPayment * 100) / 100.0); 
//    }
//}
