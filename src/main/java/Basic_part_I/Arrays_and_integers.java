package Basic_part_I;

import Util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Arrays_and_integers {
    private static boolean prime_test(int number){
        if (number <= 1) return false;
        else if (number == 2 || number == 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }
    public static boolean task_62(int num_1, int num_2, int num_3){
        return (num_1+20<Math.abs(num_2-num_3) || num_2+20<Math.abs(num_1-num_3) || num_3+20<Math.abs(num_2-num_3));
    }

    public static int task_63(int num_1, int num_2){
        if(num_1==num_2) return 0;
        else return Math.max(num_1, num_2);
    }

    public static boolean task_64(int num_1, int num_2){
        if(num_1<25 || num_1>75 || num_2<25 || num_2>75) throw new IllegalArgumentException();
        int a_1,b_1,a_2,b_2;
        a_1 = num_1/10; b_1 = num_1%10;
        a_2 = num_2/10; b_2 = num_2%10;
        return (a_1==a_2 || a_1==b_2 || b_1==a_2 || b_1==b_2);
    }

    public static int task_65_modules(int num_1, int num_2){
        return num_1>num_2 ? num_1-num_2 : num_2-num_1;
    }

    public static int task_66_sum_100_primes(){
        int counter = 0, sum = 0, i = 0;
        while(counter!=100){
            if(prime_test(i)){
                counter++;
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static boolean task_74(int[] array){
        if(array == null || array.length < 2) return false;
        else return (array[0] == 10 || array[array.length-1] == 10);
    }

    public static boolean task_75(int[] array){
        if(array == null || array.length < 2) return false;
        else return (array[0] == array[array.length-1]);
    }

    public static int[] task_77(int[] arr_1, int[] arr_2){
        if(arr_1.length < 3 || arr_2.length < 3) return null;
        else{
            return new int[]{arr_1[0],arr_2[arr_1.length-1]};
        }
    }

    public static boolean task_78(int[] array){
        return (array[0] == 4 || array[0] == 7);
    }

    public static int[] task_79(int[] array){
        int[] reversed_array = new int[array.length];
        for (int i = reversed_array.length-1; i >= 0; i--) {
            reversed_array[i] = array[i];
        }
        return reversed_array;
    }

    public static int task_80(int[] arr_1){
        if(arr_1.length < 3) return 0;
        else return Math.max(arr_1[0],arr_1[arr_1.length-1]);
    }

    public static int[] task_81(int[] arr_1){
        int[] fixed_array = arr_1;
        if(arr_1.length < 3) return null;
        else {
            int temp = arr_1[0];
            arr_1[0] = arr_1[arr_1.length-1];
            arr_1[arr_1.length-1] = temp;
            return fixed_array;
        }
    }

    public static int task_82(int[] array){
        int largest_array_val = Integer.MIN_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > largest_array_val) largest_array_val = array[i];
        }
        return largest_array_val;
    }

    public static int[] task_83(int[] arr_1, int[] arr_2){
        if(arr_1.length != arr_2.length) return null;
        int[] multiplied_arr = new int[arr_1.length];
        for (int i = 0; i < multiplied_arr.length; i++) {
            multiplied_arr[i] = arr_1[i] * arr_2[i];
        }
        return multiplied_arr;
    }

    public static int task_86(int x){
        int n = x;
        while(n!=1){
            if(n % 2 == 0) n /= 2;
            else n = n*3+1;
        }
        return n;
    }

    public static int task_87(int number){
        int digits_sum = 0;
        while(number != 0){
            digits_sum += number % 10;
            number /= 10;
        }
        return digits_sum;
    }

    public static Pair<Integer,Integer> task_92(int[] array){
        int even = 0, odd = 0;
        for (int number:array) {
            if(number % 2 == 0) even++;
            else odd++;
        }
        return new Pair<>(even,odd);
    }

    public static boolean task_93(int[] array){
        boolean are_20_neighbours = false, are_10_neighbours = false;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == 10 && array[i+1] == 10) are_10_neighbours = true;
            if(array[i] == 20 && array[i+1] == 20) are_20_neighbours = true;
        }
        if(are_10_neighbours || are_20_neighbours) return !(are_10_neighbours && are_20_neighbours);
        else return false;
    }

    public static int[] task_94(int[] array){
        List<Integer> even_numbers = new ArrayList<Integer>();
        List<Integer> sorted_array = new ArrayList<Integer>();
        for (int number:array) {
            if(number % 2 == 0) even_numbers.add(number);
            else sorted_array.add(number);
        }
        sorted_array.addAll(even_numbers);
        int[] result = new int[sorted_array.size()];
        for (int i = 0; i < sorted_array.size(); i++) {
            result[i] = sorted_array.get(i);
        }
        return result;
    }

    public static String[] task_95(int number){
        String[] str_array = new String[number];
        for (int i = 0; i < number; i++) {
            str_array[i] = String.valueOf(i);
        }
        return str_array;
    }

    public static boolean task_96(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 10)
                for (int j = i; j < array.length; j++) {
                    if(array[j] == 20) return true;
                }
        }
        return false;
    }

    public static boolean task_97(int[] array, int specified_number){
        for (int i = 0; i < array.length; i++) {
            if(i< array.length-1) if(array[i] == specified_number && array[i+1] == specified_number) return true;
            if(i< array.length-2) if(array[i] == specified_number && array[i+2] == specified_number) return true;
        }
        return false;
    }

    public static boolean task_98(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(i < array.length-1)
                if(array[i] == 20){
                    if(array[i+1] == 20) return false;
                    else counter++;
                }
        }
        return counter == 3;
    }

    public static boolean task_99(int[] array, int specified_number){
        if(array.length % 2 == 1) if(array[array.length-1] != specified_number) return false;
        for (int i = 0; i < array.length; i+=2) {
            if(array[i] != specified_number && array[i+1] != specified_number) return false;
        }
        return true;
    }

    public static int task_100(int[] arr_1, int[] arr_2){
        if(arr_1.length != arr_2.length) return 0;
        int difference = 0;
        for (int i = 0; i < arr_1.length; i++) {
            difference += arr_1[i] - arr_2[i];
        }
        return difference;
    }

    public static boolean task_101(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i< array.length-1) if(array[i] == 10 && array[i+1] == 20) return true;
        }
        return false;
    }

    public static boolean task_102(int[] array){
        for (int number:array) {
            if(number == 10 || number == 20) return true;
        }
        return false;
    }


}
