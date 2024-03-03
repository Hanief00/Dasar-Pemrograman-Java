import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, sisi, alas, tinggi, jariJari;
        double luasPersegi, luasSegitiga, volumeKubus, volumeTabung;
        String pilih;

        System.out.println("Masukkan Menu : ");
        menu = input.nextInt();
       

        if (menu == 1) {
            System.out.println("a.persegi");
            System.out.println("b.segitiga");
            System.out.println("Pilih [a,b] : ");
            pilih = input.next();
            if (pilih.equalsIgnoreCase("a")) {
                System.out.println("sisi : ");
                sisi = input.nextInt();
                luasPersegi = sisi*sisi;
                System.out.println("Luas Persegi Adalah : " +luasPersegi);
            }else if (pilih.equalsIgnoreCase("b")){
                System.out.println("alas : ");
                alas = input.nextInt();
                System.out.println("tinggi : ");
                tinggi = input.nextInt();
                luasSegitiga = 0.5*alas*tinggi;
                System.out.println("Luas Segitiga Adalah : " +luasSegitiga);
            }
                
        }else if (menu == 2) {
            System.out.println("a.Kubus");
            System.out.println("b.Tabung");
            System.out.println("Pilih [a,b] : ");
            pilih = input.next();
            if (pilih.equalsIgnoreCase("a")) {
                System.out.println("sisi : ");
                sisi = input.nextInt();
                volumeKubus = sisi*sisi*sisi;
                System.out.println("Volume Kubus Adalah : " +volumeKubus);
            }else if (pilih.equalsIgnoreCase("b")){
                System.out.println("jari-jari : ");
                jariJari = input.nextInt();
                System.out.println("tinggi : ");
                tinggi = input.nextInt();
                volumeTabung = 3.14*(jariJari*jariJari)*tinggi;
                System.out.println("Volume Tabung Adalah : " +volumeTabung);
            }
        
    }
    }
}