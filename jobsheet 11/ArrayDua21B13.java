import java.util.Scanner;
public class ArrayDua21B13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int isiBaris=0, isiKolom=0;
        System.out.println("masukkan baris: ");
        isiBaris = scan.nextInt();
        System.out.println("masukkan kolom: ");
        isiKolom = scan.nextInt();
        String[][] pengunjung = new String[isiBaris][isiKolom];
        for (int baris = 0; baris < pengunjung.length; baris++) {
            for (int kolom=0; kolom<pengunjung[0].length; kolom++) {
                System.out.println("masukkan pengunjung ke: ("+baris+")("+kolom+")");
                pengunjung[baris][kolom]=scan.next();
            }
            System.out.println("------------");
        }
        for (String array[] : pengunjung) {
            for (String ar : array) {
                System.out.printf("%s ", ar);
            }
            System.out.println("");
        }
    }    
}
