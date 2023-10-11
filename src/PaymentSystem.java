import java.util.Scanner;
 
    public class PaymentSystem {
        public void psm() {
            Scanner pay = new Scanner(System.in);
            int ChoosePayment;
            
            
              
            System.out.println("-------------------");
            System.out.println("Choose Payment : ");
            System.out.println("1. Tunai");
            System.out.println("2. Non Tunai");
            System.out.print("Enter The Payment : ");
            ChoosePayment = pay.nextInt();
            
            if (ChoosePayment == 1) {
                System.out.println("------------------------------------------------------");
                System.out.println("Pembayaran Dapat Di lakukakan Di Tempat Pantia Acara");;
            } else if (ChoosePayment == 2) {
                System.out.println("-------------------");
                System.out.println("Pilih Pembayaran");
                    System.out.println("BCA 0987654321");
                    System.out.println("Mandiri 1357924680");
                    System.out.println("BRI 1209348756");
                } else {
                    System.out.println("\n");
                    System.out.println("Maaf Saya Tidak Mengerti Pembayaran YAng Anda Masukan");
                    return;
                }
                
            }
        }
        