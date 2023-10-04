import java.util.Scanner;

public class ChooseTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double priceTicketVIP = 300.0;
        double priceTicketReguler = 200.0;
        double priceTicketBiasa = 80.0;

        System.out.println("Choose Ticket : ");
        System.out.println("1. Ticket VIP - $" + priceTicketVIP);
        System.out.println("2. Ticket Reguler - $" + priceTicketReguler);
        System.out.println("3. Ticket Biasa - $" + priceTicketBiasa);
        System.out.print("Enter the ticket number you want to buy: ");
        int ChooseTicket = input.nextInt();

        System.out.print("Enter the ticket number you want to buy: ");
        int NumberofTicket = input.nextInt();

        double totalprice = 0.0;
        if (ChooseTicket == 1) {
            totalprice = priceTicketVIP * NumberofTicket;
        } else if (ChooseTicket == 2) {
            totalprice = priceTicketReguler * NumberofTicket;
        } else if (ChooseTicket == 3) {
            totalprice = priceTicketBiasa * NumberofTicket;
        } else {
            System.out.println("the ticket number you entered is invalid.");
            return;
        }

        System.out.println("You have choosen " + NumberofTicket + "Ticket");
        System.out.println("Total Price: $" + totalprice);
        }

    }

