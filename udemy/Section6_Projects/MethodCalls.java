package Section6_Projects;

public class MethodCalls {
    public static void main(String[] args) {
        doSomething(); 
    }//end main

    public static void doSomething(){
        System.out.println("In doSomething!");

        int result = getSomeValue();

        System.out.println("result: " + result);

    }//end doSomething

    public static int getSomeValue(){
        return 150;
        
    }//end getSomeValue
}//end class
