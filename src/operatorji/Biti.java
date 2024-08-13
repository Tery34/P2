package operatorji;

import java.util.Scanner;

public class Biti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Vpisi stevilo:");
        int stevilo = sc.nextInt();

        System.out.printf("Stevilo prizganih bitov v stevilu %d je %d\n", stevilo, prizganiBiti(stevilo));

    }

    static int prizganiBiti(int n) {
        int biti = 0;
        while (n != 0) {
            biti = biti + (n & 1);
            n = n >> 1;
        }
        return biti;
    }
}
