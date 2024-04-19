package Basic_part_I;

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



















}
