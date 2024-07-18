package Threads;

public class Hello_worlds_thread {
    public static class Hello_world_thread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        Hello_world_thread thread = new Hello_world_thread();
        thread.start();
    }
}
