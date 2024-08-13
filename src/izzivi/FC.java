package izzivi;

public class FC {
    public static void main(String[] args) {
        int f;
        double c;

        System.out.printf("%6c | %6c\n", 'F', 'C');
        System.out.print("---------------------\n");

        for(f = 0; f <= 120; f = f + 10) {
            c = (f - 32) / 1.8;

            System.out.printf("%6d | %6.2f\n", f, c);
        }
    }
}
