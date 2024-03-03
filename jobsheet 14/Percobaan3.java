import java.util.Scanner;

/**
 * Percobaan3
 */
public class Percobaan3 {
    static double hitungLaba(double saldo, double tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11*hitungLaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal, tahun;
        System.out.println("Jumlah saldo awal: ");
        saldoAwal = sc.nextInt();
        System.out.println("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah "+tahun+" Tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}