package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeUTest {
    @Test
    void testCalculateDailySalary() {
        // 20.0 * 8.0 = 160.0
        Employee employee = new Employee(20.0, 8.0);
        assertEquals(160.0, employee.calculateDailySalary(), 0.001);
    }

    @Test
    void testCalculateDailySalaryZeroHours() {
        Employee employee = new Employee(20.0, 0.0);
        assertEquals(0.0, employee.calculateDailySalary(), 0.001);
    }

}