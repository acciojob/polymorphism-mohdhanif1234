package com.driver;

public class Main {


    // creating a Product class
    public static class Product{

        // Assignment to test the learning of Polymorphism (Method Overloading) in Java
        public int product(int x, int y){
            return x * y;
        }

        public int product(int x, int y, int z){
            return x * y * z;
        }

        public double product(double x, double y){
            return x * y;
        }
    }
    public static void main(String[] args){
        Product p = new Product(); // creating object of Product class
        System.out.println(p.product(2,5));
        System.out.println(p.product(2,3,4));
        System.out.println(p.product(1.2, 6.2));
    }
}