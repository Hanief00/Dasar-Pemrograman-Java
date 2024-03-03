import java.util.Scanner;

public class fungsi1 {
    static int p, l, t, L, vol;
    static int hitungLuas(int pj, int lb) {
        L= pj*lb;
        return L;
    }
    static int hitungVolume (int pj, int lb, int ti) {
        vol = lb*pj*ti;
        return vol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan p: ");
        p=sc.nextInt();
        System.out.println("masukkan t: ");
        t=sc.nextInt();
        System.out.println("masukkan l: ");
        l=sc.nextInt();
        System.out.println(hitungLuas(p, l));
        System.out.println(hitungVolume(t, p, l));
    }
}
