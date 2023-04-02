package isp.lab4.exercise4;

public class UserApp {
    private int wallet = 0;
    private Ticket ticket = null;

    public void buyTicket() {
        if(wallet >= 50) { // Pretul biletului este de 50
            wallet -= 50;
            this.ticket = new TicketsManager().generateTicket();
            System.out.println("Ticket has been acquired.");
        }
        else System.out.println("Not enough money in wallet.");
    }

    public void viewTicket() {
        if(this.ticket != null)
            System.out.println("Your ticket ID is: " + ticket.getTicketID());
        else System.out.println("There is no ticket.");
    }

    public void addCurency(int money) {
        this.wallet += money;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getWallet() {
        return wallet;
    }
}
