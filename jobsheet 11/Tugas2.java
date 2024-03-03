public class Tugas2 {
    public static void main(String[] args) {
        int togamas[][] = { {8,9,5,2}, {7,5,10,3}, {4,6,6,5} };
        String cabang[] = {"Dieng","Soehat","Sengkaling"};
        int harga [] = {40000, 28000, 60000, 75000};
        int banyakBuku[]=new int [10]; 
        int besar=0;
        int totalSemua=0;
        String cabangKaya = "";
        int totalPemasukan[] = new int[10];
        for (int i=0; i<togamas.length; i++) {
            for (int p=0; p<togamas[0].length; p++) {
                banyakBuku[i] += togamas[i][p];
                totalPemasukan[i] += togamas[i][p]*harga[p];
                if (togamas[i][p]>besar) {
                    besar = togamas[i][p];  
                    cabangKaya = cabang[i];
                }
            }
            if (i==0) {
                System.out.println("banyak buku yang terjual di togamas cabang "+cabang[0]+" adalah: "+banyakBuku[i]);
            } else if (i==1) {
                System.out.println("banyak buku yang terjual di togamas cabang "+cabang[1]+" adalah: "+banyakBuku[i]);
            } else if (i==2) {
                System.out.println("banyak buku yang terjual di togamas cabang "+cabang[2]+" adalah: "+banyakBuku[i]);
            }
            totalSemua+=totalPemasukan[i];
            System.out.println();
        }
        System.out.println("pemasukan tertinggi dari hasil penjualan adalah: "+besar+" dari cabang toko: "+cabangKaya);
        System.out.println("Total seluruh pemasukan toko togamas adalah: "+totalSemua);
    }
}
