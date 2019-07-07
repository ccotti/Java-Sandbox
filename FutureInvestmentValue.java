/**
 * @author CCottingham
 */

//package Chapter6;
//import java.util.*;
//
//public class FutureInvestmentValue {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        // Get Investment Amount
//        System.out.print("Enter the investment amount: ");
//        double investmentAmount = input.nextDouble();
//        
//        // Get Monthly Interest Rate
//        System.out.print("Enter the annual interest rate: ");
//        double annualInterestRate = input.nextDouble();
//        double monthlyInterestRate = annualInterestRate / 1200;
//        
//        // Get the total number of years 
//        System.out.print("Enter the number of years: ");
//        int maxYears = input.nextInt();
//        
//        // Call Method to get Future Investment Value
//        System.out.println("The investment year and future investment value is: ");
//        System.out.println("Year      Value");
//        for (int years = 1; years <= maxYears; years++) {
//            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);   
//            System.out.println(years + "          " + futureValue);
//        }
//    }
//    
//    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
//        double fiv = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
//        return fiv; 
//    }          
//}
