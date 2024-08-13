package razno;

import java.util.Random;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vpiši niz: ");
        String niz = sc.nextLine();
        char crke[] = niz.toCharArray();
        int stZamenjav = rnd.nextInt(100);

        for (int i = 0; i < stZamenjav; i++){
            crke[rnd.nextInt(crke.length)] = crke [rnd.nextInt(crke.length)];
        }
        System.out.print("Kodiran niz: " + crke);
    }
}
