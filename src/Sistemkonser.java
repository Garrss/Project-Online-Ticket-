import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Sistemkonser {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static Date purchaseDate;
    static String purchaseHistory = "";
    static String nama, email, jenisbank;
    static int umur;
    static String[] Konser = { "TULUS", "RUMAHSAKIT", "REALITY CLUB", "FOURTWENTY", "DEWA" };
    static String[] Day = { "DAY 1", "DAY 2", "DAY 3", "DAY 4", "DAY 5" };
    static String[] tempat = { "RAMPAL", "GRAHA CAKRAWALA", "DOME UMM", "KRIDA BUDAYA", "RAMPAL" };
    static String[] jenisKelamin = { "Laki-laki", "Perempuan" };
    static String[] jenisTiket = { "VIP", "Reguler", "Biasa" };
    static int hargaTiket[] = { 100000, 200000, 300000 };
    static int PilihKonser, kelamininput, JumlahTiket, PilihTiket, PilihPembayaran;
    static boolean choose = true;

    public static void main(String[] args) {
        System.out.println("===================================================================================");
        System.out.println("||                                   WELOCOME                                    ||");
        System.out.println("||                               TO SYSTEM CONCERT                               ||");
        System.out.println("===================================================================================");

        Menukonser();
        
    }
    public static void Menu(){
        Scanner menu = new Scanner(System.in);
        System.out.println("===================================================================================");
        System.out.println("|| 1. Beli Tiket                                                                  ||");
        System.out.println("|| 2. Lihat Riwayat                                                              ||");
        System.out.println("|| 0. Keluar                                                                     ||");
        System.out.println("===================================================================================");
        System.out.print("Pilih Menu: ");
        int pilihMenu = menu.nextInt();

        switch (pilihMenu) {
            case 1:
                Menukonser();
                break;
            case 2:
                showHistory();
                break;
            case 0:
                System.out.println("===================================================================================");
                System.out.println("                  Terima kasih telah menggunakan program kami!                    ");
                System.out.println("===================================================================================");
                System.exit(0);
                break;
            default:
                System.out.println("Masukkan menu yang benar.");
                Menu();
                break;
        }
    }
//ini adalah Sistem tampilan History
    public static void showHistory() {
        System.out.println("===================================================================================");
        System.out.println("||                             Riwayat Pembelian                                  ||");
        System.out.println("===================================================================================");

        if (purchaseHistory.isEmpty()) {
            System.out.println("Belum ada riwayat pembelian.");
        } else {
            System.out.println(purchaseHistory);
        }

        System.out.println("===================================================================================");

        Menu();
    }

//ini adalah sistem perhitungan harga
    public static double Hitungtotal(int PilihTiket, int jumlahTiket) {
        return hargaTiket[PilihTiket - 1] * JumlahTiket;
        
        
    }
//Ini adalah Menu Konser
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
            DataDiri();
        } else if (PilihKonser == 0) {
            System.out.println("Exiting the program. Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Input Again Consert Tiket: ");
            Menukonser();
        }
    }
    //ini adalah Profile data diri
    public static void DataDiri() {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.println("||                                 PROFILE                                       ||");
        System.out.println("===================================================================================");

        System.out.print("Enter Your Name: ");
        nama = input.nextLine();

        System.out.print("Enter Your Email: ");
        email = input.nextLine();

        System.out.print("Enter Your Age: ");
        umur = input.nextInt();
         
        System.out.println("Choose Your Gender");
        System.out.println("1. Men");
        System.out.println("2. Girl");
        while (kelamininput != 1 && kelamininput != 2) {
            System.out.print("Enter Your Gender : ");
            kelamininput = input.nextInt();
        }
        System.out.println("Registration Successful!");
        OrderTicket();
        
    }
//ini adalah tempat memesan tiket
public static void OrderTicket() {
    Scanner order = new Scanner(System.in);
    System.out.println("===================================================================================");
    System.out.print("Enter the ticket number you want to buy: ");
    JumlahTiket = order.nextInt();

    choose = true;
        System.out.println("Choose Ticket class : ");
        for (int j = 0; j < hargaTiket.length; j++) {
            System.out.println((j + 1) + ". Ticket " + jenisTiket[j] + " - Rp" + hargaTiket[j]);
        }
        System.out.print("Enter the tiket class: ");
        PilihTiket = order.nextInt();

        if (PilihTiket == 1 || PilihTiket == 2 || PilihTiket == 3) {
            choose = false;
            System.out.println("You have chosen " + JumlahTiket + " Ticket");  
        } else {
            System.out.println("Choose Again Your Ticket: ");
        }
        PaymentSystem();
    }
  
//ini adalah tempat memeilih pembayaran
    public static void PaymentSystem() {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.println("Choose Your Payment");
        System.out.println("1.Cash (on the event committee)");
        System.out.println("2.Transfer Bank");
        System.out.println("===================================================================================");
        System.out.print("Choose Your Payment : ");
        PilihPembayaran = input.nextInt();

        while (PilihPembayaran < 1 || PilihPembayaran > 2) {
            System.out.print("Sorry, please choose 1 or 2 for payment type: ");
            PilihPembayaran = input.nextInt();
        }
        pembayaran();
    }
//ini adalah sistem lanjutan setelah memilih pembayaran
    public static void pembayaran() {

        Scanner input = new Scanner(System.in);
        purchaseDate = new Date();


        if (PilihPembayaran == 2) {
            System.out.println("===================================================================================");
            System.out.println("Choose Your Bank");
            System.out.println("1.BCA 0987654321");
            System.out.println("2.Mandiri 1357924680");
            System.out.println("3.BRI 1209348756");
            System.out.print("Select the Bank Account you want: ");
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
                    System.out.println("Sorry, I don't understand the payment you entered");
                    pembayaran();
                    break;
            }

        } else if (PilihPembayaran == 1) {
            jenisbank = "Cash (on the event committee";
        }
        switch (PilihKonser) {
            case 1:
                purchaseHistory += "Concert: Tulus, ";
                break;
            case 2:
                purchaseHistory += "Concert: Rumah sakit, ";
                break;
            case 3:
                purchaseHistory += "Concert: Reality Club, ";
                break;
            case 4:
                purchaseHistory += "Concert: Fourtwety, ";
                break;
            case 5:
                purchaseHistory += "Concert: Dewa19, ";
                break;
            default:
                break;
        }

        switch (PilihTiket) {
            case 1:
                purchaseHistory += "Ticket Class: VIP, ";
                break;
            case 2:
                purchaseHistory += "Ticket Class: Reguler, ";
                break;
            case 3:
                purchaseHistory += "Ticket Class: Biasa, ";
                break;
            default:
                break;
        }

        purchaseHistory += "Number of Tickets: " + JumlahTiket + ", ";
        purchaseHistory += "Payment: " + jenisbank + ", "; 
        purchaseHistory += "Date: " + dateFormat.format(purchaseDate) + ", ";
        purchaseHistory += "Total Price: Rp" + Hitungtotal(PilihTiket, JumlahTiket) + "\n";

        Struk();
    }
    //ini adalah rekap semua yang telah di lakukan/struk
    public static void Struk() {
        purchaseDate = new Date();

        System.out.println("\n===================================================================================");
        System.out.println("||                               Struk Pembelian                                 ||");
        System.out.println("===================================================================================");
        System.out.println("  |Date: " + dateFormat.format(purchaseDate));
        System.out.println("  | " + Konser[PilihKonser -1]);
        System.out.println("  | " + Day[PilihKonser - 1]);
        System.out.println("  | " + tempat[PilihKonser - 1]);
        System.out.println("  |  ");
        System.out.println("  | " + nama);
        System.out.println("  | " + email);
        System.out.println("  | " + umur);
        System.out.println("  | " + jenisKelamin[kelamininput - 1]);
        System.out.println("  |Number of Tickets: " + JumlahTiket);
        System.out.println("  |Ticket Type: " + jenisTiket[PilihTiket - 1]);
        System.out.println("  |Payment: " + jenisbank);
        System.out.println("  |Total Price: Rp" + Hitungtotal(PilihTiket, JumlahTiket));
        System.out.println("===================================================================================");
        System.out.println("||                                Thank You                                      ||");
        System.out.println("===================================================================================");
    

        Menu();
    }
}
