package VAJE.VAJE08.banka;

public class TekociRacun extends Racun {
    private double limit;

    public TekociRacun(String stevilka, double limit) {
        super(stevilka);
        this.limit = limit;
    }

    @Override
    public boolean dvig(double znesek) {
        if (znesek > 0 && znesek <= limit) {
            return super.dvig(znesek);
        }
        return false;
    }

    @Override
    public String opisRacuna() {
        return "tekoči, limit: " + String.format("%.2f", limit) + " EUR";
    }
}
