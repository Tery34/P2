package VAJE.VAJE05.zbirke;

import VAJE.VAJE05.izpis.Znaki;

public class Seznam{
    private static String[] seznam;
    private static int dolzina = 0;

    public static boolean narediSeznam(int n){
        if (seznam != null || n <= 0) {
            return false;
        }
        seznam = new String[n];
        dolzina = 0;
        return true;
    }

    public static boolean dodajNaKonecSeznama(String element){
        if(seznam == null || dolzina > seznam.length-1){
            return false;
        }
        seznam[dolzina++] = element;
        return true;
    }
    private static void izpisSeznamaNacin(boolean velikIzpis) {
        if (seznam == null) {
            System.out.println("NAPAKA: Seznam ne obstaja.");
            return;
        }
        if (dolzina < 1) {
            System.out.println("Seznam je prazen (nima elementov).");
            return;
        }
        System.out.println("Na seznamu so naslednji elementi:");
        for (int i = 0; i < dolzina; i++) {
            String vrstica = String.format("%d: %s", i + 1, seznam[i]);
            if (velikIzpis) {
                Znaki.izpisi64bit(vrstica);
                System.out.println();
            } else {
                System.out.println(vrstica);
            }
        }
    }
    public static void izpisiSeznam() {
        izpisSeznamaNacin(false);
    }
    public static void izpisiSeznam64Bit() {
        izpisSeznamaNacin(true);
    }
    public static String odstraniIzSeznama(int mesto){
        if (seznam == null || mesto < 1 || mesto > dolzina) {
            return null;
        }
        String element = seznam[mesto - 1];
        for (int i = mesto; i < dolzina; i++) {
            seznam[i - 1] = seznam[i];
        }
        seznam[--dolzina] = null;
        return element;
    }
    public static boolean dodajVSeznam(String element, int mesto){
        if (seznam == null || dolzina >= seznam.length || mesto < 1){
            return false;
        }
        if (mesto > dolzina){
            return dodajNaKonecSeznama(element);
        }
        for (int i = dolzina; i > mesto - 1; i--) {
            seznam[i] = seznam[i - 1];
        }
        seznam[mesto - 1] = element;
        dolzina++;
        return true;
    }
    public static int dolzinaSeznama() {
        if (seznam == null){
            return -1;
        }
        return dolzina;
    }
    public static boolean uniciSeznam() {
        if (seznam == null) {
            return false;
        }
        seznam = null;
        dolzina = 0;
        return true;
    }
}

