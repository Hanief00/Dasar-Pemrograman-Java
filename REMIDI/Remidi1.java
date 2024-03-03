import java.util.Scanner;
public class Remidi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idBuku=0, menu=0;
        boolean ulangi=true;
        int harry=5;
        int rahasia=5;
        int onep=5;
        while (ulangi) {
            System.out.println("pilihan menu 1: buku, 2: peminjaman, 3: pengembalian");
            System.out.println("masukkan menu 1/2/3? ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("id buku = 202, judul = harry potter, jumlah = "+harry);
                System.out.println("id buku = 100, judul = rahasia dunia, jumlah = "+rahasia);
                System.out.println("id buku = 76, judul = one piece, jumlah = "+onep);
            } else if (menu ==2) {
                System.out.println("masukkan id buku: ");
                idBuku = sc.nextInt();
                if (idBuku == 202) {
                    harry-=1;
                    if (harry > 0) {
                        System.out.println("stock harry potter: "+harry);
                    } else if (harry <= 0) {
                        System.out.println("stok habis");
                    }
                } else if (idBuku == 100) {
                    rahasia-=1;
                    if (rahasia > 0) {
                        System.out.println("stock rahasia dunia: "+rahasia);
                    } else if (rahasia<=0) {
                        System.out.println("stok habis");
                    }
                } else if (idBuku == 76) {
                    onep-=1;
                    if (onep > 0) {
                        System.out.println("stock one piece: "+onep);
                    } else if (onep <=0) {
                        System.out.println("stok habis");
                    }
                } else {
                    System.out.println("id buku yang anda masukan salah!");
                }
            } else if (menu == 3) {
                System.out.println("input id buku: ");
                idBuku = sc.nextInt();
                if (idBuku == 202) {
                    harry+=1;
                    if (harry <= 5) {
                        System.out.println("stock harry potter: "+harry);
                    }else if (harry > 5){
                        System.out.println("tidak ada buku yang anda kembalikan");
                    }
                } else if (idBuku == 100) {
                    rahasia+=1;
                    if (rahasia <= 5) {
                        System.out.println("stock rahasia dunia: "+rahasia);
                    }
                    else if (rahasia > 5) {
                        System.out.println("tidak ada buku yang anda kembalikan");
                    }
                } else if (idBuku == 76) {
                    onep+=1;
                    if (onep <= 5) {
                        System.out.println("stock one piece: "+onep);
                    } else if (onep > 5) {
                        System.out.println("tidak ada buku yang anda kembalikan");
                    }
                } else {
                    System.out.println("id buku salah");
                }
            } else {
                System.out.println("menu yang anda masukkan salah!");
            }
            System.out.println("apakah anda ingin memilih menu?(y/t) ");
            ulangi = sc.next().equalsIgnoreCase("y");
        }
    }
}
