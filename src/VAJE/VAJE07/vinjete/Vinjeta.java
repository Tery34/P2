package VAJE.VAJE07.vinjete;

public class Vinjeta {
    private String registrskaOznaka;
    private String vinjetniRazred;
    private String datumZacetkaVeljavnosti;
    private String vrstaVinjete;

    public Vinjeta(String registrskaOznaka, String vinjetniRazred, String datumZacetkaVeljavnosti, String vrstaVinjete) {
        this.registrskaOznaka = registrskaOznaka;
        this.vinjetniRazred = vinjetniRazred;
        this.datumZacetkaVeljavnosti = datumZacetkaVeljavnosti;
        this.vrstaVinjete = vrstaVinjete;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]: %s (%s)", registrskaOznaka, vinjetniRazred, vrstaVinjete, datumZacetkaVeljavnosti);
    }

    public String getRegistrskaOznaka() {
        return registrskaOznaka;
    }

    public String getVrstaVinjete() {
        return vrstaVinjete;
    }
}