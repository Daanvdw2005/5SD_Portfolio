package be.uantwerpen.sd.labs.lab3.singleton;
import java.util.concurrent.atomic.AtomicLong;

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