import Basic_part_I.Basics;

import java.lang.reflect.Method;

public class Main {

    public static void invoke_all_methods(Object obj) {
        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods) {
            try {
                method.setAccessible(true);
                method.invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
       Basics.task_12();
    }
}
