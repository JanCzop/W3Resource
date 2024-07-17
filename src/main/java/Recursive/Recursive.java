package Recursive;

import java.util.HashSet;
import java.util.Set;

public class Recursive {

    public static long task_1(long n){
        return task_1_rec(n,0);
    }
    private static long task_1_rec(long n, long result){
        if (n == 0) return result;
        else return task_1_rec(n-1,result*n);
    }

    public static int task_2(int n){
        return task_2_rec(n,0);
    }
    private static int task_2_rec(int n, int sum){
        if (n == 0) return sum;
        else return task_2_rec(n-1,sum+n);
    }

    public static int task_3(int n){
        if (n < 0) throw new IllegalArgumentException("N can't be negative");
        else if (n == 0 || n == 1) return n;
        else return task_3_rec(0,1,n-2);
    }
    private static int task_3_rec(int previous, int current, int n){
        if (n == 0) return current;
        else return task_3_rec(current,previous + current,n-1);
    }

    public static boolean task_4(String str){
        str = str.replaceAll("\\s+", "").toLowerCase();
        return task_4_rec(str,0,str.length()-1);
    }
    private static boolean task_4_rec(String str, int left, int right){
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return task_4_rec(str,left+1,right+1);
    }


    public static double task_5(double base, int exponent){
        if (exponent == 0) return 1;
        else if (exponent > 0) return base * task_5(base, exponent-1);
        else return base / task_5(base, -exponent);
    }

    public static String task_6(String str){
        if (str == null || str.length() == 0) return str;
        return task_6_rec(str,"",str.length());
    }
    private static String task_6_rec(String original, String reversed, int index){
        if (index == 0) return reversed;
        else return task_6_rec(original,reversed+original.charAt(index-1),index-1);
    }

    public static int task_7(int a, int b){
        if (b == 0) return a;
        else return task_7(b,a % b);
    }

    public static int task_8(int[] array, int target){
        return task_8_rec(array, 0, target);
    }
    private static int task_8_rec(int[] array, int index, int target){
        if (index == array.length) return 0;
        int count = target == array[index] ? 1 : 0;
        return count + task_8_rec(array,index+1,target);
    }

    public static int task_9(int[] array){
        return task_9_rec(array,0);
    }
    private static int task_9_rec(int[] array, int index){
        if (index == array.length) return 0;
        int odd = array[index] % 2 != 0 ? array[index] : 0;
        return odd + task_9_rec(array,index+1);
    }

    public static int task_10(String str){
        return task_10_rec(str,0);
    }
    private static int task_10_rec(String str, int index){
        if (index == str.length()) return 0;
        return 1 + task_10_rec(str,index+1);
    }

    public static Set<String> task_11(String str){
        Set<String> result = new HashSet<>();
        task_11_rec("",str,result);
        return result;
    }
    private static void task_11_rec(String prefix, String str, Set<String> result){
        if (str.length() == 0) result.add(prefix);
        else for (int i = 0; i < str.length(); i++) {
            task_11_rec(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1),result);
        }
    }

    public static int task_12(int[] array){
        return task_12_rec(array,array.length-1);
    }
    private static int task_12_rec(int[] array, int index){
        if (index == 0) return array[index];
        return Math.max(array[index], task_12_rec(array,index-1));
    }

    public static int task_13(int[] array){
        return task_13_rec(array,0);
    }
    private static int task_13_rec(int[] array, int index){
        if (index == array.length-1) return array[index];
        else return array[index] * task_13_rec(array,index+1);
    }

    public static int task_14(int number){
        if (number == 0) return 0;
        else return number % 10 + task_14(number/10);
    }

    public static boolean task_15(int[] array){
        return task_15_rec(array,0);
    }
    private static boolean task_15_rec(int[] array, int index){
        if (index == array.length-1) return true;
        else if (array[index] > array[index+1]) return false;
        else return task_15_rec(array,index+1);
    }


}
