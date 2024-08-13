package tabele;

import java.util.Scanner;

public class Odklon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextFloat();
        double x2 = sc.nextFloat();
        double x3 = sc.nextFloat();

        double vsota1 = x1+x2+x3;
        double pov = vsota1/3;

        double vsota2 =  Math.pow((pov - x1),2) + Math.pow((pov - x2),2) + Math.pow((pov - x3),2);
        double odk = Math.sqrt((vsota2)/3);

        System.out.printf("Povprecje: %.2f, Odklon: %.2f", pov, odk);
    }
}
