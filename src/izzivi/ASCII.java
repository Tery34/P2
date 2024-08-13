package izzivi;

public class ASCII {
    public static void main(String[] args) {
        System.out.println("      0   1   2   3   4   5   6   7");
        System.out.println("   --------------------------------");
        for (int j = 4; j < 16; j++) {
            System.out.printf("%2d |",j);
            for (int i = 0; i < 8; i++) {
                char c = (char) (j*8+i);
                System.out.printf("  %c ", c);
            }
            System.out.println();
        }
    }
}
