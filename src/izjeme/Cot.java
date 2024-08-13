package izjeme;

class NapacenArgument extends ArithmeticException {
    public String getMessage() {
        return "Kotangens od 0 ni definiran";
    }
}

public class Cot {
    public static double Cot(double x)  {
        if (x == 0) throw new NapacenArgument();

        return Math.sin(x) / Math.cos(x);
    }

    public static void main(String[] args) {
        System.out.println("Klicem varno: ");
        try {
            double y = Cot(0);
        } catch (NapacenArgument e) {
            System.out.println(e.toString());
        }

        System.out.println("\nKlicem brez varovanja: ");
        double x = Cot(0);

    }
}