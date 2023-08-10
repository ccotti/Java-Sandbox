public class FeetInchesCentimeters {

    public static void main(String[] args) {
        calcFeetAdnInchesToCentimeters(6,0);
        calcFeetAdnInchesToCentimeters(157);
        calcFeetAdnInchesToCentimeters(-5);
    }

    public static double calcFeetAdnInchesToCentimeters(double feet, double inches) {

        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAdnInchesToCentimeters(double inches){
        if(inches < 0) {
            System.out.println("Invalid parameters");
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAdnInchesToCentimeters(feet, remainingInches);

    }

}
