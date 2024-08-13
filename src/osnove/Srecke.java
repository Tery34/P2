package osnove;

public class Srecke {
    public static void main (String[] args){

        int srecke = 10;
        double cena = 1.25;
        System.out.println("Stevilo sreck | Cena (EUR)");
        System.out.println("--------------------------");
        for (int i = 1; i <= srecke; i++){
            System.out.printf("%5d         |%6.2f\n", i, cena*i);
        }

    }
}
