import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        for (int outer = 1; outer <= angka; outer++) {
            System.out.println("");
            for (int inner = 1; inner <= angka; inner++){
                if (outer == 1 || outer == angka || inner == 1 || inner == angka ) {
                    System.out.print("5");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
