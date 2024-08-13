package strukt;

import java.util.Scanner;

public class Prastevila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vpisi spodnjo mejo: ");
        int spMeja = sc.nextInt();
        System.out.println("Vpiši zgornjo mejo: ");
        int zgMeja = sc.nextInt();

        for (int i = spMeja; i <= zgMeja; i++){
            if (jePrastevilo(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean jePrastevilo(int x){
        for(int delitelj = 2; delitelj <= (int) Math.sqrt(x); delitelj++){
            if (x % delitelj == 0){
                return false;
            }
        }
        return true;
    }
}
