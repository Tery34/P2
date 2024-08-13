package DN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class DN03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(args.length != 0 ? args[0] : "viri/gesla.txt"));
        int n = args.length != 0 ? Integer.parseInt(args[1]) : 10;
        int seed = args.length != 0 ? Integer.parseInt(args[2]) : 100;
        String [] besede = new String[sc.nextInt()];
        Random rnd = new Random(seed);
        String geslo = "";

        for (int i = 0; i <= besede.length-1; i++){
            besede[i] = sc.next();
        }
        sc.close();
        for (int j = 0; j < n; j++){
            String temp = besede[rnd.nextInt(besede.length)];
            geslo += temp.charAt(rnd.nextInt(temp.length()));
        }
        System.out.println(geslo);
    }

}
