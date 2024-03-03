import java.util.Scanner;

public class Tugas3 {
    static int prima(int o, int p) {
        if (p==1) {
            return 1;
        } else if (o%p==0) {
            return 1 + prima(o, --p);
        } else {
            return 0 + prima(o, --p);
        }
    }
    static boolean prim(int n) {
        if (n>1) {
            return (prima(n, n)==2);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil=0;
        System.out.println("Masukkan angka: ");
        bil = sc.nextInt();
        if (prim(bil)) {
            System.out.println("Termasuk dalam bilangan prima");
        } else {
            System.out.println("Bukan bilangan prima");
        }
    }
}
