package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

/*
TODO: Implement 'EquilateralTriangle' and its formulas for circumference and area.
Methods you will implement:
  - double calcCircumference()
  - double calcArea()
*/
public class EquilateralTriangle extends Shape {

    public EquilateralTriangle (double size , String name){
        super(size, name);
    }

    @Override
    public double calcCircumference() {
        return 3*size;
    }

    @Override
    public double calcArea() {
        return size * size / 2;
    }
}
