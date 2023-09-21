public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        /* Is dog barking before 8 and after 22 hours. Hours must be between 0-23 */

        if (hourOfDay >= 0 && hourOfDay < 8 && barking == true) {
            barking = true;
        }
        else if (hourOfDay > 22 && hourOfDay <= 23 && barking == true) {
            barking = true;
        }
        else if (hourOfDay >= 0 && hourOfDay < 8 && barking == false) {
            barking = false;
        }
        else if (hourOfDay > 22 && hourOfDay <= 23 && barking == false) {
            barking = false;
        }
        else {
            barking = false;
        }
        return barking;
    }
}
