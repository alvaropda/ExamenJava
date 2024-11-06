package examenC;

public class ejercicio4 {
    public static void main(String[] args) {

        int anteriorP = 3;
        boolean Primo = true;

        for (int i=5; i<100; i+=2) {

            Primo = true;

            for (int j=2; j<=i-1; j++) {
                if (i%j==0) {
                    Primo = false;
                }
            }

            if (Primo) {
                if (i-anteriorP==2) {
                    System.out.printf("(%d, %d)\n", anteriorP, i);
                }

                anteriorP = i;
            }
        }
    }
}