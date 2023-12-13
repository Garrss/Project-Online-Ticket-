    public static void struk(String nama_tiket, String harga_tiket, int jumlah_tiket, double total_harga) {
        System.out.println("\n***** STUk *****");
        System.out.println("Nama Tiket: " + nama_tiket);
        System.out.println("Harga Tiket: $" + harga_tiket);
        System.out.println("Jumlah Tiket: " + jumlah_tiket);
        System.out.println("Total Harga: $" + total_harga);
        System.out.println("*****************\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama_tiket = {"Anak-anak", "Remaja", "Dewasa"};
        String[] harga_tiket = {"10000", "20000", "30000"};

        int PilihTiket, JumlahTiket, PilihPembayaran;

        System.out.print(" Pilih Jenis Tiket : ");
        PilihTiket = input.nextInt();

        while (PilihTiket < 1 || PilihTiket > 3) {
            System.out.println("Maaf saya tidak mengerti jenis tiket yang anda masukkan");
            PilihTiket = input.nextInt();
        }

        System.out.print(" Masukkan jumlah tiket : ");
        JumlahTiket = input.nextInt();

        System.out.println("*****************************");
        System.out.println("Jenis Pembayaran");
        System.out.println("1. Tunai    ");
        System.out.println("2. Debit    ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.print(" Pilih Jenis Pembayaran : ");
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

        double total = Hitungtotal(PilihTiket, JumlahTiket, harga_tiket);
        System.out.println("\nTotal Price: $" + total);

        struk(nama_tiket[PilihTiket - 1], harga_tiket[PilihTiket - 1], JumlahTiket, total);
    }

    public static double Hitungtotal(int PilihTiket, int JumlahTiket, String[] harga_tiket) {
        double total = 0;
        total = JumlahTiket * Integer.parseInt(harga_tiket[PilihTiket - 1]);
        return total;
    }
}