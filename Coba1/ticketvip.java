import java.util.Scanner;

public class ticketvip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double priceTicketVIP = 300;
        int NumberofTicket;

        System.out.println("input ticket vip: ");
        NumberofTicket = input.nextInt();
        
        priceTicketVIP = priceTicketVIP * NumberofTicket;
        System.out.println("Price Ticket VIP " + priceTicketVIP);

    }
    
}