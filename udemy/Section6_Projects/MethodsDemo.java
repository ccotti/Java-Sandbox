package Section6_Projects;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        double squareNum = numSquared(3.5);
        System.out.println("The numbers squared is " + squareNum);

    } // end main

    // void, paramterless
    public static void printHello() {
        System.out.println("Hello There!");
    } // end printHello

    //void, parameterized
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    } // end printNumber

    //value-returning, parameterless
    public static int giveMe10() {
        return 10;
    } // end giveMe10

    // value-returning, parameterized
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    } // end addThese

    public static double numSquared(double b){
        return b * b;
    } // end numSquared


} // end classs
