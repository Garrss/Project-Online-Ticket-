import java.util.Scanner;

class Transaction {
    public static void main(String[] args) {
        OrderTicket();
    }

    public static void OrderTicket() {
        Scanner input = new Scanner(System.in);
        PaymentSystem ticket = new PaymentSystem();
        int ChooseTicket = 0;
        int ChoosePayment = 0;

        String[] jenisTiket = { "VIP", "Reguler", "Biasa" };
        double[] hargaTiket = { 300.0, 200.0, 80.0 };

        System.out.println("---------------------------------------");
        System.out.print("Enter the ticket number you want to buy: ");
        int NumberofTicket = input.nextInt();

        boolean choose = true;
        while (choose) {
            System.out.println("---------------------------------------");
            System.out.println("Choose Ticket class : ");
            for (int i = 0; i < hargaTiket.length; i++) {
                System.out.println((i + 1) + ". Ticket " + jenisTiket[i] + " - $" + hargaTiket[i]);
            }
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
            choose = false;
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
            System.out.println("Maaf saya tidak mengerti pembayaran yang anda masukkan");
            return;
        }
        System.out.println("Total Price " + ticket.totalPrice(ChooseTicket, NumberofTicket));
    }
}