/**
 * @author CCottingham
 */

//package Chapter2;
//import static java.lang.Math.pow;
//import java.util.*;
//
//public class futureValue {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        // Enter investment amount
//        System.out.print("Enter investment amount: ");
//        double investmentAmount = input.nextDouble();
//        
//        // enter annual interest rate in percentage
//        System.out.print("Enter annual interst rate in percentage: ");
//        double annualInterestRate = input.nextDouble();
//        double monthlyInterestRate = annualInterestRate / 1200;
//                              
//        // Enters number of years
//        System.out.print("Enter number of years: ");
//        int years = input.nextInt();
//        
//        // Display accumulated value
//        double futureInvestmentValue = investmentAmount * pow(1 + monthlyInterestRate, years * 12) ;
//        System.out.println("Accumulated value is: " + futureInvestmentValue);   
//        System.out.println("Your profit is: " + (futureInvestmentValue - investmentAmount));
//    }
//}
