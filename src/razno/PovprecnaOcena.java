package razno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PovprecnaOcena {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Viri/studenti.txt"));
        double visina = Double.parseDouble(args.length != 0 ? args[0]:"180");
        int vsota = 0;
        int counter = 0;

        do {
            String niz = sc.nextLine();
            String[] polja = niz.split(":");
            if (Double.parseDouble(polja[4]) > visina) {
                vsota += Integer.parseInt(polja[3]);
                counter++;
            }

        }while(sc.hasNextLine());
        sc.close();

        System.out.printf("Povprecna oceana %d studentov je %d", counter,vsota/counter);
    }

}
