import java.util.Scanner;

public class TugasPemilihan1_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilBul1, bilBul2;

        System.out.println("Bilangan bulat pertama: ");
        bilBul1 = input.nextInt();
        System.out.println("Bilangan bulat kedua: ");
        bilBul2 = input.nextInt();

        if (bilBul1<bilBul2) {
            System.out.println("Bilangan bulat terbesar adalah: " +bilBul2);
        }
        else if (bilBul1>bilBul2) {
            System.out.println("Bilangan bulat terbesar adalah: " +bilBul1);
        }
        else {
            System.out.println("Tidak termasuk bilangan bulat");
        }
    }
}
