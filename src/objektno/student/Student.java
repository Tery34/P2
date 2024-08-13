package objektno.student;

public class Student {
    private static final int MAX_OCEN = 10;
    private String ime;
    private int ID;
    public int steviloOcen;
    public int[] ocene;
    String status;
    public Student(String ime, int ID){
        this.ocene = new int[MAX_OCEN];
        this.steviloOcen = 0;
        this.setIme(ime);
        this.setID(ID);

    }
    public void dodajOceno(int ocena){
        if ((ocena != 0) && steviloOcen < MAX_OCEN){
            ocene[steviloOcen++] = ocena;
            if (povprecje() > 9)
                status = "Odlicen";
            else
                status = "Dober";
        }

    }

    public String getstatus(){
        return status;
    }
    private double povprecje(){
        if (steviloOcen == 0) return 0;
        int vsota = 0;
        for (int ocena : ocene) {
            vsota += ocena;
        }
        return (double) vsota /steviloOcen;
    }
    public String toString() {
        return String.format("Ime: %s,  ID: %d, Status: %s", ime, ID, status);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
