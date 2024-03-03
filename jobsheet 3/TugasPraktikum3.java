import java.util.Scanner;

public class TugasPraktikum3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        float suhu, celcius, reamur, fahrenheit, kelvin;

        System.out.print("Input suhu: ");
        suhu = sc.nextInt();

        celcius = suhu;
        reamur = celcius * 4/5;
        fahrenheit = (9/5 * celcius) + 32;
        kelvin = celcius + 273;

        System.out.print("celcius: " + celcius);
        System.out.print("reamur: " + reamur);
        System.out.print("fahrenheit: " + fahrenheit);
        System.out.print("kelvin: " + kelvin); 
    }
}
