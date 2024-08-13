package objektno.afunkcije;

public abstract class Funkcija {
    abstract double vrednost(double x);
    abstract double odvod(double x);
    double izracunajNiclo(double x0, int N) {
        int stevilo_korakov = 0;
        while (stevilo_korakov < N) {
            stevilo_korakov++;
            double x1 = x0 - vrednost(x0) / odvod(x0);
            x0 = x1;
        }
        return x0;
    }
}


