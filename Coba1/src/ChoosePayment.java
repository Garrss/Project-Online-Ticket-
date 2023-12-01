import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ChoosePayment {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    boolean choose = true;
    while (choose){
    
    int ChoosePayment;
        System.out.println("---------------------------------------");
        System.out.println("Choose Payment : ");
        System.out.println("1. Tunai");
        System.out.println("2. Non Tunai");
        System.out.print("Enter The Payment : ");
        ChoosePayment = input.nextInt();

        if (ChoosePayment == 1) {
            System.out.println("---------------------------------------");
            System.out.println("Pembayaran dapat dilakukakan ditempat panitia acara");
            choose = false;
        } else if (ChoosePayment == 2) {
            System.out.println("---------------------------------------");
            System.out.println("Pilih Pembayaran");
            System.out.println("BCA 0987654321");
            System.out.println("Mandiri 1357924680");
            System.out.println("BRI 1209348756");
            choose = false;
        } else {
            System.out.println("Maaf saya tidak mengerti pembayaran yang anda masukkan");
             }
        }    
    }
}
