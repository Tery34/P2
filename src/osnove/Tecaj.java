package osnove;

import java.io.File;
import java.util.Scanner;

public class Tecaj {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("viri/CHF2011.txt"));

        // najmanjsi in najvecji tecaj
        double minTecaj, maxTecaj;
        // datum najmanjsega in najvecjega tecaja
        String minTecajDatum, maxTecajDatum;

        String datum = sc.next();
        sc.next();
        double tecaj = sc.nextDouble();

        minTecaj = tecaj; minTecajDatum = datum;
        maxTecaj = tecaj; maxTecajDatum = datum;

        while (sc.hasNext()) {

            datum = sc.next();
            sc.next();
            tecaj = sc.nextDouble();

            if (tecaj < minTecaj) {
                minTecaj = tecaj;
                minTecajDatum = datum;
            }

            if (tecaj > maxTecaj) {
                maxTecaj = tecaj;
                maxTecajDatum = datum;
            }
        }
        sc.close();

        System.out.printf("MIN tecaj: %.4f (datum: %s) \n",
                minTecaj, minTecajDatum);
        System.out.printf("MAX tecaj: %.4f (datum: %s)\n",
                maxTecaj, maxTecajDatum);
    }
}