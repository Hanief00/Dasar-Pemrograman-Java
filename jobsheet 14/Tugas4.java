import java.util.Scanner;
public class Tugas4 {
    static Scanner sc = new Scanner(System.in);
    static int angka=0, bilangan=1, nomor=0;

    static int marmut(int first, int second) {
        if (first == 0) {
            return 0;
        } else if (first > 0 ) {
            nomor = angka + bilangan;
            pasangan(angka, bilangan, nomor, first, second);
            angka = bilangan;
            bilangan = nomor;
            marmut(first - 1, ++second);
        }
        return 0;
    }

    static void pasangan(int q, int w, int e, int limit, int t) {
        System.out.print("bulan ke : "+t+" | "+q+" | "+w+" | "+e+" |");
        System.out.println();
    }     
    public static void main(String[] args) {
        int p = 1;
        System.out.print("Masukkan Bulan: ");
        int limit = sc.nextInt();
        marmut(limit, p);
    }    
}
