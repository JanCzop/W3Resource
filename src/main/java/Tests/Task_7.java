package Tests;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Task_7 {
    private int add(int a, int b){
        return a + b;
    }
    private int multiply(int a, int b){
        return a * b;
    }

    private static void assert_with_mess(String mess, boolean condition){
        assert condition : mess;
    }
    @Test
    public void test_addition(){
        int result = add(2,4);
        assert_with_mess("Addition failed", result == 5);
    }
    @Test
    public void test_multiplication(){
        int result = multiply(2,3);
        assert_with_mess("Multiplication failed", result == 6);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Task_7.class);
        Tests.print_failures(result);
    }
}
