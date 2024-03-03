package Hanief;

import java.util.Scanner;

public class Kubus13 {
  static int volKubus(int sisi) {
    int volume = sisi * sisi * sisi;
    System.out.println(volume + "cm");
    return volume;
  }

  static int luasKubus(int sisi) {
    int luas = 6 * sisi * sisi;
    System.out.println(luas + "cm");
    return luas;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("masukkan sisi: ");
    int s = sc.nextInt();
    int vol = volKubus(s);
    int ls = luasKubus(s);
    System.out.println("volume dan luas kubus dengan sisi " + s + "cm adalah: " + vol + "cm dan " + ls + "cm");
  }
}
