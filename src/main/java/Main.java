import Basic_part_I.Number_repr;
import Basic_part_I.Strings;
import Basic_part_I.TotalBasics;

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
        Strings.task_60_penultimate_word("fox cat rat");
    }
}
