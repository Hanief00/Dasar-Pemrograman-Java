import java.util.Scanner;
public class Tugas4 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai : ");
        int n = input.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println();
            if (i %2 != 0) {
                for (int j = 1; j<=n; j++){
                    System.out.print(j);
                }
            }else {
                for (int h = n; h > 0; h--) {
                    System.out.print(h);
                }
            }
        }
    }
}