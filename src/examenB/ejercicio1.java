package examenB;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int n;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime un nº: ");
            n = sc.nextInt();

            if (n > 0 && n % 2 == 0)
                System.out.println("Es par");
            else if (n > 0)
                System.out.println("Es impar");

        }while (n < 0);
    }
}
