package Interfaces;

public class Task_2 {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.make_noise();
        cat.make_noise();
    }

    public interface Animal{
        public void make_noise();
    }
    public static class Dog implements Animal{

        @Override
        public void make_noise() {
            System.out.println("Woof woof");
        }
    }
    public static class Cat implements Animal{

        @Override
        public void make_noise() {
            System.out.println("Meow meow");
        }
    }
}
