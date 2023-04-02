package isp.lab4.exercise4;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Ticket {
    private String ticketID;

    public Ticket() {
        byte[] length = new byte[10];
        new Random().nextBytes(length);
        String generated_string = new String(length, StandardCharsets.UTF_8);
        ticketID = generated_string;
    }
    public String getTicketID() {
        return ticketID;
    }
}
