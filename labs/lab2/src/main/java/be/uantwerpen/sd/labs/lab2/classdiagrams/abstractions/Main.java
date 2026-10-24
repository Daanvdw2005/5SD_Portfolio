package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        /*
            TODO: Create multiple instances of each different Shape and pass them (as Shape) to printShape(...) to verify polymorphism.
            TIP: Upcast to Shape and keep fields private/protected as appropriate.
        */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, "Circle"));
        shapes.add(new Square(4, "Square"));
        shapes.add(new EquilateralTriangle(6, "Triangle"));

        for( Shape shape : shapes){
            printShape(shape);
        }
    }

    public void printShape(Shape shape) {
        // TODO: Once Shape.calcCircumference and Shape.calcArea exists, print the Circumference and Area of each Shape.

        System.out.println("shape         : " + shape.name);
        System.out.println("circumference : " + shape.calcCircumference());
        System.out.println("area          : " + shape.calcArea());
        System.out.println();
    }

}
