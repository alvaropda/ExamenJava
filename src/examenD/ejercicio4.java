package examenD;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingresa el primer número:");
            num1 = scanner.nextInt();
            System.out.println("Ingresa el segundo número:");
            num2 = scanner.nextInt();
        }while (num1 < 0 || num2 < 0);

        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int mcd = num1;
        System.out.println("El máximo común divisor es: " + mcd);
    }
}
