package be.uantwerpen.sd.labs.lab3.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorUTest {

    @Test
    void getInstance() {
        IdGenerator first = IdGenerator.getInstance();
        IdGenerator second = IdGenerator.getInstance();
        assertSame(first, second);
    }

    @Test
    void nextId() {
        IdGenerator gen = IdGenerator.getInstance();
        long a = gen.nextId();
        long b = gen.nextId();
        assertTrue(b>a);
        assertEquals(a+1,b);
    }
}