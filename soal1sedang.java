
import java.util.Scanner;

public class soal1sedang {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }

        System.out.println("\nHasil faktorial dari " + angka + " adalah: " + faktorial);
        
        System.out.print("Proses: " + angka + "! = ");
        if (angka == 0) {
            System.out.println("1");
        } else {
            for (int i = angka; i > 0; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" x ");
                }
            }
            System.out.println(" = " + faktorial);
        }

    }
}
