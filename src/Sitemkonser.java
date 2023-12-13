import java.util.Scanner;

public class Sitemkonser {
    static String[] jenisTiket = { "VIP", "Reguler", "Biasa" };
    static int[] hargaTiket = {300, 100, 50};
    static int JumlahTiket = 0;
    static boolean choose = true;
    static int PilihTiket = 0;
    static int PilihPembayaran = 0;
    static int nama;
    static

    public static void registrasi() {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("||           Pembelian user           ||");
        System.out.println("========================================");

        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();

      System.out.print("Email: ");
        String Email = input.nextLine();

        System.out.print("Umur: ");
        String umur = input.nextLine();

        System.out.print("Jenis Kelamin: ");
        String jenis = input.nextLine();

        System.out.println("Registration Successful!");
    }

    public static void OrderTicket() {
        Scanner order = new Scanner(System.in);
        
        System.out.println("---------------------------------------");
        System.out.print("Enter the ticket number you want to buy: ");
        int JumlahTiket = order.nextInt();

        choose = true;
        while (choose) {
            System.out.println("---------------------------------------");
            System.out.println("Choose Ticket class : ");
            for (int i = 0; i < hargaTiket.length; i++) {
                System.out.println((i + 1) + ". Ticket " + jenisTiket[i] + " - Rp" + hargaTiket[i]);
            }
            System.out.print("Enter the tiket class: ");
            PilihTiket = order.nextInt();

            if (PilihTiket == 1 || PilihTiket == 2 || PilihTiket == 3) {
                choose = false;
                System.out.println("You have choosen " + JumlahTiket + " Ticket");
            } else {
                System.out.println("Maaf Masukan lagi pilihan anda");
            }
        }
    }

    public static void PaymentSystem() {
        Scanner input = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("---------------------------------");
        System.out.println("Jenis Pembayaran");
        System.out.println("1. Tunai    ");
        System.out.println("2. Debit    ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.println(" Pilih Jenis Pembayaran : ");
        PilihPembayaran = input.nextInt();
       
        while (PilihPembayaran < 1 || PilihPembayaran > 2) {
            System.out.println("Maaf saya tidak mengerti pembayaran yang anda masukkan");
            PilihPembayaran = input.nextInt();
        }
        if (PilihPembayaran == 1) {
            System.out.println("---------------------------------------");
            System.out.println("Pembayaran dapat dilakukakan ditempat panitia acara");
        } else if (PilihPembayaran == 2) {
            System.out.println("---------------------------------------");
            System.out.println("Pilih Pembayaran");
            System.out.println("BCA 0987654321");
            System.out.println("Mandiri 1357924680");
            System.out.println("BRI 1209348756");
        } 

          double total = Hitungtotal(PilihTiket, JumlahTiket);
        System.out.println("\nTotal Price: $" + total);
    }

    static double hargaTiketVIP = 300.0;
    static double hargaTiketReguler = 100.0;
    static double hargaTikettBiasa = 50.0;
    
    public static double Hitungtotal(int hargaTiket, int jumlahTiket) {
        double total = 0.0;
    
        if (hargaTiket == 1) {
            total = hargaTiketVIP * jumlahTiket;
        } else if (hargaTiket == 2) {
            total = hargaTiketReguler * jumlahTiket;
        } else if (hargaTiket == 3) {
            total = hargaTikettBiasa * jumlahTiket;
        } else {
            System.out.println("the ticket number you entered is invalid.");
        }
    
        return total;
    }
    public static void struk(){
    Scanner sc = new Scanner(System.in);

        while(choose) {
            System.out.println("========================================");
            System.out.println("||            PENYELESAIAN            ||");
            System.out.println("========================================")
            
            System.out.println("===== Struk Pembelian Tiket =====");
            System.out.println("Nama            : " +  nama);
            System.out.println("Jumlah Tiket    : " + JumlahTiket + " tiket");
            System.out.println("Total Harga     : Rp " + hargaTiket);

            break;
        }
    public static void main(String[] args) {
        registrasi();
        OrderTicket();
        PaymentSystem();
    }
}