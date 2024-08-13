package VAJE.VAJE09.kodirniki;

public class Kodiranje {
    private Kodirnik kodirnik;

    public Kodiranje(Kodirnik kodirnik) {
        this.kodirnik = kodirnik;
    }

    public String zakodiranjeBesedila(String besedilo) {
        kodirnik.ponastavi();
        StringBuilder zakodiranoBesedilo = new StringBuilder();
        for (char znak : besedilo.toCharArray()) {
            zakodiranoBesedilo.append((char) kodirnik.zakodiraj((int) znak));
        }
        return zakodiranoBesedilo.toString();
    }

    public String odkodiranjeBesedila(String besedilo) {
        kodirnik.ponastavi();
        StringBuilder odkodiranoBesedilo = new StringBuilder();
        for (char znak : besedilo.toCharArray()) {
            odkodiranoBesedilo.append((char) kodirnik.odkodiraj((int) znak));
        }
        return odkodiranoBesedilo.toString();
    }
}
