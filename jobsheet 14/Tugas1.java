import java.util.Scanner;

public class Tugas1 {
    static int rekurs(int m) {
        if (m == 0) {
            return 1;
        } else  {
            return (m*rekurs(m-1));
        }
    }
    static int interatif(int v) {
        int faktor = 1;
        for (int i=v; i>=1; i--) {
            faktor *= i;
        }
        return faktor;
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int bil=0, bil1=0;
       System.out.println("masukkan bilangan rekursif: ");
       bil = sc.nextInt();
       System.out.println("masukkan bilangan interatif: ");
       bil1= sc.nextInt();
       System.out.println(rekurs(bil));
       System.out.println(interatif(bil1));
    }
}
