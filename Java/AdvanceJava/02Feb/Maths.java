// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create shape object
        Shape s = new Shape();
        Rectangle r = new Rectangle();

        // input values for rectangle
        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        s.getArea();
        r.getArea(a, b);
        
    }
}

class Shape {
    void getArea() {
        System.out.println("No Shape specified");

    }
}

class Rectangle extends Shape {
    void getArea(int l, int b) {            // override
        System.out.println("Area of Rectangle: " + l*b);

    }
}

