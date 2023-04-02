package isp.lab5.test.exercise4;

import isp.lab4.exercise4.OrganizerApp;
import isp.lab4.exercise4.Ticket;
import isp.lab4.exercise4.TicketsManager;
import isp.lab4.exercise4.UserApp;
import org.junit.Test;

import static org.testng.AssertJUnit.*;

public class ex4Test {
    @Test
    public void testUser() {
        UserApp user = new UserApp();
        user.viewTicket();
        assertNull(user.getTicket());
        user.addCurency(60);
        user.buyTicket();
        assertNotNull(user.getTicket());
        assertEquals(10, user.getWallet());
        user.viewTicket();
    }
    @Test
    public void testOrganizer() {
        UserApp user = new UserApp();
        OrganizerApp organizer = new OrganizerApp();
        assertEquals(false, organizer.checkIn(user));
        user.addCurency(50);
        user.buyTicket();
        assertEquals(true, organizer.checkIn(user));
    }
    @Test
    public void testTicket() {
        Ticket ticket = new Ticket();
        assertNotNull(ticket.getTicketID());
    }
    @Test
    public void testTicketsManager() {
        TicketsManager ticketsmanager = new TicketsManager();
        Ticket ticket = ticketsmanager.generateTicket();
        assertNotNull(ticket);
        ticketsmanager.validateTicket(ticket);
    }
}
