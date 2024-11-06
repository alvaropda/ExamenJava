package examenB;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int suma = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime cuantos numeros hay de sucesión: ");
            n = sc.nextInt();
        }while(n < 0);
        System.out.print("0");

        for (int i = 1; i < n; i++) {
                suma = a + b;
                System.out.print(","+suma);
                b = a;
                a = suma;
            }
        }
    }
