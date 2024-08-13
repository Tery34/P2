package objektno.vfunkcije;

public class Orodja {
    static double izracunajNiclo(Funkcija f, double x0, int N) {
        int stevilo_korakov = 0;
        while (stevilo_korakov < N) {
            stevilo_korakov++;
            double x1 = x0 - f.vrednost(x0) / f.odvod(x0);
            x0 = x1;
        }
        return x0;
    }
}
