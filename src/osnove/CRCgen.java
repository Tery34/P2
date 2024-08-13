package osnove;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CRCgen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("viri/Podatki.txt"));
        PrintWriter pw = new PrintWriter("viri/PodatkiCRC.txt");

        int checkSum = 0;

        while (sc.hasNextLine()) {
            String vrstica = sc.nextLine();
            pw.println(vrstica);
            for (int i = 0; i < vrstica.length(); i++) {
                char znak = vrstica.charAt(i);
                checkSum = (checkSum + (int) znak) % 1024;
            }
        }
        sc.close();
        pw.println(checkSum);
        pw.close();
    }
}