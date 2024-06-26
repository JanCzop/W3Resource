package Basic_part_I;

public class Number_repr {

    public static String task_19_int_to_bin(int input){
        return int_to_another_representation(input,Digit_system.BINARY);
    }
    public static String task_20_int_to_hex(int input){
        return int_to_another_representation(input,Digit_system.HEXADECIMAL);
    }
    public static String task_21_int_to_oct(int input){
        return int_to_another_representation(input,Digit_system.OCTAGONAL);
    }



    private static String int_to_another_representation(int input, Digit_system system){
        StringBuilder bin = new StringBuilder();
        while(input!=0){
            bin.append(represent_int_digit(input%system.getValue(), system));
            input/=system.getValue();
        }
        return bin.reverse().toString();
    }
    private static String represent_int_digit(int input, Digit_system system){
        switch (system){
            case HEXADECIMAL -> {
                if(input<=10) return String.valueOf(input);
                else return Character.toString('A'+(input-10));
            }
            default -> {
                return String.valueOf(input);
            }
        }
    }
    private enum Digit_system {
        BINARY(2),
        DECIMAL(10),
        HEXADECIMAL(16),
        OCTAGONAL(8);
        private final int value;
        private Digit_system(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public static int task_22_bin_to_int(String input){
        StringBuilder stringBuilder = new StringBuilder(input).reverse();
        int decimal = 0;
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i)=='0');
            else if(stringBuilder.charAt(i)=='1') decimal += Math.pow(2,counter);
            else throw new IllegalArgumentException();
            counter++;
        }
        return decimal;
    }

    public static String task_23_bin_to_hex(String input){
        return task_20_int_to_hex(task_22_bin_to_int(input));
    }
    public static String task_24_bin_to_oct(String input){
        return task_21_int_to_oct(task_22_bin_to_int(input));
    }

    public static int task_25_oct_to_int(String input){
        int decimal = 0, counter = 0;
        for (int i = input.length()-1; i >= 0; i--) {
            decimal += Math.pow(8,counter) * Integer.parseInt(Character.toString(input.charAt(i)));
            counter++;
        }
        return decimal;
    }

    public static String task_26_oct_to_bin(String input){
        return task_19_int_to_bin(task_25_oct_to_int(input));
    }

    public static String task_27_oct_to_hex(String input){
        return task_20_int_to_hex(task_25_oct_to_int(input));
    }

    public static int task_28_hex_to_int(String input){
        int decimal = 0;
        StringBuilder stringBuilder = new StringBuilder(input).reverse();
        for (int i = 0; i < stringBuilder.length(); i++) {
            decimal += Math.pow(16,i) * hex_representation_in_dec(stringBuilder.charAt(i));
        }
        return decimal;
    }
    private static int hex_representation_in_dec(char character){
        if(character>='0' && character<='9') return Integer.parseInt(Character.toString(character));
        else if(character>='A' && character<='F') return 10+character-'A';
        else throw new IllegalArgumentException();
    }

    public static String task_29_hex_to_bin(String input){
        return task_19_int_to_bin(task_28_hex_to_int(input));
    }

    public static String task_30_hex_to_oct(String input){
        return task_21_int_to_oct(task_28_hex_to_int(input));
    }






}
