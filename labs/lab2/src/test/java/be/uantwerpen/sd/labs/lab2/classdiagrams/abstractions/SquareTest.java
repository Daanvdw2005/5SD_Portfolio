package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calcArea() {
        Square square = new Square(5.0, "TestSquare");
        assertEquals(25.0, square.calcArea(), 0.001);

    }

    @Test
    void calcCircumference() {
        Square square = new Square(5.0, "TestSquare");
        assertEquals(20.0, square.calcCircumference(), 0.001);
    }
}