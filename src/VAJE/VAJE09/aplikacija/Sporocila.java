package VAJE.VAJE09.aplikacija;

import VAJE.VAJE09.kodirniki.Kodiranje;


import VAJE.VAJE09.kodirniki.XORAlgoritem;

public class Sporocila {
    public static void main(String[] args) {
        XORAlgoritem xorAlgoritem = new XORAlgoritem("geslo");
        Kodiranje kodiranje = new Kodiranje(xorAlgoritem);

        String originalnoBesedilo = "Pozdravljen svet!";
        String zakodiranoBesedilo = kodiranje.zakodiranjeBesedila(originalnoBesedilo);
        String odkodiranoBesedilo = kodiranje.odkodiranjeBesedila(zakodiranoBesedilo);

        System.out.println("Originalno besedilo: " + originalnoBesedilo);
        System.out.println("Zakodirano besedilo: " + zakodiranoBesedilo);
        System.out.println("Odkodirano besedilo: " + odkodiranoBesedilo);
    }
}
