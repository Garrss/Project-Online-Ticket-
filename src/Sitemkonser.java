import java.util.Scanner;

public class Sitemkonser {
    static String nama, email, umur, jenisbank;
    static String[] Konser = { "TULUS", "RUMAHSAKIT", "REALITY CLUB", "FOURTWENTY", "DEWA" };
    static String[] Day = { "DAY 1", "DAY 2", "DAY 3", "DAY 4", "DAY 5" };
    static String[] tempat = { "RAMPAL", "GRAHA CAKRAWALA", "DOME UMM", "KRIDA BUDAYA", "RAMPAL" };
    static String[] jenisKelamin = { "Laki-laki", "Perempuan" };
    static String[] jenisTiket = { "VIP", "Reguler", "Biasa" };
    static int[] hargaTiket = { 300, 100, 50 };
    static int PilihKonser, kelamininput, JumlahTiket, PilihTiket, PilihPembayaran;
    static boolean choose = true;

    public static void main(String[] args) {
        System.out.println("===================================================================================");
        System.out.println("||                                   WELOCOME                                    ||");
        System.out.println("||                               TO SYSTEM CONCERT                               ||");
        System.out.println("===================================================================================");

        Menukonser();
        DataDiri();
        OrderTicket();
        PaymentSystem();
        pembayaran();
        Struk();
    }

    static double hargaTiketVIP = 300;
    static double hargaTiketReguler = 100;
    static double hargaTiketBiasa = 50;

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
        System.out.println("===================================================================================");
        System.out.println("||                               Buy Menu Ticket                                 ||");
        System.out.println("|| concert :                  Day             Artis             Place            ||");
        System.out.println("|| 1.                         Day 1           Tulus             Rampal           ||");
        System.out.println("|| 2.                         Day 2         Rumah sakit      Graha Cakrawala     ||");
        System.out.println("|| 3.                         Day 3         Reality Club        Dome UMM         ||");
        System.out.println("|| 4.                         Day 4          Fourtwety       Krida budaya        ||");
        System.out.println("|| 5.                         Day 5           Dewa19            Rampal           ||");
        System.out.println("||                                                                               ||");
        System.out.println("|| 0.                                Exit                                        ||");
        System.out.println("===================================================================================");

        System.out.print("Input consert: ");
        PilihKonser = input.nextInt();

        if (PilihKonser >= 1 && PilihKonser <= 5) {
            choose = false;
        } else {
            System.out.println("Masukkan kembali pilihan tiket anda");
            Menukonser();
        }
    }

    public static void DataDiri() {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.println("||                                 PROFILE                                       ||");
        System.out.println("===================================================================================");

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

        System.out.println("===================================================================================");
        System.out.print("Enter the ticket number you want to buy: ");
        JumlahTiket = order.nextInt();

        choose = true;
        while (choose) {
            System.out.println("===================================================================================");
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

        System.out.println("===================================================================================");
        System.out.println("Pilih Pembayaran");
        System.out.println("1.Langsung ditempat panitia acara");
        System.out.println("2.Transfer Bank");
        System.out.println("===================================================================================");
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
            System.out.println("===================================================================================");
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
        System.out.println("===================================================================================");
        System.out.println("||                               Struk Pembelian                                 ||");
        System.out.println("===================================================================================");
        System.out.println("  | " + Konser[PilihKonser - 1]);
        System.out.println("  | " + Day[PilihKonser - 1]);
        System.out.println("  | " + tempat[PilihKonser - 1]);
        System.out.println("  |  ");
        System.out.println("  | " + nama);
        System.out.println("  | " + email);
        System.out.println("  | " + umur);
        System.out.println("  | " + jenisKelamin[kelamininput - 1]);
        System.out.println("  |Jumlah Tiket: " + JumlahTiket);
        System.out.println("  |Tipe Tiket: " + jenisTiket[PilihTiket - 1]);
        System.out.println("  |Pembayaran: " + jenisbank);
        System.out.println("  |Total Harga: Rp" + Hitungtotal(PilihTiket, JumlahTiket));
        System.out.println("===================================================================================");
        System.out.println("||                                Thank You                                      ||");
        System.out.println("===================================================================================");
    }
}
