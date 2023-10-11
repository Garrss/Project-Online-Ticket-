import java.util.Scanner;

public class ChooseTicket {
    public void Choose(){
        Scanner input = new Scanner(System.in);
        PaymentSystem psl = new PaymentSystem();
        int ChooseTicket,NumberofTicket;
        double priceTicketVIP = 300.0;
        double priceTicketReguler = 200.0;
        double priceTicketBiasa = 80.0;
        double totalprice = 0.0;
        
        System.out.println("---------------------------------------");
        System.out.print("Enter the ticket number you want to buy: ");
        NumberofTicket = input.nextInt();
        
        System.out.println("\n");
        System.out.println("Choose Ticket class : ");
        System.out.println("1. Ticket VIP - $" + priceTicketVIP);
        System.out.println("2. Ticket Reguler - $" + priceTicketReguler);
        System.out.println("3. Ticket Biasa - $" + priceTicketBiasa);
        System.out.print("Enter the tiket class: ");
        ChooseTicket = input.nextInt();
        
        
        
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
                System.out.println("You have choosen " + NumberofTicket + " Ticket");
                System.out.println("Total Price: $" + totalprice);
        psl.psm();
        
        
    }

    }

