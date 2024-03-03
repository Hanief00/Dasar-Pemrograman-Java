package Hanief;
import java.util.Scanner;
public class Tugas2 {
  static Scanner sc = new Scanner(System.in);

  static void nilaiTugas(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print("masukkan nilai mahasiswa: ");
        arr[i][j] = sc.nextInt();
      }
    }
  }

  static void nilai(int arr[][]) {
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[0].length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println("");
    }
  }
  
  static void max(int m[][], int[] ming, int[] nilai) {
    for (int i=0; i<m.length; i++)  {
      for (int j=0; j<m[0].length; j++) {
        if (m[i][j]>nilai[i]) {
          nilai[i] = m[i][j];
          ming[i] = j + 1;
       }
      }
    }
    for (int i=0; i<ming.length; i++) {
      System.out.print("minggu ke : "+ming[i]+" ");
      System.out.print("nilai: "+nilai[i]+" ");
      System.out.println();
    }
  }

  static void nilaiMAX(int[][] m,int[] nilai, int[] ming) {
    if(nilai[0] == 0) {
      max(m, ming, nilai);
    }
    int max = 0, minggu = 0;
    for (int i = 0; i < nilai.length; i++) {
      if(nilai[i] > max) {
        max = nilai[i];
        minggu = ming[i];
      }
    }
    System.out.println("nilai tertinggi adalah: "+max);
    System.out.println("pada minggu ke : "+minggu);
  }



  public static void main(String[] args) {
    int ara[][] = {
        { 20, 19, 25, 20, 10, 0, 10 },
        { 30, 30, 40, 10, 15, 20, 25 },
        { 5, 0, 20, 25, 10, 5, 45 },
        { 50, 0, 7, 8, 0, 30, 60 },
        { 15, 10, 16, 15, 10, 10, 5 }
    };
    int minggu[] = new int [5];
    int nilai[] = new int [5];
    int u=0;
    int p=0;
    boolean pilihan = true;
    int menu;
    while (pilihan) {
      System.out.println("masukkan menu: ");
      System.out.println("1. inputkan nilai untuk mengubah");
      System.out.println("2. tampilan nilai mahasiswa");
      System.out.println("3. tampilan nilai tertinggi dari hari lain");
      System.out.println("4. tampilan nilai tertinggi dari semua mahasiswa");
      System.out.println("5. ubah jumlah mahasiswa dan tugas");
      menu = sc.nextInt();
      if (menu == 1) {
        nilaiTugas(ara);
      } else if (menu == 2) {
        nilai(ara);
      } else if (menu == 3) {
        max(ara, minggu, nilai);
      } else if (menu == 4) {
        nilaiMAX(ara ,nilai, minggu);
      } else if (menu == 5) {
        System.out.println("masukkan jumlah mahasiswa: ");
        u = sc.nextInt();
        System.out.println("masukkan jumlah tugas per minggu: ");
        p = sc.nextInt();
        ara = new int [u][p];
        nilaiTugas(ara);
      }else {
        System.out.println("menu yang anda masukkan salah");
      }
      System.out.println("ingin memilih menu lagi? (ya/tidak) ");
      pilihan = sc.next().equalsIgnoreCase("ya");
    }        
  }
}
