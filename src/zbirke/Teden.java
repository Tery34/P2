package zbirke;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Teden {
    public static void main(String[] args) {
        HashSet<String> dnevi = new HashSet<String>();

        dnevi.add("pon");
        dnevi.add("tor");
        dnevi.add("sre");
        dnevi.add("cet");
        dnevi.add("pet");
        dnevi.add("sob");
        dnevi.add("ned");

        Iterator<String> it = dnevi.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
