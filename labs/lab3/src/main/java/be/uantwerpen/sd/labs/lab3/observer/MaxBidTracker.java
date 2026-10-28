package be.uantwerpen.sd.labs.lab3.observer;

/*
TODO: Track and print the current maximum bid.
Methods you will implement:
  - void update(String event, Object payload)
TIP: Keep an int field; update it when a higher bid arrives.
*/
public class MaxBidTracker implements Observer{
    private int max = 0;

    @Override
    public void update(String event, Object payload) {
        if (Auction.BID_PLACED.equals(event)) {
            Bid bid = (Bid) payload;
            if (bid.getAmount() > max) {
                max = bid.getAmount();
                System.out.println("Max bid is now " + max);
            }
        }
    }

    public int getMax() {
        return max;
    }
}
