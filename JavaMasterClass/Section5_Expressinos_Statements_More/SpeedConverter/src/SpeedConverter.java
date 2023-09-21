public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour); //1 mile pre hour is 1.609 kilometers per hour
            System.out.println(kilometersPerHour + " kn/h = " + milesPerHour + " mi/h");
        }
    }
}