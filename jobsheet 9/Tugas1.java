import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        for (int outer = 1; outer <= angka; outer++) {
            System.out.println("");
            for (int inner = 1; inner <= angka-outer; inner++){
                System.out.print(" ");
            }
            for (int i = 1; i <= outer; i++){
                System.out.print(i);
            }
        }
    }
}
