package Tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Test_5 {

    private static class Long_method_class{
        private static final int TIME_IN_MILISECS = 1000;
        public void long_running_method(){
            try{
                Thread.sleep(TIME_IN_MILISECS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Test_class_5{
        @Rule
        public Timeout tiemout = Timeout.seconds(2);

        @Test
        public void test_long_running_method(){
            Long_method_class example = new Long_method_class();
            example.long_running_method();
        }

        public static void main(String[] args) {
            Result result = JUnitCore.runClasses(Test_class_5.class);
            Tests.print_failures(result);
        }
    }
}
