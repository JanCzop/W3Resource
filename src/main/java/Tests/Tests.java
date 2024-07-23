package Tests;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.assertEquals;

public class Tests {

    public static void print_failures(Result result){
        if (result.getFailureCount() > 0) {
            System.out.println("Test failed:");
            for (Failure failure : result.getFailures()) System.out.println(failure.toString());
        } else System.out.println("All tests passed successfully.");
        System.out.println();
    }

    public static class Calculator{
        public int add(int a, int b){
            return a + b;
        }
        public int divide(int a, int b){
            if (b == 0) throw new ArithmeticException("Cannot divide by 0");
            else return a / b;
        }
    }

    @Test
    public void task_1(){
        Calculator calculator = new Calculator();
        int result = calculator.add(3,5);
        assertEquals(8,result);
    }
    @Test(expected = ArithmeticException.class)
    public void task_2(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(5,0);
    }

    public static void main(String[] args) {
        Result task_1 = JUnitCore.runClasses(Tests.class);
        print_failures(task_1);
        System.out.println();
        Result task_2 = JUnitCore.runClasses(Tests.class);
        print_failures(task_2);
    }
    
    
    




}
