package Basic_part_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strings_II {

    public static String task_169(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length-1; i >= 0; i++) {
            String reversed_word = new StringBuilder(words[i]).reverse().toString();
            builder.append(reversed_word);
            if(i != 0) builder.append(" ");
        }
        return builder.reverse().toString();
    }

    public static boolean task_171(String str_1, String str_2){
        // return if str_2 contains str_1
        if(str_1.length() > str_2.length()) return false;

        for (int i = 0; i <= str_2.length() - str_1.length() ; i++) {
            boolean matching = true;
            for (int j = 0; j < str_1.length(); j++) {
                if(str_2.charAt(i+j) != str_1.charAt(i)){
                    matching = false;
                    j = str_1.length();
                }
            }
            if (matching) return true;
        }
        return false;
    }

    public static int task_181(String str){
        str = str.trim();
        String[] words = str.split(" +");
        return words[words.length-1].length();
    }

    public static boolean task_185(String str_1, String str_2){
        if (str_1 == null || str_2 == null
                || str_1.length() != str_2.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str_1.length(); i++) {
            char char1 = str_1.charAt(i);
            char char2 = str_2.charAt(i);

            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) return false;
            } else {
                map1.put(char1, char2);
            }

            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) return false;
            } else {
                map2.put(char2, char1);
            }
        }
        return true;
    }

    public static int task_187(String str){
        if(str == null) throw new NullPointerException("str null");
        Map<Character,Integer> map = new HashMap<>();
        boolean[] non_unique = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                non_unique[i] = true;
                non_unique[map.get(str.charAt(i))] = true;
            }
            else map.put(str.charAt(i),i);
        }
        for (int i = 0; i < non_unique.length; i++) {
            if(non_unique[i]) return i;
        }
        throw new RuntimeException("No unique char");
    }

    public static List<Integer> task_188(String window, String str){
        if(window == null || str == null || window.length() > str.length()) return null;
        List<Integer> result = new ArrayList<>();
        Map<Character,Integer> str_counter = new HashMap<>();
        Map<Character,Integer> window_counter = new HashMap<>();

        for (char c : window.toCharArray())
            window_counter.put(c,window_counter.getOrDefault(c,0)+1);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            str_counter.put(c,str_counter.getOrDefault(c,0)+1);

            if (i >= window.length()){
                char start_char = str.charAt(i - window.length());
                if (str_counter.get(start_char) == 1) str_counter.remove(start_char);
                else str_counter.put(start_char,str_counter.get(start_char)-1);
            }
            if (str_counter.equals(window_counter)) result.add(i - window.length() + 1);
        }
        return result;
    }

    public static String[] task_190(String str_1, String str_2){
        if (str_1 == null || str_2 == null || str_1.length() < str_2.length()) return null;
        if (str_1.equals(str_2)) return new String[]{};
        String[] base_words = str_1.split(" ");
        String[] comparison_words = str_2.split(" ");

        String[] result = new String[base_words.length - comparison_words.length];
        int counter = 0;
        for (int i = 0; i <= base_words.length; i++) {
            boolean is_word_present = false;
            for (String comparisonWord : comparison_words)
                is_word_present = base_words[i].equals(comparisonWord);
            if (is_word_present) result[counter++] = base_words[i];
        }
        return result;
    }

}
