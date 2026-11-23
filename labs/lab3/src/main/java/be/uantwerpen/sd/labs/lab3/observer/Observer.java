package be.uantwerpen.sd.labs.lab3.observer;

public interface Observer {
    void update(String event, Object payload);
}