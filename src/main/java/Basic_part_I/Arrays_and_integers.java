package Basic_part_I;

import java.util.ArrayList;

public class Arrays_and_integers {

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
    private static boolean prime_test(int number){
        if (number <= 1) return false;
        else if (number == 2 || number == 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }


}
