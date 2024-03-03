import java.util.Scanner;
import java.util.random;

import javax.sound.midi.Soundbank;

import java.util.*;
public class finalProject1 {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    static int array2[][] = {
        {7000,3500,14000,11500,12700},
        {9600,18000,10000,12000,18000},
        {15000,4500,6500,15000,12000},
        {8900,16000,21000,13900,32000},
    };
    static String array1[][]= {
        {"Paramex","Sanmol","Komix","Diapet","Ultraflu"},
        {"Promag","Magasida","Amoxicillin","Paracetamol","OBH"},
        {"Panadol","FreshCare","Ficks Faporub","Konidin","Vitamin E"},
        {"Imboost Force","Enervon C","Hemaviton","Pharmaton","Glycerol"}
    };
    static int array[][]= {
        {10,8,5,7,9},
        {14,9,9,13,14},
        {4,15,12,10,7},
        {5,6,6,8,10}
    };
    static String gudang[][] = {
        {"Amoxicillin","Ampicillin","Albumin","Ambroxol","Amineptine"},
        {"Bacitracin","Boron","Biotin","Bromelain","Benazeprill"},
        {"Citicolin","Colistin","Codeine","Clonidine","Cefazolin"},
        {"Diapet","Dextrose","Diltiazem","Dopamine","Doripenem"},
        {"Enervon C","Estazolam","Etodolac","Estrogen","Ergotamine"},
        {"Ficks","Freshcare","Felodipine","Furosemide","Fluconazole"},
        {"Glycerol","Gabapentin","Glucagon","Glimepiride","Granisetron"},
        {"Hemaviton","Hydroquinone","HCG","Heparin","Hyoscin"},
        {"Imboost Force","Indomethacin","Isradipine","Insulin","Isoniazid"},
        {"Jointace","Joint Care","Jayacin","Jatamansi","Jahe"},
        {"Konidin","Kanamycin","Komix","Ketamine","Ketoprofen"},
        {"Lactic Acid","L-Glutamine","Lactulose","Levodopa"},
        {"Morfin","Magasida","Memantine","Modafinil","Metildopa"},
        {"Nilotinib","Neomycin","Naproxen","Nicardipine","Nitrogliserin"},
        {"Optizinc","Osteor-C","OBH","Omegtrim","Oskadon"},
        {"Paracetamol","Panadol","Pharmaton","Promag","Paramex"},
        {"Quinidine","Quinine","Qinox","Qidrox","Qipro"},
        {"Radium","Ramipril","Ranitidin","Ropinirole","Rifabutin"},
        {"Sanmol","Squalene","Spironolactone","Streptokinase","Sertraline"},
        {"Terazosin","Testosterone","Tretinoin","Tizanidine","Tramadol"},
        {"Ultraflu","Uni Cetamol","Ultracet","Ultragrip","Ultilox"},
        {"Vitamin C","Vitamin K","Vitamin B1","Vitamin B3","Vitamin E"},
        {"Warfarin","White petrolatum","Wiacid","Wormwood"},
        {"Xanax","Xorin","Xicalom","Xenifar","Xylitol"},
        {"Yodium","Yafix","Yasiden","Yucca","Yafix"},
        {"Zinc","Zalpidem","Zeos","Zegren","Zentra"}
    };
    static int stokgudang[][] = {
        {20,22,28,25,24},
        {24,32,27,20,18},
        {23,30,33,29,27},
        {31,30,22,19,26},
        {28,26,30,31,23},
        {34,31,37,25,20},
        {18,23,27,31,25},
        {32,21,34,26,30},
        {18,26,31,22,30},
        {24,22,25,20,21},
        {18,19,32,26,21},
        {19,19,20,22,26},
        {29,28,25,32,30},
        {25,28,32,21,26},
        {30,35,26,23,20},
        {32,28,26,24,30},
        {38,35,31,28,27},
        {31,32,38,27,24},
        {40,32,35,37,31},
        {36,32,23,37,31},
        {25,29,20,30,35},
        {24,26,24,20,19},
        {31,29,30,31,24},
        {21,23,26,27,31},
        {21,22,18,15,19},
        {32,21,27,18,20}
    };
    static int hargagudang[][] = {
        {10000,15000,18000,20000,30000},
        {12000,14000,10000,28000,30000},
        {32000,22000,18000,12500,15000},
        {11500,13000,14500,20000,22000},
        {16000,17500,12000,14000,8000},
        {6500,4500,10000,18000,30000},
        {32000,26000,18000,15500,19000},
        {21000,22500,17000,13000,10000},
        {8900,7400,13200,14300,20000},
        {14000,15000,17000,21000,13000},
        {15000,12000,14000,7800,9000},
        {3500,7000,9300,7800,10000},
        {25000,18000,17000,24000,17000},
        {27000,12000,14000,8700,9500},
        {15000,12500,18000,8700,10000},
        {12000,15000,13900,9600,7000},
        {7600,8000,13000,14500,13500},
        {16000,17000,19000,4500,8300},
        {3500,15000,8700,9000,10000},
        {15000,18000,5500,19000,4000},
        {12700,13400,10000,7000,6000},
        {23000,21000,14000,19000,12000},
        {24000,18000,14000,12500,8600},
        {15000,18000,12500,13400,11900},
        {20000,14500,16000,18000,23000},
        {21000,14000,19000,23000,28000}
    };
    public static void main(String[] args) {
        // in.nextLine();
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        boolean menu = true;
        int menu1=0,menu2=0, menu3=0, isi1=0, menu4=0; 
        String isii="", isii1="", isi="",dose="";
        System.out.println("-----------------------------------");
        System.out.println("Rumah Sakit Mitra Keluarga Waru");
        System.out.println("-----------------------------------");
        while (menu) {
            System.out.println("1. Pelayanan Pasien\n2. Stok Obat Yang Tersedia\n3. Gudang");
            System.out.println("masukkan menu Utama? ");
            menu1= in.nextInt();
            if (menu1 == 1) {
                System.out.println("1. Pasien Rawat Jalan/Inap\n2. Pasien Umum");
                menu3 =in.nextInt();
                if (menu3==1) {
                    System.out.println("masukkan tanggal, bulan, dan tahun = ");
                    isi = in.next();
                    System.out.println("masukkan nama dokter = ");
                    isii = in.next();
                    System.out.println("jumlah obat yang tertera di resep dokter = ");
                    isi1 = in.nextInt();
                    String simpan[]= new String [50];
                    String simp[] = new String [50];
                    int simpHarga[]= new int [50];
                    int simpJumlah[] = new int [50];
                    int total =0;
                    int jumlahObat1=0;
                    for (int a=0; a<isi1; a++) {
                        System.out.println("Masukkan Nama Obat = ");
                        isii1 = in.next();
                        simpan[a] = isii1;
                        System.out.println("Dosis Obat = ");
                        dose = in.next();
                        simp[a] = dose;
                        System.out.println("Jumlah Obat Yang Diperlukan =");
                        jumlahObat1=in.nextInt();
                        simpJumlah[a] = jumlahObat1;
                        for (int as=0; as<gudang.length; as++) {
                            for (int ad=0; ad<gudang[as].length; ad++) {
                                if (gudang[as][ad].equalsIgnoreCase(isii1)) {
                                    simpHarga[a] = hargagudang[as][ad];
                                    simpHarga[a]*=simpJumlah[a];
                                    total+=simpHarga[a];
                                    if (jumlahObat1>stokgudang[as][ad]) {
                                        System.out.println("Jumlah Melebihi Batas");
                                    }else {
                                    stokgudang[as][ad]-=jumlahObat1;
                                    System.out.println("stok obat "+isii1+" sekarang adalah "+stokgudang[as][ad]);
                                        if (stokgudang[as][ad]<1) {
                                            System.out.println("Stok Telah Habis");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("Masukkan Nama = ");
                    in.nextLine();
                    String nampas = in.nextLine();
                    System.out.println("Masukkan Umur = ");
                    int umu = in.nextInt();
                    System.out.println("Masukkan Alamat = ");
                    in.nextLine();
                    String alamat = in.nextLine();
                    resep(isi, isii);
                    for (int f=0; f<isi1; f++) {
                        System.out.println(simpan[f]+"\t\t"+simp[f]);
                    }
                    System.out.println("=============================");
                    System.out.println("PRO : "+nampas+"\n"+"UMUR : "+umu+"\n"+"ALAMAT : "+alamat);
                    System.out.println("=============================");
                    System.out.println("\n\n");
                    System.out.println("=======================");
                    System.out.println("Lanjutkan Ke Pembayaran");
                    System.out.println("=======================\n\n");
                    Pembayaranku(isi1, simpan, simpHarga, nampas, isii, total);
                } else if (menu3==2) {
                    pasienumum();
                }
            } else if (menu1 == 2) {
                tampil2(array2,array, array1);
                System.out.println("1. Ubah Stok Obat\n2. Tambah Stok Obat\n3. Input Stok Dari Gudang Ke Stok Utama");
                boolean menuu = true;
                while (menuu) {
                    System.out.println("Pilih Menu? (ya/tidak) ");
                    menuu = in.next().equalsIgnoreCase("ya");
                    if (menuu == true) {
                        System.out.print("masukkan menu = ");
                        menu2 = in.nextInt();
                        if (menu2 == 1) {
                            System.out.println("silahkan ubah stok obat = ");
                            obat(array);
                        } else if (menu2 == 2) {
                            System.out.println("Silahkan Tambah Stok Obat = ");
                            plusobat(array, array1);
                        } else if (menu2 == 3) {
                            int index = 0;
                            String newobat="";
                            int save1= 0, save2= 0;
                            System.out.println("Jumlah Obat Yang Ingin Dimasukkan Ke Stok Utama = ");
                            int jml=in.nextInt();
                            for (int q=0; q<jml; q++) {
                                 System.out.println("Masukkan Nama Obat Dari Gudang = ");
                                 
                                 String obatgudang = in2.nextLine();
                                 newobat = obatgudang;
                                //  perulangan untuk cek display
                                 for (int i=0; i<=array1.length-1; i++) {
                                    for (int j=0; j<=array1[i].length-1; j++) {
                                        if (array1[i][j].equalsIgnoreCase(obatgudang)) {
                                            System.out.println("Barang Sudah Ada");
                                            index = 1;
                                        } 
                                    }
                                 }
                                 if (index==1){
                                     continue;
                                 }

                                 System.out.println("Masukkan Obat Apa Yang Harus Diganti? ");
                                 String obatdisplay= in2.nextLine();
                                 for (int g = 0; g<=array1.length-1;g++){
                                    for(int h = 0; h<=array1[0].length-1;h++){
                                        if (obatdisplay.equalsIgnoreCase(array1[g][h])){
                                            save1=g;
                                            save2=h;
                                        }
                                    }
                                 }
                                //  cek obat digudang
                                for (int l=0; l<=gudang.length-1 ; l++) {
                                    for (int k=0; k<=gudang[l].length-1; k++) {
                                        if (newobat.equalsIgnoreCase(gudang[l][k])) {
                                            array1[save1][save2] = gudang[l][k];
                                            array2[save1][save2] = hargagudang [l][k];
                                            array[save1][save2] = stokgudang [l][k];
                                            gudang[l][k] = "null";
                                            hargagudang[l][k] = 0;
                                            stokgudang[l][k] = 0;
                                        }
                                    }
                                }
                            }
                        } else {
                        System.out.println("pilihan yang anda masukkan tidak benar");
                        }
                    } 
                    // else {
                    //     System.out.println("Pilih Menu lagi? (ya/tidak) ");
                    //     menu = in.next().equalsIgnoreCase("ya");
                    // }
                }
            } else if (menu1 == 3) {
                System.out.println("1. Cek Stok Gudang\n2. Cek Harga Barang Di Gudang\n3. Input Stok Utama Ke Gudang");
                System.out.println("Pilih Menu = ");
                menu4 = in.nextInt();
                if (menu4 == 1) {
                    tampil(stokgudang,gudang);
                } else if (menu4 == 2) {
                    tampil(hargagudang, gudang);
                } else if (menu4 == 3) {
                    int index1 = 0;
                    String newobat1="";
                    int save11= 0, save22= 0;
                    int berkas=0, berkas1=0;
                    String berkas3="";
                    System.out.println("Jumlah Obat Yang Ingin Dimasukkan Ke Gudang = ");
                    int jmlh=in.nextInt();
                    for (int t=0; t<jmlh; t++) {
                        System.out.println("Masukkan Nama Obat Dari Stok Utama = ");
                        String obatgudang1 = in2.nextLine();
                        newobat1 = obatgudang1;
                        //  perulangan untuk cek display
                        // for (int z=0; z<=gudang.length-1; z++) {
                        //     for (int x=0; x<=gudang[z].length-1; x++) {
                        //         if (gudang[z][x].equalsIgnoreCase(obatgudang1)) {
                        //             System.out.println("Barang Sudah Ada");
                        //             index1 = 1;
                        //             } 
                        //         }
                        //     }
                        // if (index1==1){
                        // continue;
                        // }

                        System.out.println("Masukkan Obat Apa Yang Harus Diganti? ");
                        String obatdisplay1= in2.nextLine();
                        for (int c = 0; c<=gudang.length-1;c++){
                            for(int v = 0; v<=gudang[c].length-1;v++){
                                if (obatdisplay1.equalsIgnoreCase(gudang[c][v])){
                                    save11=c;
                                    save22=v;
                                }
                            }
                        }
                        for (int we =0; we<=gudang.length-1; we++) {
                            for (int rt=0; rt<=gudang[we].length-1; rt++) {
                                if (obatdisplay1.equalsIgnoreCase(gudang[we][rt])) {
                                    berkas3 = gudang[we][rt];
                                    berkas1 = hargagudang[we][rt];
                                    berkas = stokgudang[we][rt];
                                }
                            }
                        }
                                //  cek obat digudang
                        for (int l=0; l<=array1.length-1 ; l++) {
                            for (int k=0; k<=array1[l].length-1; k++) {
                                if (newobat1.equalsIgnoreCase(array1[l][k])) {
                                    gudang[save11][save22] = array1[l][k];
                                    hargagudang[save11][save22] = array2 [l][k];
                                    stokgudang[save11][save22] = array [l][k];
                                    array1[l][k] = berkas3;
                                    array2[l][k] = berkas1;
                                    array[l][k] = berkas;
                                }
                            }
                        }
                    }
                }else if (menu4 == 4) {
                    tambahGudang();
                }
            } else {
                System.out.println("menu yang anda masukkan salah");
            }
            System.out.println("apakah anda ingin memilih menu utama lagi? (ya/tidak)");
            menu = in.next().equalsIgnoreCase("ya");
        }
    }
    static void plusobat(int array[][], String array1[][]) {
        System.out.println("Pilih Obat yang ingin ditambah : ");
        for (int i=0; i< array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.printf("["+array1[i][j]+"]");
            }
            System.out.println();
        }

        System.out.print("Masukkan Obat : ");
        String obat = in.nextLine();
        for (int i = 0; i< array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (obat.equalsIgnoreCase(array1[i][j])) {
                    System.out.println("Stok obat sekarang adalah : " + array[i][j]);
                    System.out.println("Tambah stok baru : ");
                    array[i][j] += in.nextInt();
                }
            }
        }
    }
    // static void inputstok() {
        
    // }
    static void obat(int obatku[][]) {
        for (int i=0; i<obatku.length; i++) {
            for(int j=0; j<obatku[0].length; j++) {
                obatku[i][j] = in.nextInt();
            }
        }
    }
    static void tampil(int obat1[][],String nama[][]) {
        for (int i=0; i<nama.length; i++) {
            for (int j=0; j< nama[i].length; j++) {
                System.out.print("-["+nama[i][j]+"="+obat1[i][j]+"]-");
            }
            System.out.println("");
        }
    }
    static void tampil2(int rego[][], int obat1[][],String nama[][]) {
        for (int i=0; i<nama.length; i++) {
            for (int j=0; j< nama[i].length; j++) {
                System.out.print("-["+nama[i][j]+"="+obat1[i][j]+"]-");
                System.out.println("-["+nama[i][j]+"="+rego[i][j]+"]-");
            }
            System.out.println("");
        }
    }
    static void resep(String tgl, String dokter) {
        System.out.println("-----------------------------");
        System.out.println("\tRUMAH SAKIT\n\tMITRA KELUARGA\nJl. Jenderal S. Parman No.8");
        System.out.println("-----------------------------");
        System.out.println("KHUSUS AKSES RAWAT JALAN/INAP");
        System.out.println("-----------------------------");
        System.out.println("Tgl :"+tgl);
        System.out.println("Dr :"+dokter);
        System.out.println("-----------------------------");
        System.out.println("R/");

        // 
    }
    static void pasienumum() {
        Scanner in2 = new Scanner(System.in);
        String simpNama1[] = new String [50];
        String simpNama[] = new String [50];
        int simpJumlah[] = new int [50];
        int simpHarga[] = new int [50];
        int total=0;
        System.out.println("Masukkan Nama Pasien = ");
        String nampasi = "";
        nampasi = in2.nextLine();
        System.out.println("Masukkan Nama Dokter = ");
        String namdok = "";
        namdok = in2.nextLine();
        System.out.println("Berapa Jumlah Jenis Obat Yang Diperlukan = ");
        int syarat = in.nextInt();
        for (int h=0; h<syarat; h++) {
            System.out.println("Obat Apa Yang Diperlukan? ");
            String find = in.next();
            simpNama[h] = find;
            System.out.println("Jumlah Obat Yang Diperlukan = ");
            int jumlah = in.nextInt();
            simpJumlah[h] = jumlah;
                        for (int as=0; as<gudang.length; as++) {
                            for (int ad=0; ad<gudang[as].length; ad++) {
                                if (gudang[as][ad].equalsIgnoreCase(find)) {
                                    simpHarga[h] = hargagudang[as][ad];
                                    simpHarga[h]*=simpJumlah[h];
                                    total+=simpHarga[h];
                                    if (jumlah>stokgudang[as][ad]) {
                                        System.out.println("Jumlah Melebihi Batas");
                                    }else {
                                    stokgudang[as][ad]-=jumlah;
                                    System.out.println("stok obat "+find+" sekarang adalah "+stokgudang[as][ad]);
                                        if (stokgudang[as][ad]<1) {
                                            System.out.println("Stok Telah Habis");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("\n\n"+"=======================");
                    System.out.println("Lanjutkan Ke Pembayaran");
                    System.out.println("=======================\n\n");
                    Pembayaranku(syarat, simpNama, simpJumlah, nampasi, namdok, total);
            // for (int i=0; i<array1.length; i++) {
            //     for (int j=0; j<array1[0].length; j++) {
            //         if (array1[i][j].equalsIgnoreCase(find)) {
            //             if (jumlah>array[i][j]) {
            //                 System.out.println("Jumlah Melebihi Batas");
            //             }else {
            //             array[i][j]-=jumlah;
            //             System.out.println("stok obat "+find+" sekarang adalah "+array[i][j]);
            //                 if (array[i][j]<1) {
            //                     System.out.println("Stok Telah Habis");
            //                 }
            //             }
            //         break;
            //         }
            //     }
            // }
    }
    static void Pembayaranku(int jumlahObat, String array[], int arr[], String p, String d, int total) {
        int rand = random.nextInt(11);
        // for (int yu=0; yu<jumlahObat; yu++) {
        //     for (int i=0; i<aer.length; i++) {
        //         for (int j=0; j<aer[0].length; j++) {
        //             if (aer[i][j].equalsIgnoreCase(namaobatku)) {
        //                 if (obatjumlah>aerr[i][j]) {
        //                     System.out.println("Jumlah Melebihi Batas");
        //                 }else {
        //                 aerr[i][j]-=obatjumlah;
        //                 // System.out.println("stok obat "+namaobatku+" sekarang adalah "+aer[i][j]);
        //                     if (aerr[i][j]<1) {
        //                         System.out.println("Stok Telah Habis");
        //                     }
        //                 }
        //             break;
        //             }
        //         }
        //     }
        // }
        System.out.println("------------------------------------------");
        System.out.println("\tRUMAH SAKIT MITRA KELUARGA");
        System.out.println("Jl. Jenderal S. Parman No.8, Krajan Kulon,\nWaru, Kec. Waru, Kabupaten Sidoarjo");
        System.out.println("\tTELP : (031) 8542111");
        System.out.println("------------------------------------------");
        System.out.println("\tBUKTI PEMBAYARAN");
        System.out.println("\tNO:"+rand);
        System.out.println("Sudah Diterima Dari \t:"+p);
        System.out.println("Nama Pasien \t\t:"+p);
        System.out.println("Nama Dokter \t\t:"+d);
        System.out.println("Untuk Pembayaran");
        for (int h=0; h<jumlahObat; h++) {
            System.out.println("\t"+array[h]+"\t\t"+arr[h]);
        }
        System.out.println("------------------------------------------");
        System.out.println("Total Pembayaran\t"+total);
        System.out.println("------------------------------------------");
    }
    static void tambahGudang() {
        char plus;
        System.out.println("Masukkan Type Obat Berdasarkan Abjad = ");
        plus = in.next().charAt(0);
        if (plus == 'a') {
            System.out.println("berapa jumlah obat baru yang akan ditambahkan = ");
            int obatBaru = in.nextInt();
            for (int h=0; h<=0;h++) {
                for (int l=0; l<gudang[0][4+obatBaru]; l++) {
                    gudang[0][4+obatBaru]=in.nextLine();
            }

        }

    }
}
}


    // static int resep1(int ulang, String obat, int dosis) {
        
    // }
