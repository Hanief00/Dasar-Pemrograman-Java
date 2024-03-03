package Percobaan;

public class Greeting13 {
  static void beriSalam() {
    System.out.println("Halo! Selamat Pagi");
  }

  static void beriUcapan(String salam) {
    System.out.println(salam);
  }

  public static void main(String[] args) {
    beriSalam();
    String salam = "Semoga selalu semangat";
    beriUcapan(salam);
  }
}
