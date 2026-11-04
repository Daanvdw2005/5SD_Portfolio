package be.uantwerpen.sd.labs.lab3.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceITest {

    @Test
    void ticketsGetIncreasingIds() {
        TicketService svc = new TicketService();
        Ticket first = svc.create("Printer broken");
        Ticket second = svc.create("Monitor flicker");

        assertEquals("Printer broken", first.getTitle());
        assertTrue(second.getId() > first.getId());
    }

    @Test
    void differentServicesShareTheSameCounter() {
        Ticket a = new TicketService().create("A");
        Ticket b = new TicketService().create("B");

        assertEquals(a.getId() + 1, b.getId());
    }
}