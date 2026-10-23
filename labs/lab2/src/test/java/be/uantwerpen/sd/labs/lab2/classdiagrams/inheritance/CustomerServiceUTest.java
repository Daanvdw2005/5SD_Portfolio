package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceUTest {
    @Test
    void testCalculateDailySalary() {
        // (18.0 * 8.0) + (5.0 * 12.0) = 144.0 + 60.0 = 204.0
        CustomerService cs = new CustomerService(18.0, 8.0, 5.0, 12.0);
        assertEquals(204.0, cs.calculateDailySalary(), 0.001);
    }

}