package Basic_part_I;

import java.util.Arrays;

public class Strings {

    public static String task_58_capitalize_letters(String string){
        boolean first_char = true;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))){
                if(first_char){
                    stringBuilder.append(Character.toUpperCase(string.charAt(i)));
                    first_char = false;
                }
            }
            else first_char = true;
        }
        return stringBuilder.toString();
    }

    public static String task_59_to_lower_case(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(Character.toLowerCase(string.charAt(i)));
        }
        return stringBuilder.toString();
    }

    public static String task_60_penultimate_word(String string){
        String[] words = string.split("[ ]+");
        return words[words.length-2];
    }

    // task 61 was completed before somewhere else

    public static String task_67_insert_in_middle(String string, String string_to_input){
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split("[ ]+");
        for (int i = 0; i < words.length; i++) {
            if(i==words.length/2) stringBuilder.append(string_to_input);
            else stringBuilder.append(words[i]);
        }
        return stringBuilder.toString();
    }

    public static String task_68_multiply_string(String string, int length, int amount_of_copies){
        if(string.length()<length) throw new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.substring(string.length()-1-length,string.length()));
        for (int i = 0; i < amount_of_copies-1; i++) {
            stringBuilder.append(stringBuilder.toString());
        }
        return stringBuilder.toString();
    }

    public static String task_69_half_of_string(String string){
        return string.substring((string.length()-1)/2,string.length()-1);
    }

    public static String task_70(String str_1, String str_2){
        if(str_1.length() == str_2.length()) throw new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        return str_1.length()>str_2.length() ?
                stringBuilder.append(str_1).append(str_2).append(str_1).toString() :
                stringBuilder.append(str_2).append(str_1).append(str_2).toString();
    }

    public static String task_71(String str_1, String str_2){
        if(str_1.length() ==1 || str_2.length() == 1) return str_1 + str_2;
        else {
            return str_1.substring(1) + str_2.substring(1);
        }
    }

    public static String task_72(String str){
        StringBuilder to_return = new StringBuilder();
        if(str.length() < 3){
            to_return.append(str);
            to_return.append("#".repeat(3 - to_return.length() - 1));
            return to_return.toString();
        }
        else return to_return.substring(0,3);
    }
    public static String task_73(String str_1, String str_2){
        String to_return = "";
        to_return += str_1.length() == 0 ? "#" : str_1.charAt(0);
        to_return += str_2.length() == 0 ? "#" : str_2.charAt(str_2.length()-1);
        return to_return;
    }

    public static String task_84(String str){
        if(str.length() < 3) return null;
        else {
            return str.substring(0, 3) +
                    str +
                    str.substring(0, 3);
        }
    }

    public static boolean task_85(String str, String start){
        return str.startsWith(start);
    }

    public static String task_114(String str, int offset){
        if(str.length() < offset-1) return str;
        return str.substring(offset,str.length()-1) + str.substring(0,offset);
    }

    public static boolean task_118(String str, String occur){
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,str.length()-1).startsWith(occur)) return true;
        }
        return false;
    }



}
