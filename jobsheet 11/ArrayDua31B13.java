import java.util.Scanner;
public class ArrayDua31B13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data[][] = new int [4][4];
        int jam[] = {3,6,9,12};
        int min[] = {100,100,100,100};
        double total[] = {0,0,0,0};
        double rata[] = {0,0,0,0};
        for (int i=0; i<data.length; i++) {
            System.out.printf("jam %s\n", jam[i]);
            for (int j=0; j<data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("masukkan suhu: ");
                        data[i][j] = scan.nextInt();
                        if (min[j]>data[i][j]) {
                            min[j]=data[i][j];
                        }
                        total[j]+=data[i][j];
                        break;
                    case 1:
                        System.out.print("masukkan kelembaban: ");
                        data[i][j] = scan.nextInt();
                        if (min[j]>data[i][j]) {
                            min[j]=data[i][j];
                        }
                        total[j]+=data[i][j];
                        break;
                    case 2:
                        System.out.print("masukkan kecepatan angin: ");
                        data[i][j] = scan.nextInt();
                        if (min[j]>data[i][j]) {
                            min[j]=data[i][j];
                        }
                        total[j]+=data[i][j];
                        break;
                    case 3:
                        System.out.print("masukkan index UV: ");
                        data[i][j] = scan.nextInt();
                        if (min[j]>data[i][j]) {
                            min[j]=data[i][j];
                        }
                        total[j]+=data[i][j];
                        break;
                }
                rata[j]=total[j]/data[0].length;
            }
        }
        System.out.println("-------------------");
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data[0].length; j++ ) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------------");
        System.out.printf("rata-rata suhu: %.2f\n", rata[0]);
        System.out.printf("presentase kelembaban terendah: %s\n", min[1]);
        System.out.println("-------------------");
        for (int i=0; i<data.length; i++) {
            for (int j=2; j==2; j++ ) {
                System.out.print("kecepatan angin pada jam "+jam[i]+"= "+data[i][2]);
            }
            System.out.println("");
        }
        //jangan lupa dikerjakan ya seamngat hanief
        int p=0,o=0,m=0,n=0;;
        for (int i=0; i<data[0].length; i++) {
            for (int j=0; j<data.length; j++) {
                if (i==0) {
                    if (data[j][i]>p) {
                        p=data[j][i];
                    }
                }
            }
        }
        System.out.println("suhu terbesar: "+p);
        for (int i=0; i<data[0].length; i++) {
            for (int j=0; j<data.length; j++) {
                if (i==1) {
                    if (data[j][i]>o) {
                        o=data[j][i];
                    }
                }
            }
        }
        System.out.println("kelembaban terbesar: "+o);
        for (int i=0; i<data[0].length; i++) {
            for (int j=0; j<data.length; j++) {
                if (i==2) {
                    if (data[j][i]>m) {
                        m=data[j][i];
                    }
                }
            }
        }
        System.out.println("kecepatan angin terbesar: "+m);
        for (int i=0; i<data[0].length; i++) {
            for (int j=0; j<data.length; j++) {
                if (i==3) {
                    if (data[j][i]>n) {
                        n=data[j][i];
                    }
                }
            }
        }
        System.out.println("index UV terbesar: "+n);

    }
}

