package osnove;

public class Printf {
    public static void main(String[] args) {
        System.out.printf ("Znaki: %c %c \n", 'a', 65);
        System.out.printf ("Cela stevila: %d %d\n", 2012 ,123456789);
        System.out.printf ("Presledki pred stevilom: %10d \n", 2012);
        System.out.printf ("Znak '0' pred stevilom: %010d \n", 2012);
        System.out.printf ("Stev. sistemi: %d %x %o %#x %#o %x %X\n",
                100, 100, 100, 100, 100, 10, 10);
        System.out.printf ("Realna stevila: %4.2f %+.0e %E \n",
                3.1416, 3.1416, 3.1416);
        System.out.printf ("Niz: %s \n", "To je niz");
    }
}