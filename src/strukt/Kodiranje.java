package strukt;

public class Kodiranje {

    static String kodiraj(String niz){
        String zakodiran = "";
        for (int i = 0; i < niz.length(); i++) {
            char znak = (char) ('A' + (niz.charAt(i) - 'A' + 3) % 26);
            zakodiran += znak;
        }
        return zakodiran;
    }

    static String odkodiraj(String niz) {
        String odkodiran = "";
        for (int i = 0; i < niz.length(); i++) {
            char znak = (char) ('A' + (26 + niz.charAt(i) - 'A' - 3) %26);
            odkodiran += znak;
        }
        return odkodiran;
    }
}
