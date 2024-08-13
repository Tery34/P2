package operatorji;

import java.util.Scanner;

public class Dvojisko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vpisi setvilo: ");

        int stevilo = sc.nextInt();

        System.out.println(vDvojisko(stevilo));
        System.out.println(vDesetisko(vDvojisko(stevilo)));
    }

    static String vDvojisko(int x){
        if (x <= 0) return "0";
        String rezultat = "";

        while (x != 0) {
            rezultat = (x & 1) + rezultat;
            x = x >> 1;
        }
        return rezultat;
    }
    static int vDesetisko(String d){
        int rezultat = 0;
        int bit = 1;

        for (int i = d.length()-1; i >= 0; i--){
            rezultat += d.charAt(i) == '1' ? bit : 0;
            bit *= 2;
        }
        return rezultat;
    }
}
