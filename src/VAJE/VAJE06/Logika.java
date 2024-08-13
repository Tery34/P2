package VAJE.VAJE06;

import java.util.Random;

public class Logika {
    private static int[][] polja;
    private static int tocke;
    private static boolean konec;

    public static void zacniNovoIgro(int velikost) {
        polja = new int[velikost][velikost];
        tocke = 0;
        konec = false;
        dodajNakljucnoPloscico();
        dodajNakljucnoPloscico();
    }

    private static void dodajNakljucnoPloscico() {
        Random rand = new Random();
        int vrednost = rand.nextDouble() < 0.9 ? 2 : 4;

        int i, j;
        do {
            i = rand.nextInt(polja.length);
            j = rand.nextInt(polja[0].length);
        } while (polja[i][j] != 0);

        polja[i][j] = vrednost;
    }

    public static int vrniPloscico(int i, int j) {
        return polja[i][j];
    }

    public static void koncajIgro() {
        if (!konec) {
            konec = true;
        } else {
            System.exit(0);
        }
    }

    public static boolean jeKonec() {
        return konec;
    }

    public static void naslednjaPoteza(int smer) {
        if (konec) return;

        switch (smer) {
            case 0:
                premakniLevo();
                break;
            case 1:
                rotiraj();
                rotiraj();
                premakniLevo();
                rotiraj();
                rotiraj();
                break;
            case 2:
                rotiraj();
                rotiraj();
                rotiraj();
                premakniLevo();
                rotiraj();
                break;
            case 3:
                rotiraj();
                premakniLevo();
                rotiraj();
                rotiraj();
                rotiraj();
                break;
        }
        dodajNakljucnoPloscico();
    }

    private static void premakniLevo() {
        // Premik in združevanje ploščic v levo
        for (int i = 0; i < polja.length; i++) {
            int[] novaVrstica = new int[polja.length];
            int indeks = 0;
            boolean zdruzil = false;

            for (int j = 0; j < polja[i].length; j++) {
                if (polja[i][j] != 0) {
                    if (indeks > 0 && novaVrstica[indeks - 1] == polja[i][j] && !zdruzil) {
                        novaVrstica[indeks - 1] *= 2;
                        tocke += novaVrstica[indeks - 1];
                        zdruzil = true;
                    } else {
                        novaVrstica[indeks++] = polja[i][j];
                        zdruzil = false;
                    }
                }
            }
            polja[i] = novaVrstica;
        }
    }

    public static boolean jeZmagal() {
        for (int[] vrstica : polja) {
            for (int vrednost : vrstica) {
                if (vrednost == 2048) return true;
            }
        }
        return false;
    }

    public static int vrniTocke() {
        return tocke;
    }

    private static void rotiraj() {
        int VELIKOST = polja.length;
        // najprej transponiramo tabelo - zamenjamo stolpce in vrstice
        for (int i = 0; i < VELIKOST; i++) {
            for (int j = i + 1; j < VELIKOST; j++) {
                int tmp = polja[i][j];
                polja[i][j] = polja[j][i];
                polja[j][i] = tmp;
            }
        }
        // če rotiramo v desno (v smeri urinega kazalca), obrnemo še vrstni red stolpcev
        for (int i = 0; i < VELIKOST; i++) {
            for (int j = 0; j < VELIKOST / 2; j++) {
                int tmp = polja[i][j];
                polja[i][j] = polja[i][VELIKOST - 1 - j];
                polja[i][VELIKOST - 1 - j] = tmp;
            }
        }
    }

}
