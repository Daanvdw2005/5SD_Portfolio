package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTest {

    @Test
    void calcCircumference() {
        EquilateralTriangle triangle = new EquilateralTriangle(6.0, "TestTriangle");
        assertEquals(18.0, triangle.calcCircumference(), 0.001);
    }

    @Test
    void calcArea() {
        EquilateralTriangle triangle = new EquilateralTriangle(6.0, "TestTriangle");
        double expected = (double) (6 * 6) /2;
        assertEquals(expected, triangle.calcArea(), 0.001);
    }
}