package Conditionals;

import Util.Pair;

import java.util.Arrays;

public class Conditionals {

    public static boolean task_1(int input){
        return input >= 0;
    }
    public Pair<Double,Double> task_2(double a, double b, double c){
        double delta = b*b-4*a*c;
        if (delta > 0)
            return new Pair<Double,Double>((-b+delta)/2*a,(-b-delta)/2*a);
        else if (delta == 0) return new Pair<Double,Double>(-b/2*a,null);
        else return null;
    }
    public static String task_5(int input){
        if(input <= 0 || input > 7) return null;
        return switch (input) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> null;
        };
    }

    public static boolean task_6(double num_1, double num_2){
        num_1 = Math.round(num_1 * 1000.0) / 1000.0;
        num_2 = Math.round(num_2 * 1000.0) / 1000.0;
        return num_1 == num_2;
    }

    public static boolean task_9(int year){
        if (year % 4 == 0){
            if (year % 100 == 0) return year % 400 == 0;
            else return true;
        }
        else return false;
    }

    public static Pair<Integer,Integer> task_12(int[] array){
        int sum = Arrays.stream(array).sum();
        return new Pair<>(sum,sum/ array.length);
    }
    public static void task_16(int n){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            System.out.println(builder.append(i));
        }
    }
    public static void task_17(int n){
        StringBuilder builder;
        for (int i = 0; i < n; i++) {
            builder = new StringBuilder();
            for (int j = 0; j < i; j++) {
                System.out.println(builder.append(i));
            }
        }
    }
    public static void task_18(int n){
        StringBuilder builder;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            builder = new StringBuilder();
            for (int j = 0; j < i; j++) {
                System.out.println(builder.append(counter++));
            }
        }
    }
    public static void task_19(int n){
        StringBuilder builder;
        for (int i = 0; i < n; i++) {
            builder = new StringBuilder();
            builder.append(" ".repeat(n - 1));
            builder.append(String.valueOf(i).repeat(i));
            builder.append(" ".repeat(n - 1));
        }
    }

    public static int[][] task_22(int n){
        if (n <= 0) return new int[0][0];

        int[][] pascalTriangle = new int[n][];
        for (int i = 0; i < n; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        return pascalTriangle;
    }

}
