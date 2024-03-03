import java.util.Scanner;
public class rataNilai13B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMHS13B [] = new int [4];
        double total=0,total2=0, rata=0, rata2=0, ratot=0;
        int jumlah=0, jumlah2=0;
        for (int i=0; i<nilaiMHS13B.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+":");
            nilaiMHS13B[i] = sc.nextInt();
            for (int a=0; a<nilaiMHS13B.length; a++) {
                if (nilaiMHS13B[i] > 70) {
                    total += nilaiMHS13B[i];
                    jumlah++;
                    rata= total/jumlah;
                }
                else if (nilaiMHS13B[i] <= 70){
                    total2 += nilaiMHS13B[i];
                    jumlah2++;
                    rata2= total2/jumlah2;
                }
            }
        }
        ratot =(rata + rata2) / 2;
        System.out.println("nilai rata-rata yang lulus = "+rata);
        System.out.println("nilai rata-rata yang tidak lulus = "+rata2);
        System.out.println("nilai rata-rata kelas adalah = "+ratot);
    }
}
