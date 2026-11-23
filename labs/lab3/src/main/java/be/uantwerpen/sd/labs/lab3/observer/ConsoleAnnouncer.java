package be.uantwerpen.sd.labs.lab3.observer;

public class ConsoleAnnouncer implements Observer {
    @Override
    public void update(String event, Object payload){
        if (Auction.BID_PLACED.equals(event)) {
            Bid bid = (Bid) payload; // down-cast: the payload of "bidPlaced" is a Bid
            System.out.println("New bid: " + bid.getBidder() + " offers " + bid.getAmount());
        }
    }
}
