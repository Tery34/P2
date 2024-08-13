package osnove;
import java.util.Scanner;

public class StatistikaNiza {
    public static void main(String[] args){

        statistikaNiza("Danes je lep dan!");
        statistikaNiza("Js se pa ucim javo :)");

    }
    static void statistikaNiza(String niz){
        String revNiz = "";
        for( int i = 0; i < niz.length(); i++){ //loop za reverse
            char znak = niz.charAt(i);
            revNiz = znak + revNiz;
        }
        System.out.println("Vpisani niz:     " + niz);
        System.out.println("Prva   crka:     " + niz.charAt(0));
        System.out.println("Zadnja crka:     " + niz.charAt(niz.length() - 1));
        System.out.println("Brez presledkov: " + niz.replaceAll("\\s+",""));
        System.out.println("Stevilo besed:   " + niz.split("\\s+").length);
        System.out.println("Celotna dolzina: " + niz.length());
        System.out.println("Obrnjen niz:     " + revNiz);
    }
}
