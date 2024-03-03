import java.util.Scanner;

public class TugasPemilihan3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double uas, uts, kuis, tugas; 
        double nA;

        
        System.out.println("Nilai UAS: ");
        uas = input.nextDouble();
        System.out.println("Nilai UTS: ");
        uts = input.nextDouble();
        System.out.println("Nilai Kuis: ");
        kuis = input.nextDouble();
        System.out.println("Nilai Tugas: ");
        tugas = input.nextDouble();
        nA = (uas * 0.4) + (uts * 0.3) + (kuis * 0.1) + (tugas * 0.2);
        
        if (nA>65 & nA<=100) {
            System.out.println("LULUS");
        }
        else if (nA<65) {
            System.out.println("Kamu Remidi");
        } 
        else {
            System.out.println("Kamu harus ulangan kembali");
        }
    }    
}
