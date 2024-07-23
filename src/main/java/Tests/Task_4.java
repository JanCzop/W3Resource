package Tests;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


public class Task_4 {

    private static class Multiply_class{
        public int multiply(int a, int b){
            return a * b;
        }
    }

    @RunWith(Parameterized.class)
    public static class Test_class_4{
        private int a,b,expected_result;

        public Test_class_4(int a, int b, int expected_result){
            this.a = a;
            this.b = b;
            this.expected_result = expected_result;
        }

        @Parameters
        public static Collection<Object[]> data(){
            return Arrays.asList(new Object[][]{
                    {1,2,2},
                    {2,7,14},
                    {0,8,0}
            });
        }
        @Test
        public void test_multiply(){
            Multiply_class to_test = new Multiply_class();
            int result = to_test.multiply(this.a,this.b);
            assertEquals(expected_result,result);
        }

        public static void main(String[] args) {
            Result result = new JUnitCore().run(Test_class_4.class);
            Tests.print_failures(result);
        }

    }
}
