package izzivi;

public class FCPlus {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Uporaba: java FCPlus spodnja_meja zgornja_meja korak");
            System.exit(1);
        }

        int f;    // vrednost v Fahrenheitih
        double c; // vrednost v Celzijah
        int spodnja_meja = 0;
        int zgornja_meja = 120;
        int korak = 10;

        if (args.length != 0){
            spodnja_meja = Integer.parseInt(args[0]);
            zgornja_meja = Integer.parseInt(args[1]);
            korak = Integer.parseInt(args[2]);
            }

        // izpis glave tabele
        System.out.printf("%6c | %6c\n", 'F', 'C');
        System.out.print("---------------------\n");

        // glavna zanka programa
        for(f = spodnja_meja; f <= zgornja_meja; f = f + korak) {
            c = (f - 32) / 1.8;

            // izpis posamezne vrstice tabele
            System.out.printf("%6d | %6.2f\n", f, c);
        }
    }
}

