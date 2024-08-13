package osnove;

public class Obresti {
    public static void main(String[] args){
        double n = 5;      //stevilo let
        double G = 1000;   //glavnica
        double p = 4;      //obrestna mera

        //racunanje obresti
        double stanje = G * Math.pow(1 + p / 100, n);

        // izpis rezultata
        System.out.println("Glavnica:            " + G);
        System.out.println("Stevilo let vezave:  " + n);
        System.out.println("Obrestna mera (v %): " + p);
        System.out.println("Stanje na racunu:    " + stanje);
    }
}
