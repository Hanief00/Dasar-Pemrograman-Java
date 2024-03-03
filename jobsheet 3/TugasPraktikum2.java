import java.util.Scanner;

public class TugasPraktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tandaMerah, tandaBiru, hargaTM, hargaTB, totalHargaBiruDanMerah;
        int diskonMerah = 30; 
        int diskonBiru = 50;

        System.out.print("Item tanda merah: ");
        tandaMerah = sc.nextInt();
        System.out.print("Item tanda biru: ");
        tandaBiru = sc.nextInt();

        hargaTM = 300000 - (300000 * tandaMerah * diskonMerah / 100);
        hargaTB = 275000 - (275000 * tandaBiru * diskonBiru / 100);
        totalHargaBiruDanMerah = hargaTM + hargaTB;
        
        System.out.print("Total Harga Semua : " +totalHargaBiruDanMerah);
        
    }
}
