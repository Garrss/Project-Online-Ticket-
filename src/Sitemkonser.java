import java.util.Scanner;

public class Sitemkonser {
    static String nama;
    static String email;
    static String umur;
    static String[] Konser = { "Tulus", "Rumah Sakit ", "Reality Club" };
    static int PilihKonser = 0;
    static int Konserinput = 0;
    static int kelamininput = 0;
    static String[] jenisKelamin = { "Laki-laki", "Perempuan" };
    static String[] jenisTiket = { "VIP", "Reguler", "Biasa" };
    static int[] hargaTiket = { 300, 100, 50 };
    static int JumlahTiket = 0;
    static int PilihTiket = 0;
    static int PilihPembayaran = 0;
    static String jenisbank = "";
    static boolean choose = true;

    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("***              Welcome!             ***");
        System.out.println("***            to the Event!          ***");
        System.out.println("*****************************************");

        Menukonser();
        Menupembelian();
        OrderTicket();
        PaymentSystem();
        Struk();
    }

    static double hargaTiketVIP = 300.0;
    static double hargaTiketReguler = 100.0;
    static double hargaTiketBiasa = 50.0;

    public static double Hitungtotal(int hargaTiket, int jumlahTiket) {
        double total = 0.0;

        if (hargaTiket == 1) {
            total = hargaTiketVIP * jumlahTiket;
        } else if (hargaTiket == 2) {
            total = hargaTiketReguler * jumlahTiket;
        } else if (hargaTiket == 3) {
            total = hargaTiketBiasa * jumlahTiket;
        } else {
            System.out.println("the ticket number you entered is invalid.");
        }

        return total;
    }

    public static void Menukonser() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("||           Menu Pembelian tiket                      ||");
        System.out.println("|Konser :                    Hari            Artis     ||");
        System.out.println("||1.                         Day 1           Tulus     ||");
        System.out.println("||2.                         Day 2         Rumah sakit ||");
        System.out.println("||3.                         Day 3         Reality Club||");
        System.out.println("=========================================================");

        System.out.print("Masukkan konser: ");
        Konserinput = input.nextInt();

        if (PilihKonser == 1 || PilihKonser == 2 || PilihKonser == 3) {
            choose = false;
        } else {
            System.out.println("Masukkan kembali pilihan tiket anda Y/T");
            Konserinput = input.nextInt();
        }
    }

    public static void Menupembelian() {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("||           Menu Pembelian tiket     ||");
        System.out.println("========================================");

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan Email: ");
        email = input.nextLine();

        System.out.print("Masukkan Umur: ");
        umur = input.nextLine();

        System.out.println("Pilih Jenis Kelamin: ");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        while (kelamininput != 1 && kelamininput != 2) {
            System.out.print("Masukan Jenis Kelamin Anda: ");
            kelamininput = input.nextInt();
        }
        System.out.println("Registration Successful!");
    }

    public static void OrderTicket() {
        Scanner order = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.print("Enter the ticket number you want to buy: ");
        JumlahTiket = order.nextInt();

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
                System.out.println("You have chosen " + JumlahTiket + " Ticket");
            } else {
                System.out.println("Maaf Masukan lagi pilihan anda");
            }
        }
    }

    public static void PaymentSystem() {
        Scanner input = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("---------------------------------");
        System.out.println("Pilih Pembayaran");
        System.out.println("1.Langsung ditempat panitia acara");
        System.out.println("2.Transfer Bank");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.print(" Pilih Jenis Pembayaran : ");
        PilihPembayaran = input.nextInt();

        while (PilihPembayaran < 1 || PilihPembayaran > 2) {
            System.out.print("Maaf, harap pilih 1 atau 2 untuk jenis pembayaran: ");
            PilihPembayaran = input.nextInt();
        }
    }

    public static void pembayaran() {

        Scanner input = new Scanner(System.in);

        if (PilihPembayaran == 2) {
            System.out.println("---------------------------------------");
            System.out.println("Pilih Pembayaran");
            System.out.println("1.BCA 0987654321");
            System.out.println("2.Mandiri 1357924680");
            System.out.println("3.BRI 1209348756");
            System.out.print("Pilih Rekening Bank yang anda inginkan: ");
            int pilihbank = input.nextInt();

            switch (pilihbank) {
                case 1:
                    jenisbank = "BCA 0987654321";
                    break;
                case 2:
                    jenisbank = "Mandiri 1357924680";
                    break;
                case 3:
                    jenisbank = "BRI 1209348756";
                    break;
                default:
                    System.out.println("Maaf saya tidak mengerti pembayaran yang anda masukkan");
                    pembayaran();
                    break;
            }
        } else if (PilihPembayaran == 1) {
            jenisbank = "Langsung ditempat panitia acara";
        }
    }

    public static void Struk() {
        System.out.println("\n========================================");
        System.out.println("||              Struk Pembelian         ||");
        System.out.println("==========================================");
        System.out.println("Konser: " + Konser[Konserinput - 1]);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin[kelamininput - 1]);
        System.out.println("Jumlah Tiket: " + JumlahTiket);
        System.out.println("Tipe Tiket: " + jenisTiket[PilihTiket - 1]);
        System.out.println("Pembayaran: " + jenisbank);
        System.out.println("Total Harga: Rp" + Hitungtotal(PilihTiket, JumlahTiket));
        System.out.println("=========================================");
        System.out.println("||              TerimaKasih             ||");
        System.out.println("==========================================");
    }
}
