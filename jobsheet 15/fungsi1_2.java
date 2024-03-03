import java.util.Scanner;

public class fungsi1_2 {
    static int total=0, i, jum;
    static Scanner sc = new Scanner(System.in);
    static int isianarray(int angka) {
        int array[] = new int[angka];
        for (i = 0; i<array.length; i++) {
            array[i]=sc.nextInt();
        }
        return array[angka];
    }
    static int tampilArray(int arr[]) {
        int p=0;
        for (i=0; i<arr.length; i++) {
            p=arr[i];
            System.out.println(p);
        }
        return p;
    }
    static int hitTot(int arr[]) {
        for (i=0; i<arr.length; i++) {
            total+=arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[]dataArray= new int[0];
        System.out.println("masukkan jumlah: ");
        jum=sc.nextInt();
        System.out.println(isianarray(jum));
        System.out.println(tampilArray(dataArray));
        System.out.println(hitTot(dataArray));

    }
}
