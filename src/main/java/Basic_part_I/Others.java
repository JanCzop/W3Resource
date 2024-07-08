package Basic_part_I;

public class Others {

    public static void task_88(){
        System.out.println(System.getenv());
        System.out.println(System.getProperties());
    }

    public static void task_89(){ // DEPRICATED
     //   System.out.println(System.getSecurityManager());
    }

    public static void task_90(){
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("USERNAME"));
        System.out.println(System.getenv("TEMP"));
    }

    public static long task_91(){
        long time_start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            int temp = 0;
        }
        return System.currentTimeMillis() - time_start;
    }

    public static My_linked_list task_121(My_linked_list linked_list){
        linked_list.reverse_list();
        return linked_list;
    }


}
