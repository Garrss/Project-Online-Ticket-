

import java.util.Scanner;

public class Transaction {
    public void OrderTicket() {
        Scanner input = new Scanner(System.in);
        PaymentSystem ticket = new PaymentSystem();
        int ChooseTicket = 0;
        int ChoosePayment = 0;

        System.out.println("---------------------------------------");
        System.out.print("Enter the ticket number you want to buy: ");
        int NumberofTicket = input.nextInt();

        boolean choose = true;
        while (choose) {
            System.out.println("---------------------------------------");
            System.out.println("Choose Ticket class : ");
            System.out.println("1. Ticket VIP - $" + ticket.priceTicketVIP);
            System.out.println("2. Ticket Reguler - $" + ticket.priceTicketReguler);
            System.out.println("3. Ticket Biasa - $" + ticket.priceTicketBiasa);
            System.out.print("Enter the tiket class: ");
            ChooseTicket = input.nextInt();

            if (ChooseTicket == 1 || ChooseTicket == 2 || ChooseTicket == 3) {
                choose = false;
                System.out.println("You have choosen " + NumberofTicket + " Ticket");
            } else {
                System.out.println("Maaf Masukan lagi pilihan anda");
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Choose Payment : ");
        System.out.println("1. Tunai");
        System.out.println("2. Non Tunai");
        System.out.print("Enter The Payment : ");
        ChoosePayment = input.nextInt();

        if (ChoosePayment == 1) {
            System.out.println("---------------------------------------");
            System.out.println("Pembayaran dapat dilakukakan ditempat panitia acara");
            ;
        } else if (ChoosePayment == 2) {
            System.out.println("---------------------------------------");
            System.out.println("Pilih Pembayaran");
            System.out.println("BCA 0987654321");
            System.out.println("Mandiri 1357924680");
            System.out.println("BRI 1209348756");
        } else {
            System.out.println("\n");
            System.out.println("Maaf saya tidak mengerti pembayaran yang anda masukkan");
            return;
        }
        System.out.println("Total Price " + ticket.totalPrice(ChooseTicket, NumberofTicket));
    }
}
