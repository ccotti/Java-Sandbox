/*package Unit03;
   This is frustrating... my original code followed the instructions to the letter. But, when I sumbitted for grading,
   it showed something completely different and said it was wrong. So, I added the code to make if right for the grading
   part and commented out the original code.

import java.util.Scanner;

public class Ch3Lab2 {
   public static void main(String[] args) {
       String season;
	    int month;
	    		
		Scanner scnr = new Scanner(System.in);
	      System.out.println("Enter a numeric month and I will display the season.");
	      month = scnr.nextInt();
	      
	   switch (month) {
	      case 1:
	      case 2:
	      case 12:
	    	  season = "winter";
	    	  System.out.println("Month: " + season);
		     //System.out.println("Month: " + month);
		     //System.out.println(season);
		      break;
	      case 3:
	      case 4:
	      case 5:
	    	  season = "spring";
		     System.out.println("Month: " + season);
		     //System.out.println("Month: " + month);
		     //System.out.println(season);
		      break;
	      case 6:
	      case 7:
	      case 8:
	    	  season = "summer";
		     System.out.println("Month: " + season);
		     //System.out.println("Month: " + month);
		     //System.out.println(season);
		      break;
	      case 9:
	      case 10:
	      case 11:
	    	  season = "fall";
		     System.out.println("Month: " + season);
		     //System.out.println("Month: " + month);
		     //System.out.println(season);
		      break;
	      default: 
	    	  System.out.println("Month: I�m sorry, an invalid month was entered.");
	    	  //System.out.println("Month: " + month);
	    	  //System.out.println("I�m sorry, an invalid month was entered.");
	    	  break;
	      }
	      
	      scnr.close();
   }
}
*/