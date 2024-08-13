package VAJE.VAJE08.banka;

public class VarcevalniRacun extends Racun {
    private double obresti;

    public VarcevalniRacun(String stevilka, double obresti) {
        super(stevilka);
        this.obresti = obresti;
    }

    public void dodajObresti() {
        stanje += stanje * obresti;
    }

    @Override
    public String opisRacuna() {
        return "varčevalni, obrestna mera: " + String.format("%.2f", obresti * 100) + "%";
    }
}
