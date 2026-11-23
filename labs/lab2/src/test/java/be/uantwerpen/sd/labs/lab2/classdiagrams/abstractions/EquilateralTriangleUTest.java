package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleUTest {

    @Test
    void calcCircumference() {
        EquilateralTriangle triangle = new EquilateralTriangle(6.0, "TestTriangle");
        assertEquals(18.0, triangle.calcCircumference(), 0.001);
    }

    @Test
    void calcArea() {
        EquilateralTriangle triangle = new EquilateralTriangle(6.0, "TestTriangle");
        double expected = (Math.sqrt(3) / 4.0) * Math.pow(6, 2);
        assertEquals(expected, triangle.calcArea(), 0.001);
    }
}