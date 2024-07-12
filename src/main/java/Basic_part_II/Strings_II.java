package Basic_part_II;

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

    }
}
