import java.util.Scanner;
public class PercobaanNilai {
    public static void main(String[] args) {

        int nilai;
        String grade;
        Scanner scan = new Scanner (System.in);
        System.out.print ("inputkan nilai: ");
        nilai = scan.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 90 && nilai <= 100) {
                System.out.println ("Nilai A, EXCELLENT");
            }else if (nilai >= 80 && nilai <= 89) {
                System.out.println("Nilai B, Pertahankan Prestasi Anda");
            }else if (nilai >= 60 && nilai <= 79) {
                System.out.println("Nilai C, Tingkatkan Prestasi Anda");
            }else if (nilai >= 50 && nilai <= 69) {
                System.out.println("Nilai D, Pertahankan Belajar Anda");
            }else {
                System.out.println("Nilai E, Anda Tidak Lulus");
            }
        }else {
            System.out.println("Nilai yang anda masukkan salah");
        }
    }
}
