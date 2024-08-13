package objektno;

public class Drevo {
    private static int ID = 0;
    private String ime;
    private int starost;
    private double visina;
    int mojID;

    public Drevo(){
        mojID = ID++;
        this.setIme("");
        this.setStarost(0);
        this.setVisina(0);

    }
    public Drevo(String ime){
        mojID = ID++;
        this.ime = ime;
    }

    void pomlad(){
        setStarost(getStarost() + 1);
        povecajVisino();
    }
    void povecajVisino(){
        if (getStarost() < 4){
            setVisina(getVisina() + 1);
        }
        else{
            setVisina(getVisina() + 0.2);
        }
    }
    void izrisiDrevo() {
        System.out.println();
        for(int i = 0; i < getVisina(); i++){
            if (i < getVisina() /2){
                System.out.print("***");
            }else{
                System.out.print(" *");
            }
            System.out.println();
        }

    }
    double povprecnaRast(){
        if (getStarost() == 0)
            return 0;
        else
            return getVisina() / getStarost();
    }

    static void navodilaZaObrezovanje(){
        System.out.println("Drevo obrezujemo 2x letno spomladi in jeseni.");
    }
    void setIme(String ime){
        this.ime = ime;
    }
    String getIme(){
        return ime;
    }
    static int steviloDreves(){
        return ID;
    }

    public static void main(String[] args) {
        Drevo d1 = new Drevo();
        d1.setIme("Hrast");
        d1.setStarost(9);
        d1.izrisiDrevo();

    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
        if (starost < 4)
            setVisina(starost);
        else
            setVisina(3 + (starost - 3 ) * 0.2);
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
    public String toString() {
        return String.format("Sem drevo '%s', moj ID je %d", ime, mojID);
    }
}

