import java.util.Scanner;
public class TugasPemilihan4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hBA, jBA, hBB, jBB, hBC, jBC, totA,totB,totC, totBayar;
        double diskon=0;

        System.out.println("Masukkan harga barang A ");
        hBA = input.nextInt();
        System.out.println("Masukkan jumlah barang A ");
        jBA = input.nextInt();
        System.out.println("Masukkan harga barang B ");
        hBB = input.nextInt();
        System.out.println("Masukkan jumlah barang B ");
        jBB = input.nextInt();
        System.out.println("Masukkan harga barang C ");
        hBC = input.nextInt();
        System.out.println("Masukkan jumlah barang C ");
        jBC = input.nextInt();
        
        totA = hBA * jBA;
        totB = hBB * jBB;
        totC = hBC * jBC;
        totBayar = totA + totB + totC;
        
        if (totBayar>1000000) {
            diskon = totBayar * 0.1;
        }
        else if (totBayar>500000) {
            diskon = totBayar * 0.05;
        }
        else if (totBayar>200000) {
            diskon = totBayar * 0.02;
        }
        
        double totalBayar = totBayar - diskon;

        System.out.println("--------------------------");
        System.out.println("\tStruk Nota");
        System.out.println("--------------------------");
        System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal\t|");
        System.out.println("barang A\t|\t"+hBA+"\t|\t"+jBA+"\t|\t"+totA);
        System.out.println("barang B\t|\t"+hBB+"\t|\t"+jBB+"\t|\t"+totB);
        System.out.println("barang A\t|\t"+hBC+"\t|\t"+jBC+"\t|\t"+totC);
        System.out.println("\t\tTotal: " +totBayar);
        System.out.println("\t\tdiskon: " +diskon);
        System.out.println("\t\tTotal Bayar: " +totalBayar);

        
    }    
}
