package examenA;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int n;
        int fac = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese el número: ");
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {

          fac = fac * i;
        }
        System.out.print("El factorial es: " + fac);
    }
}
