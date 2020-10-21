package com.example.project;
import java.lang.Math;
public class Triangle {
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Triangle() {
        x0=0;
        x1=0;
        x2=0;
        y0=0;
        y1=0;
        y2=0;
    }
    public Triangle(double x01, double y01, double x11, double y11, double x21, double y21){
        x0=x01;
        x1=x11;
        x2=x21;
        y0=y01;
        y1=y11;
        y2=y21;
    }
    public double getPerimeter(){
        double a = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
        double b = Math.sqrt((Math.pow((x1-x0), 2))+(Math.pow((y1-y0), 2)));
        double c = Math.sqrt((Math.pow((x2-x0), 2))+(Math.pow((y2-y0), 2)));
        double perimeter = a + b + c;
        return perimeter;
    }
    public double getArea(){
        double a = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
        double b = Math.sqrt((Math.pow((x1-x0), 2))+(Math.pow((y1-y0), 2)));
        double c = Math.sqrt((Math.pow((x2-x0), 2))+(Math.pow((y2-y0), 2)));
        double s = (a + b + c) / 2;
        double area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        return area;
    }
    public void translateX(double x){
        x0 = x0 + x;
        x1 = x1 + x;
        x2 = x2 + x;
    }
    public void translateY(double y){
        y0 = y0 + y;
        y1 = y1 +y;
        y2 = y2 +y;
    }
    // your code goes here: good luck =)


    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
