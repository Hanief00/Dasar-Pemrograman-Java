import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bulan[] = {"januari","februari","maret","april","mei","juni","juli","agustus","september","oktober","november","desember"};
        System.out.println("bulan ke? max 12: ");
        int roll = sc.nextInt();

        System.out.println(bulan[roll-1]);

    }
}
