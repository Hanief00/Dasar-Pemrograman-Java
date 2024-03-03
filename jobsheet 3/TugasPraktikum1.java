public class TugasPraktikum1 {
    public static void main(String[] args) {
        String kampus = "polinema";
        int tingkat = 1;
        char kelas = 'Z';
        boolean statusSkill = true;
        int bilanganBulat = 10;
        double bilanganPecahan = 3.33333;
        char karakter = 'C';

        System.out.println(String.format("Saya mahsiswa Polinema kelas %s%s", tingkat, kelas));
        System.out.println("Sebelum masuk Polinema saya (" +statusSkill+ ") sudah menguasai programming");
        System.out.println("Saya sedang belajar menampilkan nilai: ");
        System.out.println("Bilangan bulat " + bilanganBulat);
        System.out.println("Bilangan pecahan " + bilanganPecahan);
        System.out.println("Karakter " + karakter);
    }
}
