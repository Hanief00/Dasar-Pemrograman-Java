import java.util.Scanner;
public class ArrayInputLoop13B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiUAS = new int[6];

        for (int i=0; i<nilaiUAS.length; i++) {
            System.out.println("masukkan nilai UAS MHS ke-"+i+":");
            nilaiUAS[i] = input.nextInt();
        }
        for (int i=0; i<6; i++) {
            if (nilaiUAS[i]>=71) {
                System.out.println("Mahasiswa ke-"+i+"lulus!");
            }
            else {
                System.out.println("Mahasiswa ke-"+i+"tidak lulus!");
            }
        }
    }
}
