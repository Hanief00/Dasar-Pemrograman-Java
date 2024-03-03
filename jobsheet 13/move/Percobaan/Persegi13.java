package Percobaan;

public class Persegi13 {
  static int luasPersegi(int sisi) {
    int luas = sisi * sisi;
    System.out.println(luas);
    return luas;
  }

  public static void main(String[] args) {
    int luasan = luasPersegi(5);
    System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
  }
}
