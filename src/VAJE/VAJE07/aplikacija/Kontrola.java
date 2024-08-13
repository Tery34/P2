package VAJE.VAJE07.aplikacija;

import VAJE.VAJE07.vinjete.SeznamVinjet;

public class Kontrola {
    public static void main(String[] args) {
        SeznamVinjet seznamVinjete = new SeznamVinjet();


        if (seznamVinjete.preberiPodatke("Viri/vinjete.txt")) {
            System.out.println("Podatki so uspešno prebrani.");
        } else {
            System.out.println("Napaka pri branju podatkov.");
        }

        seznamVinjete.izpisiVinjete();

        String registrska = "LJ750LV";
        if (seznamVinjete.preveriVinjeto(registrska)) {
            System.out.println("Vozilo z registrsko oznako " + registrska + " ima veljavno vinjeto.");
        } else {
            System.out.println("Vozilo z registrsko oznako " + registrska + " nima veljavne vinjete.");
        }

        seznamVinjete.izpisiVinjete("tedenska");
    }
}
