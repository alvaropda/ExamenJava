package examenA;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un nº: ");
        int n = sc.nextInt();
        int suma = 0;
        int nanterior = 0;
        boolean flag = true;

        while (n % 10 != 0 && flag){
            if (n / 10 > 0) {
                suma += n / 10;
                nanterior = n;
                n = n % 10;
            }
            else {
                suma += nanterior % 10;
                flag = false;
            }
        }
        System.out.print("la suma de los digitos es: " + suma);
    }
}
