public class Tugas2 {
    public static void main(String[] args) {
        int array[] = {5,2,7,9,6};
        System.out.println("urutan sebenarnya adalah: ");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("urutan terbaliknya adalah: ");
        for (int i=array.length - 1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
}
