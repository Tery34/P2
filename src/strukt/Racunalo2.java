package strukt;

public class Racunalo2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uporaba: java Racunalo x y");
            System.exit(1);
        }

        String x = args[0];
        String y = args[1];
        System.out.printf("%s + %s = %d", x, y, pretvoriStevilo(x) + pretvoriStevilo(y));
    }
    static int pretvoriStevilo(String x){
        int rezultat = 0;
        for (int i = 0; i < x.length(); i++){
            rezultat = 10*rezultat+(x.charAt(i) - '0');
        }
        return rezultat;
    }
}
