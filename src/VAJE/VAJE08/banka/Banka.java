package VAJE.VAJE08.banka;

public class Banka {
    private Racun[] racuni;
    private int steviloRacunov;

    public Banka() {
        this.racuni = new Racun[500];
        this.steviloRacunov = 0;
    }

    public boolean dodajTekociRacun(String stevilka, double limit) {
        if (najdiRacun(stevilka) != null) {
            return false;
        }
        racuni[steviloRacunov++] = new TekociRacun(stevilka, limit);
        return true;
    }

    public boolean dodajVarcevalniRacun(String stevilka, double obresti) {
        if (najdiRacun(stevilka) != null) {
            return false;
        }
        racuni[steviloRacunov++] = new VarcevalniRacun(stevilka, obresti);
        return true;
    }

    public void izpisiRacune() {
        izpisiRacune(false);
        izpisiRacune(true);
    }

    public void izpisiRacune(boolean varcevalni) {
        int stevec = 0;
        for (int i = 0; i < steviloRacunov; i++) {
            if (varcevalni && racuni[i] instanceof VarcevalniRacun) {
                System.out.println(racuni[i]);
                stevec++;
            } else if (!varcevalni && racuni[i] instanceof TekociRacun) {
                System.out.println(racuni[i]);
                stevec++;
            }
        }
        System.out.println("Število izpisanih računov: " + stevec);
    }

    public boolean dvig(String stevilka, double znesek) {
        Racun racun = najdiRacun(stevilka);
        if (racun != null) {
            return racun.dvig(znesek);
        }
        return false;
    }

    public boolean polog(String stevilka, double znesek) {
        Racun racun = najdiRacun(stevilka);
        if (racun != null) {
            return racun.polog(znesek);
        }
        return false;
    }

    public void dodajObresti() {
        for (int i = 0; i < steviloRacunov; i++) {
            if (racuni[i] instanceof VarcevalniRacun) {
                ((VarcevalniRacun) racuni[i]).dodajObresti();
            }
        }
    }

    private Racun najdiRacun(String stevilka) {
        for (int i = 0; i < steviloRacunov; i++) {
            if (racuni[i].stevilka.equals(stevilka)) {
                return racuni[i];
            }
        }
        return null;
    }
}
