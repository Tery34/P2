
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DN05 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uporaba: java DN05 [ukaz] [vhodne datoteke]");
            System.exit(1);
        }
        int[][] slika = preberiSliko(args[1]);
        if (slika == null) {
            System.exit(1);
        }
        switch (args[0]) {
            case "izpisi": izpisiSliko(slika); break;
            case "histogram" : izpisiHistogram(slika); break;
            case "svetlost" : System.out.printf("Srednja vrednost sivine na sliki %s je: %.2f\n", args[1], svetlostSlike(slika)); break;
            case "zmanjsaj" : izpisiSliko(zmanjsajSliko(slika)); break;
            case "rotiraj" : izpisiSliko(rotirajSliko(slika)); break;
            case "zrcali" : izpisiSliko(zrcaliSliko(slika)); break;
            case "vrstica" : System.out.printf("Max razlika svetlo - temno je v %d. vrstici.", poisciMaxVrstico(slika));
        }
    }

    public static int[][] preberiSliko(String ime){
        Scanner sc;
        try {
            sc = new Scanner(new File(ime));
        }catch (FileNotFoundException e){
            System.out.printf("Napaka: datoteka %s ne obstaja.\n", ime);
            return null;
        }
        if (!sc.hasNextLine()){
            System.out.printf("Napaka: Datoteka %s je prazna.\n", ime);
            sc.close();
            return null;
        }
        String[] header = sc.nextLine().split(" ");
        if(header.length < 4 || !(header[0].equals("P2:")) || !(header[2].equals("x"))){
            System.out.printf("Napaka: datoteka %s ni v formatu P2.\n", ime);
            sc.close();
            return null;
        }
            int sirina;
            int visina;
        try{
            sirina = Integer.parseInt(header[1]);
            visina = Integer.parseInt(header[3]);
        }catch (NumberFormatException e){
            System.out.printf("Napaka: datoteka %s ni v formatu P2 (velikost slike ni pravilna).\n", ime);
            sc.close();
            return null;
        }
        if(sirina <= 0 || visina <= 0){
            System.out.printf("Napaka: datoteka %s ni v formatu P2 (velikost slike je 0 ali negativna).\n", ime);
            sc.close();
            return null;
        }

        int[][] slika = new int[visina][sirina];
        for (int j = 0; j < visina; j++) {
            for (int i = 0; i < sirina; i++) {
                if (!sc.hasNextInt()) {
                    System.out.printf("Napaka: datoteka %s vsebuje premalo podatkov.\n", ime);
                    sc.close();
                    return null;
                }
                int pixel = sc.nextInt();
                if (pixel < 0 || pixel > 255){
                    System.out.printf("Napaka: datoteka %s vsebuje podatke izven obsega 0 do 255.\n", ime);
                    sc.close();
                    return null;
                }
                slika[j][i] = pixel;
            }
        }
        sc.close();
        return slika;
    }
    public static void izpisiSliko(int[][] slika) {
        System.out.printf("velikost slike: %d x %d\n", slika[0].length, slika.length);
        for (int j = 0; j < slika.length; j++) {
            for (int i = 0; i < slika[0].length; i++) {
                System.out.printf("%3d ", slika[j][i]);
            }
            System.out.println();
        }
    }
    public static void izpisiHistogram(int[][] slika){
        int[] histogram = new int[256];
        for (int j = 0; j < slika.length; j++) {
            for (int i = 0; i < slika[0].length; i++) {
                histogram[slika[j][i]] += 1;
            }
        }
        System.out.println("sivina : # pojavitev");
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > 0) {
                System.out.printf("  %3d  :   %d%n", i, histogram[i]);
            }
        }
    }
    public static double svetlostSlike(int[][] slika){
        double svetlost = 0;
        for (int j = 0; j < slika.length; j++) {
            for (int i = 0; i < slika[0].length; i++) {
                svetlost += slika[j][i];
            }
        }
        return  svetlost / (slika.length * slika[0].length);
    }
    public static int[][] zmanjsajSliko(int[][] slika){
        if (slika[0].length < 3 || slika.length < 3){
            return slika;
        }

        int[][] nSlika = new int[slika.length / 2][slika[0].length / 2];
        for (int j = 0; j < nSlika.length; j++) {
            for (int i = 0; i < nSlika[0].length; i++) {
                nSlika[j][i] = Math.round((slika[2 * j][2 * i]
                        + slika[2 * j + 1][2 * i]
                        + slika[2 * j][2 * i + 1]
                        + slika[2 * j + 1][2 * i + 1]) >> 2);
            }
        }
        return nSlika;
    }
    public static int[][] rotirajSliko(int[][] slika) {

        int[][] novaSlika = new int[slika[0].length][slika.length];
        for (int j = 0; j < slika.length; j++) {
            for (int i = 0; i < slika[0].length; i++) {
                novaSlika[i][slika.length - j - 1] = slika[j][i];
            }
        }
        return novaSlika;
    }
    public static int[][] zrcaliSliko(int[][] slika) {
        int[][] nSlika = new int[slika.length][slika[0].length];
        for (int j = 0; j < slika.length; j++) {
            for (int i = 0; i < slika[0].length; i++) {
                nSlika[j][slika[0].length - i - 1] = slika[j][i];
            }
        }
        return nSlika;
    }
    public static int poisciMaxVrstico(int[][] slika){
        int maxRazlika = -1;
        int indeks = 0;

        for (int j = 0; j < slika.length; j++) {
            int min = 255;
            int max = 0;
            for (int i = 0; i < slika[0].length; i++) {
                if (slika[j][i] < min) {
                    min = slika[j][i];
                }
                if (slika[j][i] > max) {
                    max = slika[j][i];
                }
            }
            int razlika = max - min;
            if (razlika > maxRazlika) {
                maxRazlika = razlika;
                indeks = j;
            }
        }
        return indeks + 1;
    }

}
