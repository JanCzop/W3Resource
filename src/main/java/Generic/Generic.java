package Generic;

import Util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Generic {

    public static <T> boolean task_1(T[] arr_1, T[] arr_2){
        if (arr_1.length != arr_2.length) return false;
        for (int i = 0; i < arr_1.length; i++) {
            if (!arr_1[i].equals(arr_2[i])) return false;
        }
        return true;
    }

    public static <T extends Number> Pair<List<T>, List<T>> task_2(List<T> list){
        List<T> odd_numbers = new ArrayList<>();
        List<T> even_numbers = new ArrayList<>();
        for (T number : list){
            if (number.doubleValue() % 2 == 0)
                even_numbers.add(number);
            else odd_numbers.add(number);
        }
        return new Pair<>(odd_numbers,even_numbers);
    }

    public static <T> int task_3(List<T> list,T target){
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(target)) return i;
        return -1;
    }

    public static <T> List<T> task_4(List<T> list){
        if (list == null) return null;
        else return task_4_rec(list,new ArrayList<T>(),0);
    }
    private static <T> List<T> task_4_rec(List<T> list, List<T> new_list, int index){
        if (index == list.size()) return new_list;
        new_list.add(0,list.get(index));
        return task_4_rec(list, new_list,index+1);
    }

    public static <T> List<T> task_5(List<T> list_1, List<T> list_2){
        List<T> merged_list = new ArrayList<T>();
        int len = Math.max(list_1.size(), list_2.size());
        for (int i = 0; i < len; i++) {
            if (i < list_1.size()) merged_list.add(list_1.get(i));
            if (i < list_2.size()) merged_list.add(list_2.get(i));
        }
        return merged_list;
    }

    public static <T> List<T> task_6(List<T> list, Predicate<T> predicate){
        List<T> new_list = new ArrayList<>();
        for (T element : list)
            if (predicate.test(element)) new_list.add(element);
        return new_list;
    }

    public static <K, V> void task_7(Map<K,V> map){
        for (Map.Entry<K,V> entry : map.entrySet())
            System.out.println("Key:" + entry.getKey().toString() +
                    ", Value: " + entry.getValue().toString());
    }
}
