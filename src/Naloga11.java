public class Naloga11 {

    // Prva metoda jePalindrom, ki uporablja iterativni pristop
    public static boolean jePalindrom(String niz) {
        int dolzina = niz.length();
        for (int i = 0; i < dolzina / 2; i++) {
            if (niz.charAt(i) != niz.charAt(dolzina - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Druga metoda jePalindromR, ki uporablja rekurzivni pristop
    public boolean jePalindromR(String niz) {
        // Bazni primer: če je niz prazen ali enoznačen, je palindrom
        if (niz.length() <= 1) {
            return true;
        }
        // Preverimo prvi in zadnji znak, nato rekurzivno preverimo preostali del niza
        if (niz.charAt(0) == niz.charAt(niz.length() - 1)) {
            return jePalindromR(niz.substring(1, niz.length() - 1));
        } else {
            return false;
        }
    }

    // Main metoda
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Prosim, podajte niz kot argument programa.");
            return;
        }

        String niz = args[0];

        // Klic prve metode
        boolean iterativniRezultat = jePalindrom(niz);
        // Klic druge metode (rekurzivne)
        Naloga11 naloga = new Naloga11();
        boolean rekurzivniRezultat = naloga.jePalindromR(niz);

        // Izpis rezultatov
        System.out.println(iterativniRezultat ? "da" : "ne");
        System.out.println(rekurzivniRezultat ? "da" : "ne");
    }
}
