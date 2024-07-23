package Tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Task_3 {
    public static class Example{
        private String resource;

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }
    }

    private Example example;

    @Before
    public void set_up(){
        System.out.println("Setting up");
        example = new Example();
        example.resource = "Initialized";
    }
    @After
    public void tear_down(){
        System.out.println("Cleaning");
        example.setResource(null);
        example = null;
    }
    @Test
    public void test_resource_initialization(){
        assertEquals("Initialized", example.resource);
    }
    @Test
    public void test_cleanup(){
        example = new Example();
        example.resource = "Initialized";
        assertNotNull(example.resource);
    }
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Task_3.class);
        Tests.print_failures(result);
    }

}
