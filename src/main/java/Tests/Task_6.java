package Tests;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Task_6 {

    @Ignore("Test is ignored")
    @Test
    public void ignored_test(){
    }
    @Test
    public void valid_test(){
        System.out.println("Running valid test");
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Task_6.class);
        Tests.print_failures(result);
    }
}
