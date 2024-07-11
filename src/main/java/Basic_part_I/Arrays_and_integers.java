package Basic_part_I;

import Util.Pair;

import java.util.*;

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

    public static int[] task_103(int[] array){
        boolean created = false;
        int[] new_array = null;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 10){
                new_array = new int[array.length - 1 - i];
                created = true;
            }
            if(created) new_array[index++] = array[i];
        }
        return new_array;
    }

    public static int[] task_104(int[] array){
        List<Integer> new_list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i] == 10) i = array.length;
            else new_list.add(array[i]);
        }
        int[] new_array = new int[new_list.size()];
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = new_list.get(i);
        }
        return new_array;
    }

    public static boolean task_105(int[] array){
        return array[0] == array[array.length-1];
    }

    public static int[] task_106(int[] arr_1, int[] arr_2){
        int[] summed_arr = new int[arr_1.length + arr_2.length];
        System.arraycopy(arr_1, 0, summed_arr, 0, arr_1.length);
        System.arraycopy(arr_2, 0, summed_arr, arr_1.length, arr_2.length);
        return summed_arr;
    }

    public static boolean task_107(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i < array.length - 2){
                if(array[i+1] == array[i]+1 &&
                   array[i+2] == array[i]+2) return true;
            }
        }
        return false;
    }

    public static int task_108(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean task_110(int number){
        int current = 4;
        while(current < number){
            current *= 4;
            if(current == number) return true;
        }
        return false;
    }

    public static int task_111(int a, int b){
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return b;
    }

    public static int task_112(int number){
        int ctr = 0;
        while (number != 0) {
            ctr += number / 5;
            number /= 5;
        }
        return ctr;
    }

    public static int[] task_113(int[] arr_1, int[] arr_2){
        int[] merged_arr = new int[arr_1.length + arr_2.length];
        int i = arr_1.length-1, j = arr_2.length-1, counter = 0;
        while(i != 0 && j != 0){
            if(arr_1[i] <= arr_2[j]){
                merged_arr[counter] = arr_1[i];
                i--;
            }
            else {
                merged_arr[counter] = arr_2[j];
                j--;
            }
            counter++;
        }
        return merged_arr;
    }

    public static boolean task_115(int number){
        int reversed = 0;
        while(number != 0){
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        return reversed == number;
    }

    public static void task_116(int[] array){
        for (int number:array) {
            if(number % 3 == 0 && number % 5 == 0) System.out.println("fizz and buzz");
            else if (number % 3 == 0) System.out.println("fizz");
            else if (number % 5 == 0) System.out.println("buzz");
        }
    }

    public static int task_117(int number){
        if(number < 0) throw new IllegalArgumentException("Number must be non-negative");
        if(number == 0 || number == 1) return number;

        int low = 0;
        int high = number;

        while(low <= high){
            int mid = low + (high - low)/2;
            int mid_square = mid * mid;
            if(mid_square == number) return mid;
            else if (mid_square < number) low = mid + 1;
            else low = mid - 1;
        }
        return high;
    }

    public static int task_119(int[] array, int occur){
        int low = 0;
        int high = array.length-1;
        while(low <= high){
            int mid = (low + high) >> 1;
            if(array[mid] == occur) return mid;
            if(array[mid] >= occur) high = mid - 1;
            else low = mid + 1;
        }
        throw new IllegalArgumentException();
    }

    public static boolean task_120(int[][] matrix, int occur){
        if(matrix.length == 0 || matrix[0].length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n-1;
        while(low <= high){
            int mid = (low + high) >> 1;
            int val = matrix[mid/n][mid%n];
            if(val == occur) return true;
            if(val >= occur) high = mid - 1;
            else low = mid + 1;
        }
        throw new IllegalArgumentException();
    }

    public static int task_122(int[] array){
        return 0;
    }
    public static int task_123(int[] array){
        return 0;
    }

    public static int task_124(int[] array, int target){
        if(array == null || array.length == 0) return 0;
        int low = 0;
        int high = array.length-1;
        int mid;
        while(low+1 < high){
            mid = low + (high - low)/2;
            if(array[mid] == target) return mid;
            else if(array[mid] > target) high = mid;
            else low = mid;
        }
        if(array[low] >= target) return low;
        else if(array[low] < target && array[high] >= target) return high;
        else return high+1;
    }

    public static int task_128(int[] array){
        return array.length % 2 == 0 ?
                (array[array.length/2-1] + array[array.length/2])/2 : array.length/2;
    }

    public static int[] task_129(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> unique_list = new ArrayList<>();
        for (int num:array) map.put(num,map.getOrDefault(num,0)+1);
        for (int num : array) if(map.get(num) == 1) unique_list.add(num);
        int[] result = new int[unique_list.size()];
        for (int i = 0; i < unique_list.size(); i++) result[i] = unique_list.get(i);
        return result;
    }

    public static int task_131(int[] array){
        Arrays.sort(array);
        Set<Integer> set = new HashSet<>();
        for (int num:array) set.add(num);
        return set.size();
    }

    public static int[] task_132(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for(int number:array) map.put(number, map.getOrDefault(number,0)+1);
        int result_size = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) if(entry.getValue() <= 2) result_size++;
        int[] result = new int[result_size];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            if(entry.getValue() <= 2) result[index++] = entry.getKey();
        return result;
    }

    public static int task_133(int[][] grid){
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];

        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) dp[i][0] = dp[i-1][0] + grid[i][0];
        for (int i = 1; i < columns; i++) dp[0][i] = dp[0][i-1] + grid[0][i];

        for (int i = 1; i < rows; i++)
            for (int j = 1; j < columns; j++)
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);

        return dp[rows-1][columns-1];
    }

    public static int task_134(int number_of_stairs){
        if(number_of_stairs <= 1) return 1;
        int[] dp = new int[number_of_stairs+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= number_of_stairs; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[number_of_stairs];
    }


    public static int task_136(int x, int y){
        int[][] dp = new int[x][y];

        for (int i = 0; i < x; i++) dp[i][0] = 1;
        for (int i = 0; i < y; i++) dp[0][i] = 1;

        for (int i = 1; i < x; i++)
            for (int j = 1; j < y; j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];

        return dp[x-1][y-1];
    }

    public static int task_137(boolean[][] obstacle_grid){
        int rows = obstacle_grid.length;
        int columns = obstacle_grid[0].length;
        int[][] dp = new int[rows][columns];

        dp[0][0] = obstacle_grid[0][0] ? 0 : 1;
        for (int i = 1; i < rows; i++)
            dp[i][0] = (obstacle_grid[i][0] && dp[i-1][0] == 1) ? 1 : 0;
        for (int i = 1; i < columns; i++)
            dp[0][i] = (obstacle_grid[0][i] && dp[0][i-1] == 1) ? 1 : 0;

        for (int i = 1; i < rows; i++){
            for (int j = 1; j < columns; j++) {
                if (!obstacle_grid[i][j]) dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else dp[i][j] =0;
            }
        }
        return dp[rows-1][columns-1];
    }

    public static String task_138(List<String> dict){
        String longest_string = "";
        int longest = 0;
        for(String str:dict)
            if(str.length() > longest){
                longest = str.length();
                longest_string = str;
            }
        return longest_string;
    }

    public static List<Pair<Integer,Integer>> task_140(List<Pair<Integer,Integer>> intervals){
        intervals.removeIf(interval -> interval.getFirst() > interval.getSecond());
        intervals.sort(Comparator.comparingInt(Pair::getFirst));
        List<Pair<Integer,Integer>> merged_list = new ArrayList<>();
        Pair<Integer,Integer> current = intervals.get(0);
        Pair<Integer,Integer> next;
        for (int i = 1; i < intervals.size(); i++) {
            next = intervals.get(i);
            if(current.getSecond() >= next.getFirst()) current.setSecond(Math.max(current.getSecond(), next.getSecond()));
            else {
                merged_list.add(current);
                current = next;
            }
        }
        merged_list.add(current);
        return merged_list;
    }





}
