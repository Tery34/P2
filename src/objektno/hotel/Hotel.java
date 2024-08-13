package objektno.hotel;

public class Hotel implements OsnovneZahteve{
    private String imeHotela;
    private String knjigaGostov[];
    Hotel(String imeHotela, int steviloSob) {
        this.setImeHotela(imeHotela);
        this.knjigaGostov = new String[steviloSob];
    }
    static double cenaNocitve = 20;

    static void setCenaNocitve(double Cena) {
        Hotel.cenaNocitve = Cena;
    }
    static double zasluzek(int n) {
        return n * cenaNocitve;
    }
    public int trenutnaZasedenost() {
        int n = 0;
        for (int i = 0; i < knjigaGostov.length; i++) {
            if (knjigaGostov[i] != null) n++;
        }
        return n;
    }
    public boolean registracija(String ime, int soba) {
        if (knjigaGostov[soba] != null)
            return false;

        knjigaGostov[soba] = ime;
        return true;
    }

    @Override
    public String odjava(int soba) {
        String imeObiskovalca = knjigaGostov[soba];
        knjigaGostov[soba] = null;
        return imeObiskovalca;
    }

    @Override
    public double promet() {
        return zasluzek(trenutnaZasedenost());
    }
    public String toString() {
        return String.format("Pozdravljeni v hotelu %s. Trenutna zasedenost: %d", this.getImeHotela(), this.trenutnaZasedenost()
        );
    }

    public String getImeHotela() {
        return imeHotela;
    }

    public void setImeHotela(String imeHotela) {
        this.imeHotela = imeHotela;
    }
}
