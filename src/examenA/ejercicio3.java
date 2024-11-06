package examenA;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("dime un nº: ");
        int n = sc.nextInt();
        int suma = 0;
        int nanterior = 0;
        boolean flag = true;

        if (n >= 0 || n < 10) {

            switch (n) {
                case 0 -> suma = 0;
                case 1 -> suma = 1;
                case 2 -> suma = 2;
                case 3 -> suma = 3;
                case 4 -> suma = 4;
                case 5 -> suma = 5;
                case 6 -> suma = 6;
                case 7 -> suma = 7;
                case 8 -> suma = 8;
                case 9 -> suma = 9;

            }
        }

        while (n % 10 != 0 && flag){
            if (n / 10 > 0) {
                suma += n % 10;
                nanterior = n;
                n = n / 10;
            }
            else {
                suma += nanterior % 10;
                flag = false;
            }
        }
        System.out.print("la suma de los digitos es: " + suma);
    }
}
