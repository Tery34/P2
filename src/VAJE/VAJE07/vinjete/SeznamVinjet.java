package VAJE.VAJE07.vinjete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeznamVinjet {
    private List<Vinjeta> prodaneVinjete;

    public SeznamVinjet() {
        this.prodaneVinjete = new ArrayList<>();
    }

    public boolean preberiPodatke(String vir) {
        try (BufferedReader br = new BufferedReader(new FileReader(vir))) {
            int stVinjete = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < stVinjete; i++) {
                String vrstica = br.readLine();
                if (vrstica == null) {
                    return false;
                }
                String[] podatki = vrstica.split(";");
                if (podatki.length != 4) {
                    return false;
                }
                Vinjeta vinjeta = new Vinjeta(podatki[0], podatki[1], podatki[2], podatki[3]);
                prodaneVinjete.add(vinjeta);
            }

            return prodaneVinjete.size() == stVinjete;
        } catch (IOException | NumberFormatException e) {
            return false;
        }
    }

    public void izpisiVinjete() {
        System.out.println("V sistemu so zabeležene prodane vinjete (" + prodaneVinjete.size() + "):");
        for (Vinjeta vinjeta : prodaneVinjete) {
            System.out.println(vinjeta);
        }
    }

    public boolean preveriVinjeto(String registrska) {
        for (Vinjeta vinjeta : prodaneVinjete) {
            if (vinjeta.getRegistrskaOznaka().equalsIgnoreCase(registrska)) {
                return true;
            }
        }
        return false;
    }

    public void izpisiVinjete(String vrsta) {
        List<Vinjeta> ustrezneVinjete = new ArrayList<>();
        for (Vinjeta vinjeta : prodaneVinjete) {
            if (vinjeta.getVrstaVinjete().equalsIgnoreCase(vrsta)) {
                ustrezneVinjete.add(vinjeta);
            }
        }

        if (ustrezneVinjete.isEmpty()) {
            System.out.println("Nobena vinjeta ni podane vrste.");
        } else {
            System.out.println("V sistemu je " + vrsta + " vinjeta za naslednja vozila:");
            for (Vinjeta vinjeta : ustrezneVinjete) {
                System.out.println(vinjeta);
            }
            System.out.println("Skupaj " + vrsta + " vinjeta: " + ustrezneVinjete.size());
        }
    }
}
