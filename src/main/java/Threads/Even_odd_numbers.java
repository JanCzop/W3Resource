package Threads;


public class Even_odd_numbers {

    private static final int MAX_NUMBER = 10;
    private static Object lock = new Object();
    private static boolean is_even_turn = false;
    public static void main(String[] args) {
        Thread even_thread = new Thread( () -> {
            for (int i = 2; i <= MAX_NUMBER; i+=2) {
                synchronized (lock){
                    while (!is_even_turn){
                        try{lock.wait();}
                        catch (InterruptedException e){e.printStackTrace();}
                    }
                    System.out.println("Even number: " + i);
                    is_even_turn = false;
                    lock.notify();
                }
            }
        });
        Thread odd_thread = new Thread( () -> {
            for (int i = 1; i <= MAX_NUMBER; i+=2) {
                synchronized (lock){
                    while (is_even_turn){
                        try{lock.wait();}
                        catch (InterruptedException e){e.printStackTrace();}
                    }
                    System.out.println("Odd number: " + i);
                    is_even_turn = true;
                    lock.notify();
                }
            }
        });

        odd_thread.start();
        even_thread.start();
    }
}
