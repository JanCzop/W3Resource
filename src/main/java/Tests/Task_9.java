package Tests;

import Util.Singleton;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.*;

public class Task_9 {

    @Test
    public void test_singleton_instance() throws InterruptedException {
        Thread thread_1 = new Thread(() -> {
            Singleton singleton_1 = Singleton.getInstance();
            try {
                Thread.sleep(100); // Simulate some work in the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton singleton_2 = Singleton.getInstance();
            assertEquals(singleton_1,singleton_2);
        });
        Thread thread_2 = new Thread(() -> {
            Singleton singleton_1 = Singleton.getInstance();
            try {
                Thread.sleep(200); // Simulate some work in the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton singleton_2 = Singleton.getInstance();
            assertEquals(singleton_1,singleton_2);
        });

        thread_1.start();
        thread_2.start();
        thread_1.join();
        thread_2.join();
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Task_9.class);
        Tests.print_failures(result);
    }
}
