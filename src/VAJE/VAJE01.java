package VAJE;

public class VAJE01 {
    public static void main(String[] args){
        pravokotnikStevil(12,3);
        pravokotnik(5,7,3);
        trikotnikStevil(3);
        trikotnikStevilObrnjen(3);
        trikotnikStevil2(5);
        trikotnik(1,5);
        trikotnikObrnjen(1,5);
        romb(2,5);
        smreka(4);
    }
    static void pravokotnikStevil(int sirina, int visina){
        for (int j = 1; j <= visina; j++) {
            for (int i = 1; i <= sirina; i++) {
                if (i > 9){
                    System.out.print(i % 10);
                }else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    static void pravokotnik(int odmik, int sirina, int visina){
        for(int k = 1; k <= visina; k++) {

            for (int j = 1; j <= odmik; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= sirina; i++) {
                System.out.print("X");

            }
            System.out.println();
        }
    }
    static void trikotnikStevil(int visina){
        for (int j = 1; j <= visina; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void trikotnikStevilObrnjen(int visina){

        for (int j = visina; j > 0; j--) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void trikotnikStevil2(int visina){
        for (int j = 1; j <= visina; j++) {
            for (int k = visina; k > j; k--){
                System.out.print(" ");
            }
            for (int i = 1; i <= j*2-1; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void trikotnik(int odmik, int visina){
        for (int j = 1; j <= visina; j++) {
            for (int k = visina + odmik; k > j; k--){
                System.out.print(" ");
            }
            for (int i = 1; i <= j*2-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void trikotnikObrnjen(int odmik, int visina){
        for (int j = visina; j > 0; j--) {
            for (int k = visina + odmik; k > j; k--){
                System.out.print(" ");
            }
            for (int i = 1; i <= j*2-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void romb(int odmik, int velikost){
        for (int j = 1; j <= velikost; j++) {
            for (int k = velikost + odmik; k > j; k--){
                System.out.print(" ");
            }
            for (int i = 1; i <= j*2-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = velikost - 1; j > 0; j--) {
            for (int k = velikost + odmik; k > j; k--){
                System.out.print(" ");
            }
            for (int i = 1; i <= j*2-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void smreka(int velikost){
        int deblo = velikost;
        if (velikost % 2 == 0) {
            deblo++;
        }
        for (int krosnje = 1; krosnje <= velikost; krosnje++) {

            for (int stolpci = 1; stolpci <= krosnje*2; stolpci++) {

                for (int odmik = velikost*2; odmik > stolpci; odmik--) {
                    System.out.print(" ");
                }
                for (int vrstic = 1; vrstic <= stolpci * 2 - 1; vrstic++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int visina = 1; visina <= velikost*2; visina++) {

            for (int odmik = 1; odmik <= velikost+deblo/2-1; odmik++) {
                System.out.print(" ");
            }
            for (int sirina = 1; sirina <= deblo; sirina++) {
                System.out.print("X");

            }
            System.out.println();
        }
    }

}
