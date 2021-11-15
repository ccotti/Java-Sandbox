package Section6_Projects;
public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);        
    }// end main

    // Implicit Base Case
    public static void countDownFrom(int num){
        if(num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }// end if
    }// end countDownFrom
}// end class
