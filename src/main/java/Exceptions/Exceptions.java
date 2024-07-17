package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    public static void task_1(int a, int b){
        try{
            int result = divide_numbers(a,b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    private static int divide_numbers(int a, int b){
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        else return a/b;
    }

    public static void task_2(int number){
        try {
            check_odd(number);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private static void check_odd(int number){
        if (number % 2 != 0) throw new IllegalArgumentException("Odd number");
    }

    public static void task_3(String str){
        try{
            read_file(str);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
    private static void read_file(String str) throws FileNotFoundException {
        File file = new File(str);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) System.out.println(scanner.nextLine());
    }

    public static void task_5(String str){
        try{
            check_empty_file(str);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (Empty_file_exception e){
            System.out.println(e.getMessage());
        }
    }
    private static void check_empty_file(String str) throws FileNotFoundException, Empty_file_exception{
        File file = new File(str);
        Scanner scanner = new Scanner(file);
        if(!scanner.hasNext()) throw new Empty_file_exception();
    }
    private static class Empty_file_exception extends Exception{}
}
