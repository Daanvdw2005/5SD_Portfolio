package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

/*
TODO: Implement 'Square' and its formulas for circumference and area.
Methods you will implement:
  - double calcCircumference()
  - double calcArea()
*/
public class Square extends Shape {

    public Square (double size, String name){
        super(size, name);
    }

    @Override
    public double calcArea() {
        return size * size;
    }

    @Override
    public double calcCircumference() {
        return 4*size;
    }
}
