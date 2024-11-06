package examenC;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int n;
        int cnt = 0;
        int mayor = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("escribe un numero: ");
            n = sc.nextInt();

            if (n > mayor)
                mayor = n;

            cnt++;

        } while (cnt < 5);

        System.out.println("el mayor es: "+mayor);
    }
}
