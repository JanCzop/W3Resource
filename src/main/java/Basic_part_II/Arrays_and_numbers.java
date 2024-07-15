package Basic_part_II;

import Basic_part_I.Number_repr;
import Util.Pair;
import Util.Prime;

import java.util.*;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

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

    public static int task_168(int number, int multiplier){
        int result = 0;
        boolean is_negative = (number < 0) ^ (multiplier < 0);
        number = Math.abs(number);
        multiplier = Math.abs(multiplier);
        while(multiplier != 0){
            if((multiplier & 1) == 1) result += number;
            number <<= 1;
            multiplier >>= 1;
        }
        return is_negative ? -result : result;
    }

    public static int task_170(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        return longestStreak;
    }

    public static List<Double> task_173(int[] array, int window_size){ // TODO
        if(array == null || array.length == 0 || window_size == 0 || window_size > array.length)
            return null;
        List<Double> medians = new ArrayList<>();
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if(max_heap.isEmpty() || number <= max_heap.peek()) max_heap.add(number);
            else min_heap.add(number);


        }
        return medians;
    }

//    public static  List<Integer> task_174(int[] array, int window_size){
//        if(array == null || array.length == 0 || window_size == 0 || window_size > array.length)
//            return null;
//        Deque<Integer> deque = new LinkedList<>();
//
//    }


    public static Pair<int[],int[]> task_176(int[] array){
        List<Integer> odd_list = new ArrayList<>();
        List<Integer> even_list = new ArrayList<>();
        for(int number : array){
            if(number % 2 == 0) even_list.add(number);
            else odd_list.add(number);
        }
        int[] odd_array = new int[odd_list.size()];
        int[] even_array = new int[even_list.size()];
        for (int i = 0; i < odd_array.length; i++) odd_array[i] = odd_list.get(i);
        for (int i = 0; i < even_array.length; i++) even_array[i] = even_list.get(i);
        return new Pair<>(odd_array,even_array);
    }

    public static Set<Integer> task_178(int[] array){
        if(array == null || array.length == 0) return null;
        Set<Integer> longest_set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            Set<Integer> current_set = new HashSet<>();
            int j = i, previous = Integer.MIN_VALUE; boolean growing_set = true;
            do {
                if(previous >= array[j] || !current_set.add(array[j])) growing_set = false;
                previous = array[j];
                j++;
            } while(j < array.length && growing_set);
            if(current_set.size() > longest_set.size()) longest_set = current_set;
        }
        return longest_set;
    }

    public static int[] task_179(int[] array){
        boolean create_new_array = false;
        array[array.length-1]++;
        for (int i = array.length-1; i >= 0; i--) {
            if(array[i] > 9){
                if(i != 0) array[i-1]++;
                else create_new_array = true;
                array[i] %= 10;
            }
        }
        if(create_new_array){
            int[] new_array = new int[array.length+1];
            new_array[0] = 1;
            for (int i = 1; i < new_array.length; i++) {
                new_array[i] = array[i-1];
            }
            return new_array;
        }
        return array;
    }

    public static int task_183(int number){
        while(number > 9){
            int temp = 0;
            while(number != 0){
                temp += number % 10;
                number /= 10;
            }
            number = temp;
        }
        return number;
    }

    public static boolean task_191(int n){
        if (n < 0 ) return false;
        int limit = (int) Math.sqrt(n);
        for (int x = 0; x <= limit ; x++) {
            int y_squared = n - x*x;
            int y = (int) Math.sqrt(y_squared);
            if(y*y == y_squared) return true;
        }
        return false;
    }

    public static int task_192(int n) {
        int[] set = new int[n];
        for (int i = 0; i < n; i++) {
            set[i] = i + 1;
        }

        List<List<Integer>> subsets = getSubsets(set);
        int totalSum = 0;

        for (List<Integer> subset : subsets) {
            for (int num : subset) {
                totalSum += num;
            }
        }

        return totalSum;
    }

    private static List<List<Integer>> getSubsets(int[] set) {
        List<List<Integer>> subsets = new ArrayList<>();
        int subsetCount = 1 << set.length; // 2^n

        for (int i = 0; i < subsetCount; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < set.length; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(set[j]);
                }
            }
            subsets.add(subset);
        }

        return subsets;
    }

    public static List<Pair<Integer,Integer>> task_194(int[][] matrix, int number){
        if(matrix == null || matrix.length == 0 ) return null;
        List<Pair<Integer,Integer>> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == number) result.add(new Pair<>(i,j));
        return result.size() == 0 ? null : result;
    }

    public static boolean task_195(int n_1, int n_2, int n_3){
        if (n_1 <= 0 || n_2 <= 0 || n_3 <= 0) return false;
        return (n_1 + n_2 > n_3) && (n_3 + n_2 > n_1) && (n_1 + n_3 > n_2);
    }

    public static int[][] task_196(int n) {
        int[][] spiralArray = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) spiralArray[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) spiralArray[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) spiralArray[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) spiralArray[i][left] = value++;
            left++;
        }
        return spiralArray;
    }

    public static boolean task_197(int number){
        if (number < 0) return false;
        int sqrt_n = (int) Math.sqrt(number);
        return (sqrt_n * sqrt_n == number);
    }

    public static int task_199(int prime){
        if (!Prime.prime_test(prime)) throw new IllegalArgumentException("No prime number given");

        int prime_counter = 0;
        int number = 0;
        while(number != prime){
            if (Prime.prime_test(number)) prime_counter++;
            number++;
        }
        return prime_counter;
    }

    public static boolean task_201(int[] nums, int k) {
        int totalSum = Arrays.stream(nums).sum();
        if (totalSum % k != 0) {
            return false;
        }

        int subsetSum = totalSum / k;
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        return canPartition(nums, visited, 0, k, 0, subsetSum);
    }

    private static boolean canPartition(int[] nums, boolean[] visited, int startIndex, int k, int currentSum, int targetSum) {
        if (k == 1) {
            return true;
        }
        if (currentSum == targetSum) {
            return canPartition(nums, visited, 0, k - 1, 0, targetSum);
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (!visited[i] && currentSum + nums[i] <= targetSum) {
                visited[i] = true;
                if (canPartition(nums, visited, i + 1, k, currentSum + nums[i], targetSum)) {
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }

    private static boolean task_205(int number){
        return (number > 0 && ((number & number-1) == 0));
    }

    public static long get_string_checksum(String str){
        if (str == null) throw new IllegalArgumentException("Data can't be null");
        return get_checksum(str.getBytes());
    }
    private static long get_checksum(byte[] data){
        if (data == null) throw new IllegalArgumentException("Data can't be null");
        Checksum checksum = new CRC32();
        checksum.update(data,0, data.length);
        return checksum.getValue();
    }

    private static int[] task_211(int[] array, int k){
        if(array == null || array.length == 0 || k == 0) return null;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int number : array) queue.add(number);
        int[] result = new int[Math.min(queue.size(),k)];
        for (int i = 0; i < result.length; i++)
            if(queue.peek() != null) result[i] = queue.poll();
        return result;
    }

    private static int task_212(int num_1, int num_2){
        int sum = num_1 + num_2;
        int counter = 0;
        do {
            counter++;
            sum /= 10;
        } while(sum != 0);
        return counter;
    }

    private static int task_215(int months_n){
        int DEBT = 100_000;
        double INTEREST = 0.04;
        for (int i = 0; i < months_n; i++) {
            DEBT *= (1+INTEREST);
        }
        return DEBT/1000*1000;
    }

    public static List<Integer> task_217(int number){
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < number){
            if (Prime.prime_test(i)) list.add(i);
            i++;
        }
        return list;
    }


    public static Pair<Double,Pair<Double,Double>> task_218(Pair<Double,Double> a, Pair<Double,Double> b, Pair<Double,Double> c){
        double mA = (b.getSecond()-a.getSecond())/(b.getFirst()-a.getFirst());
        double mB = (c.getSecond()-b.getSecond())/(c.getFirst()-b.getFirst());
        if (mA == mB) return null;

        double h = ((mA*mB)*(a.getSecond()-c.getSecond())+mB*(a.getFirst()+b.getFirst())-mA*(b.getFirst()+c.getFirst()))/(2*(mB-mA));
        double k = (h-((a.getFirst()+b.getFirst()))/2)/(-mA)+(a.getSecond()+b.getSecond())/2;

        double r = Math.sqrt((h-a.getFirst())+(k-a.getSecond()));

        return new Pair<>(r,new Pair<>(h,k)); // (Radius,S(x,y));
    }


    public static boolean task_219(Pair<Double,Double> a, Pair<Double,Double> b, Pair<Double,Double> c, Pair<Double,Double> point){
        double triangle_area = area_of_triangle(a,b,c);
        double PAB_area = area_of_triangle(point,a,b);
        double PAC_area = area_of_triangle(point,a,c);
        double PBC_area = area_of_triangle(point,b,c);
        return triangle_area == PAB_area + PAC_area + PBC_area;
    }

    private static double area_of_triangle(Pair<Double,Double> a, Pair<Double,Double> b, Pair<Double,Double> c){
        return Math.abs(a.getFirst()*(b.getSecond()-c.getSecond()+b.getFirst()*(c.getSecond()-a.getSecond())
                +c.getFirst()*(a.getSecond()-b.getSecond())))/2;
    }


    // y=ax+b => for
    // { y1=ax1+b }
    // { y2=ax2+b } ==> a=(y1-y2)/(x1-x2)
    // pq _||_ rs if a_pq == a_rs
    public static boolean task_222(Pair<Double,Double> p, Pair<Double,Double> q, Pair<Double,Double> r, Pair<Double,Double> s){
        double a_pq = (p.getSecond()-q.getSecond()/(p.getFirst()-q.getFirst()));
        double a_rs = (r.getSecond()-s.getSecond()/(r.getFirst()-s.getFirst()));
        return a_pq == a_rs;
    }

    // d = Sqrt((x-a)^2+(y-b)^2)
    public static boolean task_222_1(double r, Pair<Double,Double> s, Pair<Double,Double> point){
        return Math.sqrt(Math.pow(point.getFirst()-s.getFirst(),2)+Math.pow(point.getSecond()-s.getSecond(),2)) <= r;
    }
    public static boolean task_222_2(Pair<Double,Double> s1, Pair<Double,Double> s2, double r1, double r2){
        return distance_between_points(s1,s2) <= r1 + r2;
    }

    private static double distance_between_points(Pair<Double,Double> s1, Pair<Double,Double> s2){
        return Math.sqrt(Math.pow(s2.getFirst()-s1.getFirst(),2)+Math.pow(s2.getSecond()-s1.getSecond(),2));
    }




}
