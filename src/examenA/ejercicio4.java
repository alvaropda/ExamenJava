package examenA;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un nº: ");
        int n = sc.nextInt();
        int nInicial = n;
        int digito = 0;
        int cnt = 0;
        int suma = 0;

        do {
            digito = n % 10;
            n /= 10;
            cnt++;

        }while(n > 0);

        n = nInicial;

        do {
            digito = n % 10;
            n /= 10;
            suma += Math.pow(digito, cnt);

        }while(n > 0);

        if (suma == nInicial)
            System.out.println("Es Armstrong");
        else
            System.out.println("No es Armstrong");
    }
}
