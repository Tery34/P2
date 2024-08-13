package VAJE;
public class VAJE02 {
    public static void main(String[] args){
        System.out.print("  n              n!            Stirling(n)      napaka (%)");
        System.out.println();
        System.out.print("----------------------------------------------------------");
        for (int i = 1; i <= 20; i++){
            System.out.printf("\n %3d %20d %20d %.7f",i, fakultetaL(i), stirlingL(i), (100.0*(fakultetaL(i)-stirlingL(i))/fakultetaL(i)));
        }
        System.out.println();
        System.out.print("\n  n         n!            Stirling(n)     napaka (%)");
        System.out.println();
        System.out.print("----------------------------------------------------");
        for (int i = 1; i <= 100; i++){
            System.out.printf("\n%3d   %.9E   %.9E   %.7f", i, fakultetaD(i), stirlingD(i), (100*(fakultetaD(i)-stirlingD(i))/fakultetaD(i)));
        }

    }
    static long fakultetaL(int n){
        long rez = 1;
        for (int i = n; i > 0; i--){
            rez *= i;
        }
        return rez;
    }
    static long stirlingL(int n){
        long rez = Math.round(Math.sqrt(2*Math.PI*n)*Math.pow((n/Math.E),n));
        return rez;
    }
    static double fakultetaD(int n) {
        double rez = 1;
        for (int i = n; i > 0; i--){
            rez *= i;
        }
        return rez;
    }
    static double stirlingD(int n) {
        double rez = Math.sqrt(2 * Math.PI * n) * Math.pow((n / Math.E), n);
        return rez;
    }
}
