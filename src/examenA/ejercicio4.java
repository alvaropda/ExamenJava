package examenA;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un nº: ");
        int n = sc.nextInt();
        int caja = n;
        int caja2 = n;
        int cnt = 1;
        int suma = 0;

        while (n / 10 != 0){
            cnt++;
            n = n % 10;
        }

        n = caja;
        caja = caja2;

        while (caja / 10 != 0){
            caja = n % 10;
            n = n / 10;
            suma += Math.pow(caja,cnt);
        }

        suma += Math.pow(caja, cnt);

        if (caja2 == suma)
            System.out.println("es");
        else
            System.out.println("No es");
    }
}
