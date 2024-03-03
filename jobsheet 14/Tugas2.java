public class Tugas2 {
    static int rekurs(int m) {
        int x;
        if (m == 0) {
            x=0;
        } else  {
            x=m+rekurs(m-1);
        }
        return x;
    }
    public static void main(String[] args) {
        int f=8;
        System.out.println(rekurs(f));
    }
}
