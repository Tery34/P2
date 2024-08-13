package operatorji;

import java.util.Scanner;

public class BSDchecksum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vpisi niz:");
        String besedilo = sc.next();

        System.out.printf("BSD niza %s je %d\n", besedilo, BSD(besedilo));
    }
    static int BSD(String niz){
        int checksum = 0;

        for (int ch = 0; ch < niz.length(); ch++)  {
            checksum = (checksum >> 1) + ((checksum & 1) << 15);
            checksum += niz.charAt(ch);
            checksum &= 0xffff;       /* Keep it within bounds. */
        }
        return checksum;
    }
}
