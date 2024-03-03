public class Tugas2 {
    public static void main(String[] args) {

        int anakAnak, dewasa, jumlah, bulan = 0;
        anakAnak = 50000;
        dewasa = 100000;
        jumlah = (anakAnak + dewasa) * 5;

        for (int i=1; i <= 31; i++) {
            if (i % 7 == 0) {
                bulan = 0;
            }else if (i % 7 != 0) {
                bulan+=jumlah;
            }
            System.out.printf("Banyaknya pemasukkan selama tanggal %d adalah %d\n", i, bulan);
        }
    }
}
