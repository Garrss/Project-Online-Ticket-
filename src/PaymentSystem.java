
public class PaymentSystem {
    double priceTicketVIP = 300.0;
    double priceTicketReguler = 200.0;
    double priceTicketBiasa = 80.0;
    double totalprice = 0.0;

    public double totalPrice(int CategoryTicket, int NumberofTicket) {
        if (CategoryTicket == 1) {
            totalprice = priceTicketVIP * NumberofTicket;
        } else if (CategoryTicket == 2) {
            totalprice = priceTicketReguler * NumberofTicket;
        } else if (CategoryTicket == 3) {
            totalprice = priceTicketBiasa * NumberofTicket;
        } else {
            totalprice = 0.0;
            System.out.println("the ticket number you entered is invalid.");
        }

        return totalprice;
    }
}
