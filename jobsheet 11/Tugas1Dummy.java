public class Tugas1Dummy {
    public static void main(String[] args) {

        char[] karakter = {'H','A','N','I','E','F','M','O','C','H','S','I','N'};
        char[][] kar = new char[8][5];

        int o=0;
        for (int i=0; i<kar.length; i++) {
            for (int u=0; u< kar[i].length; u++) {
                if (o < karakter.length) {
                    o=o;
                } else {
                    o=0;
                }
                kar[i][u]=karakter[o];
                System.out.print(kar[i][u]);
                o++;
            }
            System.out.println();
        }
    }
}
