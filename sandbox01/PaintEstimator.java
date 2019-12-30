/*
package Unit02;

import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      final double gallonPaint = 350.0;
      double paintAmount;
      int cansNeeded; 
            
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();                      // FIXME (1): Prompt user to input wall's width
      
      // Calculate and output wall area
      wallArea = (wallHeight * wallWidth);                // FIXME (1): Calculate the wall's area
      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
      
      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
      paintAmount = (wallArea / gallonPaint);
      System.out.println("Paint needed: " + paintAmount + " gallons");
      
      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
      cansNeeded = (int)Math.round(paintAmount);
      System.out.println("Cans needed: " + cansNeeded + " can(s)");
      scnr.close();
      
   }
}
*/
