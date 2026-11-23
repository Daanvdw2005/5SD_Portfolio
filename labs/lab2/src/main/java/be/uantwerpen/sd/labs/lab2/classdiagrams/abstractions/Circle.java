package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

public class Circle extends Shape {
    public  Circle (double size, String name){
        super(size,name);
    }

    @Override
    public double calcArea() {
        return Math.PI * size * size;
    }

    @Override
    public double calcCircumference() {
        return 2 * size * Math.PI;
    }
}
