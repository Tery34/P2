package razno;

import java.io.File;
import java.util.Scanner;

public class Skrivno {
    public static void main(String[] args) throws Exception{
        Scanner scBesede = new Scanner(new File("Viri/besede.txt"));

        String[] besede = new String[100];
        int indexTabele = 0;

        while(scBesede.hasNext()) besede[indexTabele++] = scBesede.next();
        scBesede.close();

        Scanner scSkrivno = new Scanner(new File("Viri/skrivno.txt"));
        while(scSkrivno.hasNext()){
            int b = scSkrivno.nextInt();
            int c = scSkrivno.nextInt();
            if ((b == 0) && (c==0))
                System.out.print(" ");
            else
                System.out.print(besede[b-1].charAt(c-1));
        }
        scSkrivno.close();
    }
}
