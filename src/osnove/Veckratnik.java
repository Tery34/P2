package osnove;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Veckratnik {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("viri/veckratniki.txt");

        int a;
        int b;
        int n;

        System.out.println("Vpiši a: ");
        a = sc.nextInt();
        System.out.println("Vpiši b: ");
        b = sc.nextInt();
        System.out.println("Vpiši n: ");
        n = sc.nextInt();
        for (int i = a; i <= b; i++){
            pw.printf("%d * %d = %d\n", i, n, i * n);
        }

        pw.close();
    }
}
