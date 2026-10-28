package be.uantwerpen.sd.labs.lab3.observer;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
TODO: Implement Subject and notify observers when a new bid arrives.
Fields you will need:
  - Set<Observer> observers
Methods you will implement:
  - void addObserver(Observer o)
  - void removeObserver(Observer o)
  - void notifyObservers(String event, Object payload)
  - void place(Bid bid)
TIP: Pick an event name (e.g., 'bidPlaced') and send the Bid as payload.
*/
public class Auction implements Subject {
    private Bid highest;
//    mag ik ook een lijst gebruiken.
    List<Observer> observers = new ArrayList<>();
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
        /*
            TODO: Accept a bid, update the highest bid when appropriate, and notify observers.
            TIP: Compare with current highest; notify with your chosen event name.
        */

        if (bid == null){
            throw new IllegalArgumentException("bid was null");
        }

        if (highest == null || bid.getAmount() > highest().getAmount()){
            highest = bid;
            notifyObservers(BID_PLACED, bid);
        }
        notifyObservers(BID_PLACED, bid);
    }

    public Bid highest() {
        return highest;
    }
}
