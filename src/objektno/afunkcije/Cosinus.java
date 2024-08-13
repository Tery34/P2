package objektno.afunkcije;

public class Cosinus extends Funkcija{
    @Override
    double vrednost(double x) {
        return Math.cos(x);
    }

    @Override
    double odvod(double x) {
        return -Math.sin(x);
    }
}
