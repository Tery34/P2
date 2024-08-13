package objektno.vfunkcije;

public class Test {
    public static void main(String[] args) {
        Funkcija f1 = new Sinus();
        System.out.println(Orodja.izracunajNiclo(f1,2,10));
        Funkcija f2 = new Cosinus();
        System.out.println(Orodja.izracunajNiclo(f2,2,10));
    }
}
