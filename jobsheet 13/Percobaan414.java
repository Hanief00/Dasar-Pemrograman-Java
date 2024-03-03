import java.util.Scanner;
public class Percobaan414 {
    static int Kali(int C, int D) {
        int H;
        H = (C+10) % (D+19);
        return H;
    }
    static int Kurang(int A, int B) {
        int X;
        A += 7;
        B += 4;
        X = Kali(A,B);
        return X;   
    }
    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.println("masukkan nilai 2: ");
        nilai2 = input.nextInt();
        int hasil = Kurang(nilai1, nilai2);
        System.out.println("Hasil akhir adalah: "+hasil);
    }
}