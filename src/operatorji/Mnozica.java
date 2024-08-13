package operatorji;

public class Mnozica {
    public static void main(String[] args) {
        int mnozica1 = getPraznaMnozica();
        mnozica1 = dodajElement(mnozica1, 'a','i', 'e', 'z');
        mnozica1 = brisiElement(mnozica1, 'e');
        System.out.printf("Mnozica1=%s\n", toString(mnozica1));

        int mnozica2 = getPraznaMnozica();
        mnozica2 = dodajElement(mnozica2, 'a', 'f','z', 'b');
        mnozica2 = preklopiElement(mnozica2, 'g');
        System.out.printf("Mnozica2=%s\n", toString(mnozica2));

        int presek = presek(mnozica1, mnozica2);
        int unija = unija (mnozica1, mnozica2);
        System.out.printf("presek(%s, %s)=%s\n",
                toString(mnozica1), toString(mnozica2), toString(presek));
        System.out.printf("inija (%s, %s)=%s\n",
                toString(mnozica1), toString(mnozica2), toString (unija));
    }
    static int getPraznaMnozica() {return 0;}

    static int dodajElement(int mnozica, char... elementi){
        for(char element : elementi){
            mnozica |= (1 << (element - 'a'));
        }
        return mnozica;
    }
    static boolean jeElement(int mnozica, char element){
        return (mnozica & (1 << (element - 'a'))) != 0;
    }
    static String toString(int mnozica){
        String rezultat = "";
        for (char c = 'a'; c <= 'z'; c++){
            if (jeElement(mnozica,c)){
                rezultat += c +",";
            }
        }
       return("[" + rezultat + "]");
    }
    static int presek(int mnozica1, int mnozica2){
        return mnozica1 & mnozica2;
    }

    static int unija(int mnozica1, int mnozica2){
        return mnozica1 | mnozica2;
    }
    static int brisiElement(int mnozica, char element){
        return mnozica &= ~(1 << (element - 'a'));
    }
    static int preklopiElement(int mnozica, char element){
        return mnozica ^= (1 << (element - 'a'));
    }
}
