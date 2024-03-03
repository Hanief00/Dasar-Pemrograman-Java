import java.util.Scanner;
public class WhileGaji1B13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int karyawan, jam, gaji, jumlah=0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan: ");
        karyawan = scan.nextInt();

        int i=0;
        while (i < karyawan) {
            System.out.print("Pilihan jabatan - Direktur, Manager, Staf");
            System.out.print("Masukkan jabatan karyawan ke-"+(i+1)+": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jam = scan.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                gaji = jam * 100000;
            } else {
                gaji = jam * 75000;
            }
        }
        System.out.print("Pengeluaran perusahaan =  " + jumlah);
    }
}
