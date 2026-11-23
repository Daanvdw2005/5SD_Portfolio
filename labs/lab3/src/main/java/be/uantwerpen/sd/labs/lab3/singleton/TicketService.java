package be.uantwerpen.sd.labs.lab3.singleton;

public class TicketService {
    public Ticket create(String title) {
        return new Ticket(IdGenerator.getInstance().nextId(), title);
    }
}
