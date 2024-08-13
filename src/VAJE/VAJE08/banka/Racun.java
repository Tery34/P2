package VAJE.VAJE08.banka;

public abstract class Racun {
    protected String stevilka;
    protected double stanje;

    public Racun(String stevilka) {
        this.stevilka = stevilka;
        this.stanje = 0.0;
    }

    public boolean polog(double znesek) {
        if (znesek > 0) {
            stanje += znesek;
            return true;
        }
        return false;
    }

    public boolean dvig(double znesek) {
        if (znesek > 0) {
            stanje -= znesek;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Račun " + stevilka + " (" + opisRacuna() + "): " + String.format("%.2f", stanje) + " EUR";
    }

    public abstract String opisRacuna();
}
