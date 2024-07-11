package Basic_part_II;

import Basic_part_I.Number_repr;
import Util.Prime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Arrays_and_numbers {

    public static boolean task_153(double first, double second){
        return (first > 0 && second > 0 && first < 1.0 && second < 1.0);
    }

    public static void task_154(boolean[][] array){
        for (boolean[] booleans : array) {
            for (boolean aBoolean : booleans) {
                System.out.println(aBoolean ? "t" : "f");
            }
        }
    }
    //155

    // log_n(x) = log_e(x)/log_e(n)
    public static int task_156(int n, int x){
        if(n <= 0) throw new IllegalArgumentException("Base must be positive in logarithms");
        double calc = Math.log(n)/Math.log(x);
        return (int) Math.floor(calc);
    }

    public static int task_157(int num_1, int num_2){
        while(num_2 != 0){
            int temp = num_2;
            num_2 = num_1 % num_2;
            num_1 = temp;
        }
        return num_1;
    }

    public static boolean[][] task_158(int size){
        boolean[][] bool_grid = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                bool_grid[i][j] = Prime.prime_test(i) && Prime.prime_test(j);
        }
        return bool_grid;
    }

    public static int[] task_159(int[] array, int k){
        if (k <= 0 || k > array.length) {
            throw new IllegalArgumentException("k must be between 1 and the length of the array.");
        }
        PriorityQueue<Integer> min_heap = new PriorityQueue<>(k);
        for (int num : array) {
            if (min_heap.size() < k) {
                min_heap.offer(num);
            } else if (num > min_heap.peek()) {
                min_heap.poll();
                min_heap.offer(num);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = min_heap.poll();
        }

        return result;
    }

    public static int[] task_160(int[] array, int k){
        if (k <= 0 || k > array.length) {
            throw new IllegalArgumentException("k must be between 1 and the length of the array.");
        }
        PriorityQueue<Integer> min_heap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int num : array) {
            if (min_heap.size() < k) {
                min_heap.offer(num);
            } else if (num < min_heap.peek()) {
                min_heap.poll();
                min_heap.offer(num);
            }
        }
        int[] result = new int[k];
        for (int i = k-1; i >= 0; i--) {
            result[i] = min_heap.poll();
        }

        return result;
    }

    public static int[] task_162(int[] array){
        if(array == null || array.length == 0) throw new IllegalArgumentException("Array must not be null or empty");
        double sum = 0;
        for(int number : array) sum += number;
        double avg = sum / array.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int number : array) if(number > avg) list.add(number);
        int[] new_array = new int[list.size()];
        int index = 0;
        for(int number : list) new_array[index++] = number;
        return new_array;
    }

    public static int task_163(int number){
        String binary_rep = Number_repr.task_19_int_to_bin(number);
        int counter = 0;
        for (int i = 0; i < binary_rep.length(); i++) {
            if(binary_rep.charAt(i) == '0') counter++;
            else if(binary_rep.charAt(i) != '1') throw new IllegalArgumentException("Illegal bit representation");
        }
        return counter;
    }

    public static int task_164(int number, int divisor){
        if(divisor == 0) throw new ArithmeticException("Can't divide by 0");
        boolean is_negative = (number < 0) ^ (divisor < 0);
        int abs_number = Math.abs(number);
        int abs_divisor = Math.abs(divisor);
        int quotient = 0;
        while(abs_number >= abs_divisor){
            abs_number -= abs_divisor;
            quotient++;
        }
        return is_negative ? -quotient : quotient;
    }

    public static String task_166(int number){
        if(number == 0) return "0";
        boolean is_negative = number < 0;
        StringBuilder builder = new StringBuilder();
        while(number > 0){
            builder.append(number % 10);
            number /= 10;
        }
        if(is_negative) builder.append("-");
        return builder.reverse().toString();
    }

    public static int[] task_167(int[] array){
        int index = 0;
        for(int num : array) if(num != 0) array[index++] = num;
        while(index < array.length) array[index++] = 0;
        return array;
    }



}
