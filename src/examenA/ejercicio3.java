package examenA;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;

        do {
            System.out.print("dime un nº: ");
            n = sc.nextInt();
            suma = 0;

        }while(n < 0);

        while (n > 0) {
            suma = suma + n % 10;
            n = n / 10;
        }

        System.out.println("La suma de los dígitos es: "+suma);
    }
}
