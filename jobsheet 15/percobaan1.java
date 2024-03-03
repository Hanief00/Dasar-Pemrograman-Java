import java.util.Scanner;

public class percobaan1 {
    public int faktorial(int n) {
        int faktor;
        if (n == 0) {
            faktor = 1;
        } else if {
            faktor = n*faktorial(n-1);
        }
        return faktor
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka, hasil;
        System.out.println("masukkan angka");
        angka = sc.nextInt();

        hasil = faktorial(angka);
        System.out.println(hasil);
    }
}