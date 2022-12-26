
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        System.out.print("Matematik notu:");
        int mat = input.nextInt();
        System.out.print("Fizik notu:");
        int fizik = input.nextInt();
        System.out.print("Kimya notu: ");
        int kimya = input.nextInt();
        System.out.print("Türkçe notu: ");
        int turk = input.nextInt();
        System.out.print("Tarih notu: ");
        int tarih = input.nextInt();
        System.out.print("Müzik notu: ");
        int muzik = input.nextInt();

        int ort = (mat+fizik+kimya+turk+tarih+muzik)/6;
        System.out.print("Ortalamanız:");
        System.out.print(ort);




    }
}
