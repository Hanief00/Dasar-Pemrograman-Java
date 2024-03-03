import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;

        System.out.println("NIM = 2241720181");
        System.out.println("Masukkan Batas Angka: ");
        angka = scan.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0){
                continue;
            }else {
                System.out.printf("%d",i);
            }
        }
    }
}
