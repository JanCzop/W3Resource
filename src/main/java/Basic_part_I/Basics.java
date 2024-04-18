package Basic_part_I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basics {
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

    }


















}
