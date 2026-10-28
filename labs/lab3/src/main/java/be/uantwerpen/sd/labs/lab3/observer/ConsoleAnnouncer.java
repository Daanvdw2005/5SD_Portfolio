package be.uantwerpen.sd.labs.lab3.observer;

/*
TODO: Announce new bids in the console.
Methods you will implement:
  - void update(String event, Object payload)
TIP: If event equals your chosen name (e.g., 'bidPlaced'), print bidder and amount.
*/
public class ConsoleAnnouncer implements Observer {
    @Override
    public void update(String event, Object payload){
        if (Auction.BID_PLACED.equals(event)) {
            Bid bid = (Bid) payload; // down-cast: the payload of "bidPlaced" is a Bid
            System.out.println("New bid: " + bid.getBidder() + " offers " + bid.getAmount());
        }
    }
}
