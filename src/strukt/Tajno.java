package strukt;

import java.util.Scanner;

public class Tajno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vpisi niz: ");
        String niz = sc.nextLine();

        String kodirano   = Kodiranje.kodiraj(niz);

        String odkodirano = Kodiranje.odkodiraj(kodirano);

        System.out.println("Originalni niz: " + niz);
        System.out.println("Kodiran niz:    " + kodirano);
        System.out.println("Odkodiran niz:  " + odkodirano);
    }
}
