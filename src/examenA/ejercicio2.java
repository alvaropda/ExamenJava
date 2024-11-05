package examenA;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int n = sc.nextInt();
        int fac = 1;

        for (int i = 1; i <= n; i++) {

          fac = fac * i;
        }
        System.out.print("El factorial es: " + fac);
    }
}
