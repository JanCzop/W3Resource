package Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import static org.junit.Assert.*;

public class Task_10 {

    public static class User{
        public String get_user_full_name(int id){
            return "John Doe " + id;
        }
    }
    public static class Order_service{
        private User user;
        private static final int ID = 1;
        public Order_service(User user){
            this.user = user;
        }
        public String get_order_details(int order_id){
            return order_id + " " + this.user.get_user_full_name(ID);
        }
    }

    public static class Integration_tester{
        private User user_test;
        private Order_service test_order;

        @Before
        public void tests_setup(){
            user_test = new User();
            test_order = new Order_service(user_test);
        }
        @Test
        public void test_get_order_details(){
            String test_order_details = test_order.get_order_details(23);
            assertEquals("23 John Doe 1",test_order_details);
        }

        public static void main(String[] args) {
            Result result = JUnitCore.runClasses(Integration_tester.class);
            Tests.print_failures(result);
        }
    }
}
