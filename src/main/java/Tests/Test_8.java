package Tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_8 {
    private int add_private(int a, int b){
        return a + b;
    }
    public int add_public(int a, int b){
        return add_private(a,b);
    }

    public static int test_private_method(Test_8 instance, int a, int b) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends Test_8> clazz = instance.getClass();
        Class<?>[] parameter_class = {int.class, int.class};
        Method private_method = clazz.getDeclaredMethod("add_private", int.class, int.class);
        private_method.setAccessible(true);
        return (int) private_method.invoke(instance,a,b);
    }

    public static void main(String[] args) {
        Test_8 example = new Test_8();
        int result = example.add_public(3, 5);
        System.out.println("Result from public method: " + result); // Expected: 8
        try {
            int privateMethodResult = test_private_method(example, 3, 5);
            System.out.println("Result from private method: " + privateMethodResult); // Expected: 8
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
