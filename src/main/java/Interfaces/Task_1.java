package Interfaces;

public class Task_1 {


    public static void main(String[] args) {
        Shape circle = new Circle(1.5);
        Shape triangle = new Triangle(3,3);
        Shape rectangle = new Rectangle(3);

        System.out.println("Area of circle " + circle.calc_area());
        System.out.println("Area of triangle " + triangle.calc_area());
        System.out.println("Area of rectangle " + rectangle.calc_area());
    }

    public interface Shape{
        public double calc_area();
    }
    public static class Circle implements Shape{

        private double radius;
        private static final double PI = Math.PI;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calc_area() {
            return PI * radius * radius;
        }
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
    public static class Triangle implements Shape{
        private double a, h;

        @Override
        public double calc_area(){
            return a * h / 2;
        }

        public Triangle(double a, double h) {
            this.a = a;
            this.h = h;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getH() {
            return h;
        }

        public void setH(double h) {
            this.h = h;
        }
    }
    public static class Rectangle implements Shape{
        private double a;

        public Rectangle(double a) {
            this.a = a;
        }

        @Override
        public double calc_area() {
            return a * a;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }
    }
}
