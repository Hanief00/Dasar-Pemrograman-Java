package Percobaan;

import java.util.Scanner;

public class Percobaan413 {
  static int Kali(int c, int d) {
    int H;
    H = (c + 10) % (d + 19);
    return H;
  }

  static int Kurang(int a, int b) {
    int X;
    a += 7;
    b += 4;
    X = Kali(a, b);
    return X;
  }

  static int plus(int i, int p) {
    int kali = Kali(i, p);
    int min = Kurang(i, p);
    int result = kali + min;
    return result;
  }

  public static void main(String[] args) {
    int nilai1, nilai2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Nilai 1: ");
    nilai1 = sc.nextInt();
    System.out.print("Masukkan Nilai 1: ");
    nilai2 = sc.nextInt();
    int hasil = plus(nilai1, nilai2);
    System.out.println("Hasil akhir adalah " + hasil);
  }
}
