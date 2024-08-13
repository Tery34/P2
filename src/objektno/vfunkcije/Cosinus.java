package objektno.vfunkcije;

public class Cosinus implements Funkcija {


    public double vrednost(double x) {
        return Math.cos(x);
    }


    public double odvod(double x) {
        return -Math.sin(x);
    }
}
