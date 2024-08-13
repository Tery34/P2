package fis;

public class Drzava {
    private String kratica;
    private String glMesto;
    private int prebivalci;

    public Drzava(String kratica, String glMesto, int prebivalci) {
        this.kratica = kratica;
        this.glMesto = glMesto;
        this.prebivalci = prebivalci;
    }

    public String toString(){
        return "Drzava: " + getKratica() + ", Glavno mesto: " + getGlMesto() + ", Stevilo prebivalcev: " + getPrebivalci();
    }

    public String getKratica() {
        return kratica;
    }

    public String getGlMesto() {
        return glMesto;
    }

    public int getPrebivalci() {
        return prebivalci;
    }
}
