public class PraktikumArray13B {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 5;
        bil[1] = 12;
        bil[2] = 7;
        bil[3] = 20;

        for (int i=0; i<bil.length; i++) {
            System.out.println(bil[i]);
        }
        System.out.println("jumlah elemen yang dapat ditampung: "+bil.length);
    }
}
