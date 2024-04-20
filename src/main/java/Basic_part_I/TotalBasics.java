package Basic_part_I;

import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;

public class TotalBasics {
    public static void task_1() {
        System.out.println("Hello\nJan Czop");
    }

    public static void task_2() {
        System.out.println(74 + 36);
    }

    public static void task_3() {
        System.out.println(50 / 3);
    }

    public static void task_4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (-3) * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void task_5() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            a = scanner.nextInt();
            System.out.print("Input second number: ");
            b = scanner.nextInt();
            System.out.println(a + " x " + b + " = " + (a * b));
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }

    public static void task_6() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            a = scanner.nextInt();
            System.out.print("Input second number: ");
            b = scanner.nextInt();
            System.out.println(a + " + " + b + " = " + (a + b));
            System.out.println(a + " - " + b + " = " + (a - b));
            System.out.println(a + " x " + b + " = " + (a * b));
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " mod " + b + " = " + (a % b));
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }

    public static void task_7() {
        int a, counter = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            a = scanner.nextInt();
            while (counter < 10) {
                System.out.println(a + " x " + ++counter + " = " + a * counter);
            }
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }


    public static void task_8() {
        System.out.println("   J    a   v     v  a\n" +
                "   J   a a   v   v  a a\n" +
                "J  J  aaaaa   V V  aaaaa\n" +
                " JJ  a     a   V  a     a");
    }

    public static void task_9() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
    public static void task_10() {
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }

    public static void task_11(){
        int radius;
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Radius: ");
            radius = scanner.nextInt();
            System.out.println("Perimeter is = " + 2*pi*radius);
            System.out.println("Area is = " + pi*radius*radius);
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }

    public static void task_12(){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            a = scanner.nextInt();
            System.out.print("Input second number: ");
            b = scanner.nextInt();
            System.out.println("Input third number");
            c = scanner.nextInt();
            System.out.println("Average is " + (a+b+c)/3);
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }

    public static void task_13(){
        int width, height;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input width: ");
            width = scanner.nextInt();
            System.out.print("Input height: ");
            height = scanner.nextInt();
            System.out.println("Area is " + width * height);
            System.out.println("Perimeter is " + 2 * (width+height));
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }

    public static void task_14(){
        System.out.println("* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                " * * * * *  ==================================\n" +
                "* * * * * * ==================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================\n" +
                "==============================================");
    }

    public static void task_15(){
        int a = 1, b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void task_16(){
        System.out.println("+\"\"\"\"\"+\n" +
                "[| o o |]\n" +
                " |  ^  |\n" +
                " | '-' |\n" +
                " +-----+");
    }

    public static void task_17(){
        String input;
        ArrayList<Integer> bin1, bin2;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.print("Input first binary number: ");
                input = scanner.nextLine();
                bin1 = task_17_string_to_bin_rep(input);
                System.out.print("Input second binary number: ");
                input = scanner.nextLine();
                bin2 = task_17_string_to_bin_rep(input);
            } while(!(task_17_is_binary(bin1) && task_17_is_binary(bin2)));
            ArrayList<Integer> summed_binaries = task_17_sum_two_binaries(bin1,bin2);
            System.out.println("Sum of two binary numbers: " + Arrays.toString(summed_binaries.toArray()));
        } catch (Exception e) {
            System.out.println("Bad input");
        } finally {
            scanner.close();
        }
    }
    private static boolean task_17_is_binary(ArrayList<Integer> bin){
        for (Integer digit:bin){
            if(digit!=0 && digit!=1) return false;
        }
        return true;
    }
    private static ArrayList<Integer> task_17_string_to_bin_rep(String string){
        ArrayList<Integer> bin_arr = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            bin_arr.add(i, Integer.parseInt(String.valueOf(string.charAt(i))));
        }
        return bin_arr;
    }
    private static ArrayList<Integer> task_17_sum_two_binaries(ArrayList<Integer> bin1, ArrayList<Integer> bin2){
        ArrayList<Integer> summed_arr = new ArrayList<>();
        Collections.reverse(bin1);
        Collections.reverse(bin2);
        for (int i = 0; i < Math.max(bin1.size(), bin2.size()); i++) {
            int a=0,b=0;
            if(bin1.get(i)!= null) a = bin1.get(i);
            if(bin2.get(i)!= null) b = bin2.get(i);
            summed_arr.add(i,a+b);
            if(summed_arr.get(i)==2){
                summed_arr.add(i+1,1);
                summed_arr.set(i, 0);
            }
        }
        Collections.reverse(summed_arr);
        System.out.println(summed_arr);
        return summed_arr;
    }

    public static void task_18(){
        // TODO:
    }

    public static String task_31_is_java_installed(){
        return "Java Version: " + System.getProperty("java.version") + "\n" +
                "Java Runtime Version: " + System.getProperty("java.runtime.version") + "\n" +
                "Java Home: " + System.getProperty("java.home") + "\n" +
                "Java Vendor: " + System.getProperty("java.vendor") + "\n" +
                "Java Vendor URL: " + System.getProperty("java.vendor.url") + "\n" +
                "Java Class Path: " + System.getProperty("java.class.path") + "\n";
    }

    public static String task_32_int_comparison(){
        int num_1, num_2;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input first integer: ");
            num_1 = scanner.nextInt();
            System.out.print("Input second integer: ");
            num_2 = scanner.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            if (num_1 == num_2) {
                stringBuilder.append(num_1).append(" == ").append(num_2);
            } else {
                if(num_1>num_2) stringBuilder.append(num_1).append(" > ").append(num_2);
                else stringBuilder.append(num_1).append(" < ").append(num_2);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            System.out.println("Bad input");
            return "";
        } finally {
            scanner.close();
        }

    }

    public static int task_33_sum_of_digits(int input){
        int digits = 0;
        while(input!=0){
            input /= 10;
            digits++;
        }
        return digits;
    }

    public static double task_34_hexagon_area(int side){
        return task_35_polygon_area(side,6);
    }
    public static double task_35_polygon_area(int side, int number_of_sides){
        return (number_of_sides*side*side)/(4*Math.tan(Math.PI/number_of_sides));
    }

    // Harversine's formula:
    // d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

    public static double task_36_distance_between_points_on_Earth(double x1, double y1, double x2, double y2){
        double EARTH_RADIUS = 6371.01; // km
        return EARTH_RADIUS * Math.acos(
                Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+
                        Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
    }

    public static String task_37_reverse_string(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString(); //xd
    }

    public static int[] task_38_string_properties(String input){
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i))) letters++;
            else if(Character.isSpaceChar(input.charAt(i))) spaces++;
            else if(Character.isDigit(input.charAt(i))) numbers++;
            else others++;
        }
        return new int[]{letters,spaces,numbers,others};
    }

    public static int task_39_count_unique_numbers(){
        int DIGITS_NUMBER = 4, counter = 0;
        for (int i = 0; i < DIGITS_NUMBER; i++) {
            for (int j = 0; j < DIGITS_NUMBER; j++) {
                for (int k = 0; k < DIGITS_NUMBER; k++) {
                    if(i!=j && i!=k && j!=k) counter++;
                }
            }
        }
        return counter;
    }

    public static String task_40_available_charsets(){
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: Charset.availableCharsets().keySet()){
            stringBuilder.append(str).append("\n");
        }
        return stringBuilder.toString();
    }

    public static int task_41_display_chars_ASCII(char ch){
        return ch;
    }

    public static void task_42_password(){
        Console cons;
        if ((cons = System.console()) != null) {
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) java.util.Arrays.fill(pass_ward, ' ');
            }
        } else throw new RuntimeException("Can't get the password... No console");
    }

    public static String task_43(){
        return "Twinkle, twinkle, little star,\n" +
                "\tHow I wonder what you are!\n" +
                "\t\tUp above the world so high,\n" +
                "\t\tLike a diamond in the sky.\n" +
                "Twinkle, twinkle, little star,\n" +
                "\tHow I wonder what you are";
    }

    public static long task_44(int input){
        try{
            int digits = task_33_sum_of_digits(input);
            return (int) (3*input + 2*Math.pow(10,digits)*input + Math.pow(10,digits+digits)*input);
        } catch (Exception e){
            throw new RuntimeException();
        }
    }

    public static double task_45_file_size(String file_path){
        return new File(file_path).length();
    }

    public static void task_46_sys_time(){
        System.out.format("\nCurrent Date time: %tc%/n\n", System.currentTimeMillis());
    }

    public static void task_47_time(){
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
    }

    public static void task_48(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static boolean task_49_is_even(int input){
        return input%2==0;
    }

    public static int[] task_50_divisible_of_mult(int num_1, int num_2){
        int CAP = 100;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = (num_1*num_2); i < CAP; i+=(num_1*num_2)) {
            list.add(i);
        }
        return list.stream().mapToInt( i -> i).toArray();
    }

    public static int task_51_convert_str_to_int(String input){
        try{
            return Integer.parseInt(input);
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public static boolean task_52_int_plus_int_comparison(int num_1, int num_2, int num_3){
        return num_1+num_2 == num_3;
    }

    public static boolean task_53_int_stairs_comparison(int num_1, int num_2, int num_3){
        return num_1<num_2 && num_2<num_3;
    }

    public static boolean task_54_right_most_digit(int num_1, int num_2, int num_3){
        if(num_1<0 || num_2<0 || num_3<0) return false;
        return (num_1%10==num_2%10 || num_1%10==num_3%10 || num_2%10==num_3%10);
    }

    public static int[] task_55_seconds_to_time_convert(int input_secs){
        int SECS_IN_HOUR = 3600, SECS_IN_MIN = 60;

        int hours = input_secs/SECS_IN_HOUR; input_secs%=SECS_IN_HOUR;
        int minutes = input_secs/SECS_IN_MIN; input_secs%=SECS_IN_MIN;
        int seconds = input_secs;
        return new int[]{hours,minutes,seconds};
    }

    public static int task_56_divisible_in_range(int start, int end, int divisor){
        int counter = 0;
        for (int i = start; i < end; i++) {
            if(i%divisor==0) counter++;
        }
        return counter;
    }

    public static int task_57_factors_number(int number){
        int counter = 0;
        for (int i = 0; i < (int) Math.sqrt(number); i++) {
            if(number%i==0){
                if(number/i==i) counter++;
                else counter+=2;
            }
        }
        return counter;
    }





}
