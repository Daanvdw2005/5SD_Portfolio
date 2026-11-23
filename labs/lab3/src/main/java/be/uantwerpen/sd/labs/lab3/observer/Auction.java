package be.uantwerpen.sd.labs.lab3.observer;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Auction implements Subject {
    private Bid highest;
    private final Set<Observer> observers = ConcurrentHashMap.newKeySet();
    //List<Observer> observers = new ArrayList<>();
    public static final String BID_PLACED = "bidPlaced";


    @Override
    public void addObserver(Observer o){
        if (o != null){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event, Object payload){
        for (Observer o : observers){
            o.update(event, payload);
        }
    }

    public void place(Bid bid) {
        if (bid == null){
            throw new IllegalArgumentException("bid was null");
        }

        if (highest == null || bid.getAmount() > highest().getAmount()){
            highest = bid;
            notifyObservers(BID_PLACED, bid);
        }
    }

    public Bid highest() {
        return highest;
    }
}
