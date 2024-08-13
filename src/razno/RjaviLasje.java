package razno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RjaviLasje {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Viri/studenti.txt"));
        do {
            String niz = sc.nextLine();
            String[] polja = niz.split(":");
            if (polja[5].equals("RJAVA")) System.out.println(polja[1]);

        }while(sc.hasNextLine());
        sc.close();
    }



}
