package Data_types;

public class Data_types {

    public static double convert_degrees_Fahrenheit_to_Celsius(double input){
        return 5*input/9+32;
    }
    public static double convert_degrees_Celsius_to_Fahrenheit(double input){
        return 5*input/9-32;
    }
    public static double convert_inches_to_metres(double input){
        return 2.54*input;
    }
    public static double convert_metres_to_inches(double input){
        return input/2.54;
    }
    public static int days_to_minutes(int input){
        return 1440*input;
    }
    public static void print_GMT(long input){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + input) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
    public static double calculate_BMI(double height, double weight){
        return weight/height/height;
    }
    public static void print_speeds(int distance, int minutes){
        double mps, kph, mph;
        mps = ((double)(distance/minutes))*60;
        kph = ((double)(distance/minutes))/60_000;
        double MILE = 1.609344;
        mph = kph/MILE;
        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);
    }
}
