package be.uantwerpen.sd.labs.lab3.singleton;
import java.util.concurrent.atomic.AtomicLong;

/*
TODO: Turn this into a Singleton that hands out increasing IDs.
Fields you will need:
  - IdGenerator INSTANCE
Methods you will implement:
  - IdGenerator getInstance()
TIP: Make sure to define the constructor and variables correctly. A counter field; nextId() returns the next value.
*/
public final class IdGenerator {
    private static final IdGenerator INSTANCE = new IdGenerator();

    private final AtomicLong counter = new AtomicLong(0);

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    public long nextId() {
        return counter.incrementAndGet();
    }
}