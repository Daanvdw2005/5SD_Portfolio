package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

public abstract class Shape {
    protected double size;
    protected String name;

    public Shape(double size, String name){
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0, got: " + size);
        }
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public abstract double calcCircumference();

    public abstract double calcArea();
}
