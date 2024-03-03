import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] bil = new int[50];
        int max=0, a, b, isi;
        
        System.out.println("jumlah elemen array: ");
        isi = sc.nextInt();

        System.out.println("input "+isi+" angka : ");

        for (a=0; a<isi; a++) {
            bil[a] = sc.nextInt();
        }
        System.out.println();
        for(b=0; b < isi; b++) {
            if (bil[b] > max) {
                max = bil[b];
            }
        } 
        System.out.println("Angka Terbesar Adalah: "+max);
    }
}
