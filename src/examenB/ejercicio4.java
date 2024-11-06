package examenB;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int n;
        int conten = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime un numero: ");
            n = sc.nextInt();
        }while(n < 0);

        while (n / 10 != 0){
            conten = n % 10;
            n = n / 10;
            System.out.print(conten);
        }
        conten = n % 10;
        System.out.print(conten+" Es el nº invertido");
    }
}
