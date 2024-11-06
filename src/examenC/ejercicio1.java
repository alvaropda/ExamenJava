package examenC;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        do {
            System.out.print("Dime un número: ");
            n = sc.nextInt();

        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de 1 a "+n+" es: "+suma);
    }
}
