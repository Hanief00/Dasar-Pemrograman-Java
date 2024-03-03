import java.util.Scanner;

public class PercobaanPemilihan2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        
        System.out.println("Masukkan Sebuah Bilangan");
        nilai1= input.nextInt();
        System.out.println("Masukkan Sebuah Bilangan");
        nilai2= input.nextInt();

        if (nilai1>=100) {
            nilai1-=5;
        }
        else if (nilai2<=100) {
        }
        if (nilai2>=100) {
            nilai2-=5;
        }
        else if (nilai2<=100) {
        }
        System.out.println("Hasil Nilai Akhir adalah: " +nilai1 );
        System.out.println("Hasil Nilai Akhir adalah: " +nilai2 );
    }
    
}
