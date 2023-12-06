import java.util.Scanner;

public class Login2 {
  static Scanner input = new Scanner(System.in);
static String uslogin, pwlogin;

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
    System.out.println("||           Pembelian user           ||");
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
    int counterLoginInvalid = 1;
    int i = 3;

    while (true) {
      String MasukanUsername = userLogin();
      String MasukanPassword = pwLogin();

      if (MasukanUsername.equals(username) && MasukanPassword.equals(pass)) {
        cocok = true;
        System.out.println("Selamat Datang " + MasukanUsername);
        return;
      } else if (counterLoginInvalid == 3) {
        System.out.println("Anda sudah 3x salah, Akun anda terhapus. Silahkan registrasi kembali.");
        return;
      } else {
        System.out.println(
            "Username atau Password salah, silakan login kembali " + "(kesempatan login " + (3 - counterLoginInvalid)
                + "x lagi)");
        counterLoginInvalid++;
      }

    }
  }

  public static void main(String[] args) {
    registrasi();
  }
}
