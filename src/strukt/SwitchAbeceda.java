package strukt;

public class SwitchAbeceda {
    public static void main(String[] args) {
        char Znak;
        char dodatniZnak;
        int counter = 0;
        for (char c = 'a'; c <= 'z'; c++){

            if ((c=='q') || (c=='w') || (c=='x') || (c=='y'))
                continue;

            if ((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
                Znak = Character.toUpperCase(c);

            else Znak = c;

            dodatniZnak = switch (c) {
                case 'a' -> '!';
                case 'e' -> '?';
                case 'i' -> '&';
                case 'o' -> '#';
                case 'u' -> '/';
                default -> '*';
            };

            System.out.printf("%c%c ", Znak, dodatniZnak);
            if (counter++ == 3) {
                System.out.println();
                counter = 0;
            }

        }
    }
}
