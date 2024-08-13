package objektno;

public class Bonsai extends Drevo{
    private int sirina;
    void povecajVisino() {
        if (getStarost() < 3)
            setVisina(getVisina() + 0.05);
    }

    void izrisiSe() {
        System.out.println("Jaz␣sem␣BONSAIIII");
        System.out.println(".");
    }

    public int getSirina() {
        return sirina;
    }

    public void setSirina(int sirina) {
        this.sirina = sirina;
    }
    void pomlad(){
        super.pomlad();
        sirina += 2;
    }
    void strizenje(){
        if (sirina > 1)
            sirina--;
    }

}

