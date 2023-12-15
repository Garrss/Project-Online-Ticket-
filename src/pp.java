import java.util.ArrayList;
import java.util.Scanner;

public class pp {
    static String nama, email, umur, jenisbank;
    static String[] Konser = {"TULUS", "RUMAHSAKIT", "REALITY CLUB", "FOURTWENTY", "DEWA"};
    static String[] Day = {"DAY 1", "DAY 2", "DAY 3", "DAY 4", "DAY 5"};
    static String[] tempat = {"RAMPAL", "GRAHA CAKRAWALA", "DOME UMM", "KRIDA BUDAYA", "RAMPAL"};
    static String[] jenisKelamin = {"Laki-laki", "Perempuan"};
    static String[] jenisTiket = {"VIP", "Reguler", "Biasa"};
    static int hargaTiket[] = {100000, 200000, 300000};
    static int PilihKonser, kelamininput, JumlahTiket, PilihTiket, PilihPembayaran;
    static ArrayList<Purchase> purchaseHistory = new ArrayList<>();

    static class Purchase {
        String konser;
        String day;
        String tempat;
        String nama;
        String email;
        String umur;
        String jenisKelamin;
        int jumlahTiket;
        String jenisTiket;
        String jenisPembayaran;
        double totalHarga;
    }

    public static void main(String[] args) {
        System.out.println("===================================================================================");
        System.out.println("||                                   WELCOME                                     ||");
        System.out.println("||                               TO SYSTEM CONCERT                               ||");
        System.out.println("===================================================================================");

        Menukonser();
    }

    public static double Hitungtotal(int PilihTiket, int jumlahTiket) {
        return hargaTiket[PilihTiket - 1] * jumlahTiket;
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
        int PilihKonser = input.nextInt();

        if (PilihKonser >= 1 && PilihKonser <= 5) {
            DataDiri();
        } else if (PilihKonser == 0) {
            System.out.println("Exiting the program. Goodbye!");
            System.exit(0);
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

        int kelamininput = 0;
        while (kelamininput != 1 && kelamininput != 2) {
            System.out.print("Masukkan Jenis Kelamin Anda: ");
            kelamininput = input.nextInt();
        }

        System.out.println("Registration Successful!");
        OrderTicket();
    }

    public static void OrderTicket() {
        Scanner order = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.print("Enter the ticket number you want to buy: ");
        int JumlahTiket = order.nextInt();

        boolean choose = true;
        int PilihTiket = 0;
        while (choose) {
            System.out.println("===================================================================================");
            System.out.println("Choose Ticket class : ");
            for (int i = 0; i < hargaTiket.length; i++) {
                System.out.println((i + 1) + ". Ticket " + jenisTiket[i] + " - Rp" + hargaTiket[i]);
            }

            System.out.print("Enter the ticket class: ");
            PilihTiket = order.nextInt();

            if (PilihTiket >= 1 && PilihTiket <= 3) {
                choose = false;
                System.out.println("You have chosen " + JumlahTiket + " Ticket");
            } else {
                System.out.println("Maaf Masukkan lagi pilihan anda");
            }
        }

        PaymentSystem(PilihKonser, JumlahTiket, PilihTiket);
    }

    public static void PaymentSystem(int PilihKonser, int JumlahTiket, int PilihTiket) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.println("Pilih Pembayaran");
        System.out.println("1. Langsung ditempat panitia acara");
        System.out.println("2. Transfer Bank");
        System.out.println("===================================================================================");
        System.out.print(" Pilih Jenis Pembayaran : ");
        int PilihPembayaran = input.nextInt();

        while (PilihPembayaran < 1 || PilihPembayaran > 2) {
            System.out.print("Maaf, harap pilih 1 atau 2 untuk jenis pembayaran: ");
            PilihPembayaran = input.nextInt();
        }

        pembayaran(PilihKonser, JumlahTiket, PilihTiket, PilihPembayaran);
    }

    public static void pembayaran(int PilihKonser, int JumlahTiket, int PilihTiket, int PilihPembayaran) {
        Scanner input = new Scanner(System.in);

        if (PilihPembayaran == 2) {
            System.out.println("===================================================================================");
            System.out.println("Pilih Pembayaran");
            System.out.println("1. BCA 0987654321");
            System.out.println("2. Mandiri 1357924680");
            System.out.println("3. BRI 1209348756");
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
                    pembayaran(PilihKonser, JumlahTiket, PilihTiket, PilihPembayaran);
                    break;
            }
        } else if (PilihPembayaran == 1) {
            jenisbank = "Langsung ditempat panitia acara";
        }

        Struk(PilihKonser, JumlahTiket, PilihTiket, PilihPembayaran);
    }

    public static void Struk(int PilihKonser, int JumlahTiket, int PilihTiket, int PilihPembayaran) {
        System.out.println("===================================================================================");
        System.out.println("||                               Struk Pembelian                                 ||");
        System.out.println("===================================================================================");

        Purchase currentPurchase = new Purchase();
        currentPurchase.konser = Konser[PilihKonser - 1];
        currentPurchase.day = Day[PilihKonser - 1];
        currentPurchase.tempat = tempat[PilihKonser - 1];
        currentPurchase.nama = nama;
        currentPurchase.email = email;
        currentPurchase.umur = umur;
        currentPurchase.jenisKelamin = jenisKelamin[kelamininput - 1];
        currentPurchase.jumlahTiket = JumlahTiket;
        currentPurchase.jenisTiket = jenisTiket[PilihTiket -1];

    }
}
