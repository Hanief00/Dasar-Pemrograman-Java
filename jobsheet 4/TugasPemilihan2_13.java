import java.util.Scanner;
public class TugasPemilihan2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;
        
        System.out.println("umurmu adalah: ");
        umur = input.nextInt();

        if (umur>=17) {
            System.out.println("Boleh berkendara");
        }
        else {
            System.out.println("Tidak boleh berkendara");
        }
    }    
}
