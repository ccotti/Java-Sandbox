package Section6_Projects;
public class CountUp {
   public static void main(String[] args) {
       countUpTo(0,10);

   } // end main

public static void countUpTo(int num1, int num2) {
    if(num1 <= num2) {
        System.out.println(num1);
        countUpTo(num1 + 1, num2);
    }
} // end countUpTo

}// end class
