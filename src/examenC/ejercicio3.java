package examenC;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        int n;
        int nOriginal;
        int capicuo = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el número");
            n = sc.nextInt();
            nOriginal = n;
        } while (n < 0);

        while (n != 0) {
            capicuo = capicuo * 10 + n % 10;
            n /= 10;
        }

        if (capicuo == nOriginal)
            System.out.println("Es capicuo");
        else
            System.out.println("No es capicuo");
    }
}
