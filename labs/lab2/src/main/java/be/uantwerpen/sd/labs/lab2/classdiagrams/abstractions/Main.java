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

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, "Circle"));
        shapes.add(new Square(4, "Square"));
        shapes.add(new EquilateralTriangle(6, "Triangle"));

        for( Shape shape : shapes){
            printShape(shape);
        }
    }

    public void printShape(Shape shape) {

        System.out.println("shape         : " + shape.name);
        System.out.println("circumference : " + shape.calcCircumference());
        System.out.println("area          : " + shape.calcArea());
        System.out.println();
    }

}
