package be.uantwerpen.sd.labs.lab3.observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String event, Object payload);

}