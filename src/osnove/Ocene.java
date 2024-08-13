package osnove;

import java.util.Scanner;

public class Ocene {
    public static void main(String[] args) {
        int vsota = 0;
        int stevilo_ocen = 0;
        int ocena;
        double povprecje;

        Scanner sc = new Scanner(System.in);    //za user input System.in

       do{
            System.out.println("Vpiši oceno: ");
            ocena = sc.nextInt();

            if (ocena != 0) {
                vsota = vsota + ocena;
                stevilo_ocen++;
            }
       }
        while (ocena != 0);     //pogoj za izhod zanke
        if (stevilo_ocen != 0) {
            povprecje = ((double) vsota / stevilo_ocen);
            System.out.printf("Povprecje: %.2f \nVsota: %d \nStevilo ocen: %d",povprecje,vsota,stevilo_ocen);
        }
    }
}
