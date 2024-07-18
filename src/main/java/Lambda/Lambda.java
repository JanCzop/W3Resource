package Lambda;

import Util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

    public static int task_1(int a, int b){
        Sum_calc sum = (x, y) -> x + y;
        return sum.sum(a,b);
    }
    private interface Sum_calc{
        int sum (int a, int b);
    }

    public static boolean task_2(String str){
        Predicate<String> pred = string -> string.isEmpty();
        return pred.test(str);
    }

    public static void task_3(List<String> string_list){
        Function<String,String> to_lower_case = s -> s.toLowerCase();
        string_list.replaceAll(to_lower_case::apply);
    }

    public static List<List<Integer>> task_4(List<Integer> list){
        List<Integer> odd_list = list.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        List<Integer> even_list = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        List<List<Integer>> result = new ArrayList<>();
        result.add(even_list);
        result.add(odd_list);
        return result;
    }

    public static void task_5(List<String> list){
        list.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
    }

    public static double task_6(List<Double> list){
        return list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public static List<Integer> task_7(List<Integer> list){
        List<Integer> new_list = new ArrayList<>();
        list.stream()
                .distinct()
                .forEach(i -> new_list.add(i));
        return new_list;
    }

    public static long task_8(int n){
        LongUnaryOperator factorial = x -> {
          long result = 1;
            for (int i = 0; i <= x; i++) result *= i;
          return result;
        };
        return factorial.applyAsLong(n);
    }

    public static String task_10(String str_1, String str_2){
        BiFunction<String,String,String> concat = (s1, s2) -> s1 + s2;
        return concat.apply(str_1,str_2);
    }

    public static Pair<Integer,Integer> task_11(List<Integer> list){
        Integer max = list.stream()
                .max((x,y) -> x.compareTo(y))
                .orElse(null);
        Integer min = list.stream()
                .min((x,y) -> x.compareTo(y))
                .orElse(null);
        return new Pair<>(max,min);
    }
}
