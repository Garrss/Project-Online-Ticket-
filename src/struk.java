import java.util.Scanner;

public class struk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean struk = true;

        while (struk) {
            System.out.println("========================================");
            System.out.println("||            PENYELESAIAN            ||");
            System.out.println("========================================");

            System.out.print("Masukkan nama anda :  ");
            String nama = sc.nextLine();

            System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
            int jumlah = sc.nextInt();

            System.out.print("Masukkan harga tiket per satuannya : ");
            double hargaPerTiket = sc.nextDouble();

            double hargaTotal = jumlah * hargaPerTiket;
            
            System.out.println("===== Struk Pembelian Tiket =====");
            System.out.println("Nama            : " +  nama);
            System.out.println("Jumlah Tiket    : " + jumlah + " tiket");
            System.out.println("Harga Per Tiket : Rp " + hargaPerTiket);
            System.out.println("Total Harga     : Rp " + hargaTotal);

            break;

        }
    }
}