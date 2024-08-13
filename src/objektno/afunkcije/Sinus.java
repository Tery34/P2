package objektno.afunkcije;

public class Sinus extends Funkcija{


    double vrednost(double x) {
        return Math.sin(x);
    }


    double odvod(double x) {
        return Math.cos(x);
    }
}
