package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

/*
TODO: Implement 'Circle' and its formulas for circumference and area.
Methods you will implement:
  - double calcCircumference()
  - double calcArea()
*/
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
