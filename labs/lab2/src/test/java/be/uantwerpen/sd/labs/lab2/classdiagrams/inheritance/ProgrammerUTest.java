package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerUTest {
    @Test
    void testCalculateDailySalary() {
        // (30.0 * 8.0) + (10.0 * 5.0) = 240.0 + 50.0 = 290.0
        Programmer programmer = new Programmer(30.0, 8.0, 10.0, 5.0);
        assertEquals(290.0, programmer.calculateDailySalary(), 0.001);
    }
}