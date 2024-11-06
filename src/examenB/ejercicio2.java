package examenB;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int n;
        int cnt = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un nº: ");
            n = sc.nextInt();
        }while (n < 0);

        while (n / 10 != 0){
            n = n / 10;
            cnt++;
        }
        System.out.println("Tiene "+cnt+" dígitos");
    }
}
