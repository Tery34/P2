package VAJE.VAJE08.aplikacija;

import VAJE.VAJE08.banka.Banka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Upravljanje {

    // Iz podane datoteke prebere podatke o računih in ustvari račune v podani banki.
    private static void dodajRacune(String vir, Banka banka) throws FileNotFoundException {
        Scanner vhod = new Scanner(new File(vir));
        while (vhod.hasNextLine()) {
            String[] podatki = vhod.nextLine().split(";");
            if (podatki[0].equalsIgnoreCase("tekoci")) { // ustvari tekoči račun
                banka.dodajTekociRacun(podatki[1], Double.parseDouble(podatki[2]));
            } else { // ustvari varčevalni račun
                banka.dodajVarcevalniRacun(podatki[1], Double.parseDouble(podatki[2]));
            }
            banka.polog(podatki[1], Double.parseDouble(podatki[3]));
        }
        vhod.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        // ustvarimo novo banko
        Banka bankaFRI = new Banka();

        // v banki naredimo račune z določenimi stanji, vse podatke preberemo iz datoteke
        dodajRacune("Viri/racuni.txt", bankaFRI);

        //izpiši vse račune
        System.out.println("Izpis vseh računov:");
        bankaFRI.izpisiRacune();

        //izpiši vse tekoče račune
        System.out.println("\nIzpis vseh tekočih računov:");
        bankaFRI.izpisiRacune(false);

        String stevilkaRacuna = "SI56 1234 4321 1234 126"; // tekoči z limitom 100 €
        // String stevilkaRacuna = "SI56 7823 4563 8346 123"; // varčevalni z 0,1% obrestmi

        //položi znesek na račun in preveri novo stanje z izpisom računov
        System.out.println("\nPolog 500 EUR na račun " + stevilkaRacuna + ":");
        bankaFRI.polog(stevilkaRacuna, 500);
        bankaFRI.izpisiRacune();

        //dvigni znesek z računa in preveri novo stanje z izpisom računov
        System.out.println("\nDvig 200 EUR z računa " + stevilkaRacuna + ":");
        bankaFRI.dvig(stevilkaRacuna, 200);
        bankaFRI.izpisiRacune();

        //preveri še ostale metode banke
        System.out.println("\nDodajanje obresti vsem varčevalnim računom:");
        bankaFRI.dodajObresti();
        bankaFRI.izpisiRacune(true);
    }
}
