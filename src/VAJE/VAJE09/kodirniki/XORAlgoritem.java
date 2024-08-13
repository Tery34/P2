package VAJE.VAJE09.kodirniki;

public class XORAlgoritem implements Kodirnik {
    private String geslo;
    private int indeks;

    public XORAlgoritem(String geslo) {
        this.geslo = geslo;
        this.indeks = 0;
    }

    @Override
    public int zakodiraj(int vrednost) {
        int zakodirano = vrednost ^ geslo.charAt(indeks);
        indeks = (indeks + 1) % geslo.length();
        return zakodirano;
    }

    @Override
    public int odkodiraj(int vrednost) {
        return zakodiraj(vrednost);
    }

    @Override
    public void ponastavi() {
        indeks = 0;
    }
}
