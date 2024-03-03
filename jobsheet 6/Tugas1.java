import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga=0, biayaAdmin, tot;
        String kodeKeberangkatan;

        System.out.println("Masukkan Kode Keberangkatan [pg/sg/mg/reg] : ");
        kodeKeberangkatan = input.nextLine();
        System.out.println("kode keberangkatan : "+ kodeKeberangkatan);
        biayaAdmin = 50000;
        switch (kodeKeberangkatan) {
            case "pg":
            System.out.println("Kelas Kereta : Eksekutif");
            break;
            case "sg":
            System.out.println("Kelas Kereta : Bisnis");
            break;
            case "mg":
            System.out.println("Kelas Kereta : Luxury");
            break;
            case "reg":
            System.out.println("Kelas Kereta : Reguler");
            break;

            default:
            System.out.println("Kode Yang Anda Masukkan Salah");
        } 
        if (kodeKeberangkatan.equalsIgnoreCase("pg")) {
            harga = 1250000;
        }else if (kodeKeberangkatan.equalsIgnoreCase("sg")) {
            harga = 1375000;
        }else if (kodeKeberangkatan.equalsIgnoreCase("mg")) {
            harga = 2500000;
        }else if (kodeKeberangkatan.equalsIgnoreCase("reg")) {
            harga = 50000;
        }
        System.out.println("Biaya Tiket : "+harga);
        tot = harga + biayaAdmin;
        System.out.println("Total Bayar : "+tot);
    }
}
