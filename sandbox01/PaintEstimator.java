

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
      wallWidth = scnr.nextDouble(); 
      
      // Calculate and output wall area
      wallArea = (wallHeight * wallWidth); 
      System.out.println("Wall area: " + wallArea + " square feet"); 
      
      paintAmount = (wallArea / gallonPaint);
      System.out.println("Paint needed: " + paintAmount + " gallons");
      
      cansNeeded = (int)Math.round(paintAmount);
      System.out.println("Cans needed: " + cansNeeded + " can(s)");
      scnr.close();
      
   }
}  