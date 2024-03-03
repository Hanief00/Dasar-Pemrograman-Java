package Percobaan;

import java.util.Scanner;

public class Percobaan613 {
  // public static void main(String[] args) {
  // int p, l, t, L, vol;
  // Scanner sc = new Scanner(System.in);

  // System.out.println("Masukkan Panjang: ");
  // p = sc.nextInt();
  // System.out.println("Masukkan Lebar: ");
  // l = sc.nextInt();
  // System.out.println("Masukkan Tinggi: ");
  // t = sc.nextInt();

  // L = p * l;
  // System.out.println("Luas Persegi Panjang adalah " + L);

  // vol = p * l * t;
  // System.out.println("Volume Persegi adalah " + vol);
  // }

  static int hitungLuas(int pjg, int lb) {
    int luas = pjg * lb;
    return luas;
  }

  static int hitungVolume(int tinggi, int a, int b) {
    int volume = hitungLuas(a, b) * tinggi;
    return volume;
  }

  public static void main(String[] args) {
    int p, l, t, L, vol;
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Panjang: ");
    p = sc.nextInt();
    System.out.println("Masukkan Lebar: ");
    l = sc.nextInt();
    System.out.println("Masukkan Tinggi: ");
    t = sc.nextInt();

    L = hitungLuas(p, l);
    System.out.println("Luas Persegi Panjang adalah " + L);

    vol = hitungVolume(t, p, l);
    System.out.println("Volume Persegi adalah " + vol);
  }
}
