package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleUTest {

    @Test
    void calcArea() {
        Circle circle = new Circle(3.0, "TestCircle");
        assertEquals(Math.PI * 9.0, circle.calcArea(), 0.001);
    }

    @Test
    void calcCircumference() {
        Circle circle = new Circle(3.0, "TestCircle");
        assertEquals(2 * Math.PI * 3.0, circle.calcCircumference(), 0.001);
    }
}