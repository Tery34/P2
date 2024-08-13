package DN;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DN09 {
    public static void main(String[] args) {
        switch (args[0]){
            case "izpisiTekmovanje" :
                Tekmovanje t = Tekmovanje.izDatotek(args[1], args[2]);
                t.izpisiTekmovalce();
                System.out.println();
                t.izpisiGlasove();
                break;
            case "izpisiTocke" :
                Tekmovanje t1 = Tekmovanje.izDatotek(args[1], args[2]);
                t1.izpisiTocke();
                break;
        }
}
        /*
    public static void izpisiTekmovanje(String dTekmovalci, String dGlsovi){
        Tekmovanje t = Tekmovanje.izDatotek(dTekmovalci, dGlsovi);
        t.izpisiTekmovalce();
        System.out.println();
        t.izpisiGlasove();
    }

         */
}
class Tekmovalec{
    private String drzava;
    private String izvajalec;
    private String naslovPesmi;
    public Tekmovalec(String drzava, String izvajalec, String naslovPesmi){
        this.drzava = drzava;
        this.izvajalec = izvajalec;
        this.naslovPesmi = naslovPesmi;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getIzvajalec() {
        return izvajalec;
    }

    public void setIzvajalec(String izvajalec) {
        this.izvajalec = izvajalec;
    }

    public String getNaslovPesmi() {
        return naslovPesmi;
    }

    public void setNaslovPesmi(String naslovPesmi) {
        this.naslovPesmi = naslovPesmi;
    }
    public String toString(){
        return String.format("(%s) %s - %s", this.getDrzava(), this.getIzvajalec(), this.getNaslovPesmi());
    }
}
class Glas{
    private String odDrzave;
    private String zaDrzavo;
    private int stTock;
    public Glas(String odDrzave, String zaDrzavo, int stTock){
        this.setOdDrzave(odDrzave);
        this.setZaDrzavo(zaDrzavo);
        this.setStTock(stTock);
    }

    public String getOdDrzave() {
        return odDrzave;
    }

    public void setOdDrzave(String odDrzave) {
        this.odDrzave = odDrzave;
    }

    public String getZaDrzavo() {
        return zaDrzavo;
    }

    public void setZaDrzavo(String zaDrzavo) {
        this.zaDrzavo = zaDrzavo;
    }

    public int getStTock() {
        return stTock;
    }

    public void setStTock(int stTock) {
        this.stTock = stTock;
    }
    public String toString(){
        return String.format("%s --%dt-> %s", getOdDrzave(), getStTock(), getZaDrzavo());
    }
}
class Tekmovanje{
    private ArrayList<Tekmovalec> seznamTekmovalcev;
    private ArrayList<Glas> seznamGlasov;
    private Kriterij kriterij;
    private HashMap<Tekmovalec, Integer> tocke = null;
    public Tekmovanje(ArrayList<Tekmovalec> seznamTekmovalcev, ArrayList<Glas> seznamGlasov){
        this();
        this.seznamTekmovalcev = seznamTekmovalcev;
        this.seznamGlasov = seznamGlasov;
    }
    public Tekmovanje(){
        this.kriterij = new OsnovniKriterij();
    }
    public static Tekmovanje izDatotek(String datotekaTekmovalci, String datotekaGlasovi){
        ArrayList<Tekmovalec> seznamTekmovalcev = new ArrayList<>();
        ArrayList<Glas> seznamGlasov = new ArrayList<>();
        try{
            Scanner scT = new Scanner(new File(datotekaTekmovalci));
            scT.nextLine();
            while(scT.hasNextLine()){
                String[] podatki = scT.nextLine().split(";");
                seznamTekmovalcev.add(new Tekmovalec(podatki[1], podatki[2], podatki[3]));
            }
            scT.close();
            Scanner scG = new Scanner(new File(datotekaGlasovi));
            scG.nextLine();
            while (scG.hasNextLine()){
                String[] podatki = scG.nextLine().split(";");
                seznamGlasov.add(new Glas(podatki[2], podatki[3], Integer.parseInt(podatki[4])));
            }
            return new Tekmovanje(seznamTekmovalcev, seznamGlasov);
        }catch (FileNotFoundException e){
            return null;
        }
    }
    public ArrayList<Tekmovalec> getSeznamTekmovalcev() {
        return seznamTekmovalcev;
    }
    public ArrayList<Glas> getSeznamGlasov() {
        return seznamGlasov;
    }
    public void setKriterij(Kriterij kriterij) {
        this.kriterij = kriterij;
        this.tocke = null;
    }
    public void izpisiTekmovalce(){
        if (seznamTekmovalcev.isEmpty()){
            System.out.println("Seznam tekmovalcev je prazen.");
            return;
        }
        System.out.println("Seznam tekmovalcev:");
        for (Tekmovalec t : seznamTekmovalcev){
            System.out.println(t);
        }
    }
    public void izpisiGlasove(){
        if (seznamGlasov.isEmpty()){
            System.out.print("Seznam glasov je prazen.");
            return;
        }
        System.out.println("Seznam glasov:");
        for (Glas g : seznamGlasov){
            System.out.println(g);
        }
    }
    public void izpisiTocke(){
        if (seznamTekmovalcev.isEmpty()){
            System.out.println("Seznam tekmovalcev je prazen.");
            return;
        }
        System.out.println("Seznam tekmovalcev in njihovih tock:");
        for (Tekmovalec t : seznamTekmovalcev){
            System.out.printf("%s: %dt\n", t, kriterij.steviloTock(this, t.getDrzava()));
        }
    }
    public int steviloTock(String drzava) {
        if (tocke == null){
            izracunajTocke();
        }
        for (Tekmovalec t : seznamTekmovalcev){
            if (t.getDrzava().equals(drzava)){
                return tocke.get(t);
            }
        }
        return 0;
    }
    private void izracunajTocke(){
        tocke = new HashMap<>();
        for (Tekmovalec t : seznamTekmovalcev){
            tocke.put(t, kriterij.steviloTock(this, t.getDrzava()));
        }
    }

}
interface Kriterij{
     public int steviloTock(Tekmovanje tekmovanje, String drzava);
}
class OsnovniKriterij implements Kriterij {

    @Override
    public int steviloTock(Tekmovanje tekmovanje, String drzava) {
        int vsota = 0;
        for( Glas g : tekmovanje.getSeznamGlasov()){
            if(g.getZaDrzavo().equals(drzava)){
                vsota += g.getStTock();
            }
        }
        return vsota;
    }
}
