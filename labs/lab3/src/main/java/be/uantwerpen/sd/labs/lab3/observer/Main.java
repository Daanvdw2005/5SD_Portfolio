package be.uantwerpen.sd.labs.lab3.observer;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        /*
            TODO: Create an Auction, attach observers, then place a few bids to see notifications.
            TIP: auction.addObserver(new ConsoleAnnouncer()); ...
        */
        Auction auction = new Auction();
        MaxBidTracker tracker = new MaxBidTracker();
        auction.addObserver(new ConsoleAnnouncer());
        auction.addObserver(tracker);

        auction.place(new Bid("Daan", (int)(Math.random() * 150))); // 0 to 150
        auction.place(new Bid("Sooi", (int)(Math.random() * 150)));
        auction.place(new Bid("Tibo", (int)(Math.random() * 150)));

        System.out.println("Highest: " + auction.highest().getBidder()
                + " with " + auction.highest().getAmount());
        System.out.println("Tracker max: " + tracker.getMax());

    }
}
