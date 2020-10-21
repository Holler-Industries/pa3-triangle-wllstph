package com.example.project;

public class myTester {
    public static void main(String[] args) {

        Triangle test = new Triangle (1, 1, 2, 1, 1, 2);

        double perimeter = test.getPerimeter();
        double area = test.getArea();
        System.out.println("the area of the triangle is "+ area + "and should be .5");
        System.out.println("the area of the triangle is "+ perimeter + "and should be 3.41");

        test.translateY(5);
        test.translateX(5);
        System.out.println("the area of the triangle, after translating, is "+ area + "and should be the same");
        System.out.println("the area of the triangle, after translating, is "+ perimeter + "and should be the same");

    }
}
