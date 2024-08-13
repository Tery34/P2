package strukt;

import java.util.Scanner;

public class SwitchOcena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vpisi oceno: ");
        int ocena = sc.nextInt();
        System.out.println(opisOcene(ocena));
    }
    static String opisOcene(int ocena){
        String opis;
        switch (ocena){
            case 6  : opis = "Slabo";      break;
            case 7  : opis = "Zadostno";   break;
            case 8  : opis = "Dobro";      break;
            case 9  : opis = "Prav dobro"; break;
            case 10 : opis = "Odlično";    break;
            default : opis = "Ni ocene";
        }
        return opis;
    }

}
