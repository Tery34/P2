package VAJE.VAJE09.kodirniki;

public class CezarjevAlgoritem implements Kodirnik {
    private int zamik;

    public CezarjevAlgoritem(int zamik) {
        this.zamik = zamik;
    }

    @Override
    public int zakodiraj(int vrednost) {
        return vrednost + zamik;
    }

    @Override
    public int odkodiraj(int vrednost) {
        return vrednost - zamik;
    }

    @Override
    public void ponastavi() {
        // Ni potrebno izvajati nobenih operacij
    }
}
