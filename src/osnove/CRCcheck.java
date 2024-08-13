package osnove;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CRCcheck {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("viri/PodatkiZVsoto.txt"));
        int checkSum = 0;
        int kontrola = 0;

        while (sc.hasNextLine()){
            String vrstica = sc.nextLine();
            if (sc.hasNextLine()){
                for (int i = 0; i < vrstica.length(); i++){
                    char znak = vrstica.charAt(i);
                    checkSum = (checkSum + (int) znak) % 1024;
                }
            }else{
                kontrola = Integer.parseInt(vrstica);
            }
        }
        sc.close();

        if (checkSum == kontrola) {
            System.out.println("Datoteka je pravilna!");
            System.out.println(checkSum);
        }else{
            System.out.println("V datoteki je napaka!");
            System.out.println(checkSum);
        }
    }
}
