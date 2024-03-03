import java.util.Scanner;

public class PercobaanPemilihan2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.println("Masukkan Sebuah Bilangan");
        nilai = input.nextInt();

        if (nilai>=100) {
            nilai+=10;
        }
        else{
            nilai-=10;
        }
        System.out.println("Hasil Nilai Akhir adalah" +nilai);
    }
    
}
