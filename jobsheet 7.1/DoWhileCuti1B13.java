import java.util.Scanner;
public class DoWhileCuti1B13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cuti = 5;
        char konfirmasi;

        do {
            System.out.print("Apakah Anda Menggunakan Jatah Cuti 1 Hari (y/t)? ");
            konfirmasi = scan.next().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'y') {
                cuti--;
                System.out.printf("Sisa %d hari\n", cuti);
                if (cuti == 2) {
                    System.out.println("STOP! jatah cuti tinggal 2 hari");
                    break;
                }
            }else {
                System.out.println("PROGRAM BERHENTI!");
                break;
            }
        } while (cuti > 0);
    }
}
