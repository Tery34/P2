package tabele;

import java.util.Scanner;

public class Odklon2 {
    public static void main(String[] args) {
        double[] x = new double[50];
        double vsota1, vsota2, pov, odk;

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int n;
        double tx;
        while (i < 50){
            System.out.printf("Vpisi %d. stevilo: ", i + 1);
            tx = sc.nextDouble();

            if (tx != 0)
                x[i++] = tx;
            else
                break;
        }

        n = i;

        if (n== 0) {
            System.out.println("Vpisali niste nobenega stevila.");
            System.exit(0);
        }

        vsota1 = 0;
        for (i = 0; i < n; i++){
            vsota1 += x[i];
        }
        pov = vsota1 / n;

        vsota2 = 0;
        for(i = 0; i < n; i++){
            vsota2 += Math.pow((pov - x[i]), 2);
        }
        odk = Math.sqrt(vsota2 / n);

        System.out.printf("Povprecje: %.2f, Odklon: %.2f", pov, odk);
    }
}
