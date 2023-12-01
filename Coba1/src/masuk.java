import java.util.Scanner;

public class masuk {
  static Scanner input = new Scanner(System.in);
  static String[] usernames = new String[100];
  static String[] passwords = new String[100];
  static String[] Namalengkap = new String[100];

  static int userCount = 0;

  static String userLogin() {
    System.out.print("Username = ");
    return input.nextLine();
  }

  static String pwLogin() {
    System.out.print("Password = ");
    return input.nextLine();
  }

  static void registrasi() {
    String nama, username, pass, ulangPass;

    System.out.println("========================================");
    System.out.println("||           Registration             ||");
    System.out.println("========================================");

    do {
      System.out.print("Username: ");
      username = input.nextLine();

      System.out.print("Nama Lengkap: ");
      nama = input.nextLine();

      System.out.print("Password: ");
      pass = input.nextLine();

      System.out.print("Confirm Password: ");
      ulangPass = input.nextLine();

      if (!ulangPass.equals(pass)) {
        System.out.println("Gagal, passwords Salah. Please try again.");
      } else {
        usernames[userCount] = username;
        passwords[userCount] = pass;
        Namalengkap[userCount] = nama;
        userCount++;
        System.out.println("-------------------------------");
        System.out.println("Registration Successful");
        login(username, pass);
        return;
      }
    } while (true);
  }

  static void login(String username, String pass) {
    System.out.println("========================================");
    System.out.println("||                Login               ||");
    System.out.println("========================================");
    
    boolean cocok = false;
    int i = 3;
    
    while (i > 0) {
      String MasukanUsername = userLogin();
      String MasukanPassword = pwLogin();


      for (int j = 0; j < userCount; j++) {
        if (MasukanUsername.equals(usernames[j]) && MasukanPassword.equals(passwords[j])) {
          cocok = true;
          System.out.println("Selamat Datang " + Namalengkap[j]);
          return;
        }
      }
      
      
      
        System.out.println("You have reached the maximum login attempts.");
        break;
    }
        System.out.println("Username atau Password salah, silakan login kembali.kesempatan login : " + (i - 1));
      
      registrasi();

    }
  
  public static void main(String[] args) {
    registrasi();
  }
}