package objektno.vfunkcije;

public class Sinus implements Funkcija{

    public double vrednost(double x) {
        return Math.sin(x);
    }

    public double odvod(double x) {
        return Math.cos(x);
    }
}
