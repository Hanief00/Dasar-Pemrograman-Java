import java.util.Scanner;

public class Kuiz1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tglLahir, blnLahir, thnLahir, thnSekarang, blnSekarang, hriSekarang;

        System.out.println("===============Program Tanggal Lahir===============");

        System.out.print("Masukkan tanggal lahir\t\t: ");
        tglLahir = sc.nextInt();
        System.out.print("Masukkan bulan lahir\t\t: ");
        blnLahir = sc.nextInt();
        System.out.print("Masukkan tahun lahir\t\t: ");
        thnLahir = sc.nextInt();

        System.out.println("Anda lahir pada tanggal: " + tglLahir + "-" + blnLahir + "-" + thnLahir);

        thnSekarang = 2022 - thnLahir;
        blnSekarang = 12 - blnLahir;
        hriSekarang = 31 - tglLahir;

        System.out.print("Jadi usia anda sekarang Adalah " + thnSekarang + "tahun" + blnSekarang + "bulan" + hriSekarang + "hari");

    }
}

   