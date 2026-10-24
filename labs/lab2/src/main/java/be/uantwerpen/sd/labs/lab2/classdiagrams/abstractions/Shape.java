package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

/*
TODO: Define the abstract base 'Shape' with fields 'size' and 'name'; validate the constructor; provide accessors; and declare abstract calcCircumference()/calcArea().
Fields you will need:
  - double size
  - String name
Methods you will implement:
  - String getName()
  - double calcCircumference()
  - double calcArea()
TIP: Keep fields protected. Throw IllegalArgumentException when size <= 0.
*/
public abstract class Shape {
    protected double size;
    protected String name;

    public Shape(double size, String name){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public abstract double calcCircumference();

    public abstract double calcArea();
}
