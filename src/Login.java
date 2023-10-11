import java.util.Scanner;


public class Login {
 
    static Scanner in = new Scanner(System.in);
    static String uslogin, pwlogin;
    
  static String userLogin(){
    System.out.print("Username = ");
    uslogin = in.nextLine();
    return uslogin;
  }
  
  static String pwLogin(){
    System.out.print("Password = ");
    pwlogin = in.nextLine();
    return pwlogin;
  }
 
  public static void main(String[] args) {
    String nama, username, pass, ulang_pass;
    ChooseTicket ch = new ChooseTicket();
    
    boolean Daftar = true;
    
    while(Daftar){
      System.out.print("Username = ");
      username = in.nextLine();
      
      System.out.print("Nama Lengkap = ");
      nama = in.nextLine();
      
      System.out.print("Password = ");
         pass = in.nextLine();
         
         System.out.print("Ulangi Password = ");
         ulang_pass = in.nextLine();
         
         if(ulang_pass.equals(pass)){
           Daftar = false;
           System.out.println("-------------------------------");
           System.out.println("Registrasi Berhasil\nLogin User");
           
           for(int i = 3;i >= 1;i --){
             
             if(userLogin().equals(username) && pwLogin().equals(pass)){
               System.out.println("Selamat Datang "+ nama);
               break;
              } 
              else if( i == 1 ){
                System.out.println("Anda sudah 3x salah, silahkan untuk login kembali");
              }
              else {
                System.out.println("Username atau Password salah, silakan login kembali " + "(kesempatan login "+(i-1)+"x lagi)");
              }
            }
          } else {
            System.out.println("Gagal");
          } 
          ch.Choose();
  }
}
}