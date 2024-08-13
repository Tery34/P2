package zbirke;

import java.util.HashMap;
import java.util.Iterator;

public class Meseci {
    public static void main(String[] args) {
        HashMap<String, Integer> meseci = new HashMap();

        meseci.put("Januar", 31);
        meseci.put("Februar", 28);
        meseci.put("Marec", 31);
        meseci.put("April", 30);
        meseci.put("Maj", 31);
        meseci.put("Junij", 30);
        meseci.put("Julij", 31);
        meseci.put("Avgust", 31);
        meseci.put("September", 30);
        meseci.put("Oktober", 31);
        meseci.put("November", 30);
        meseci.put("December", 31);

        Iterator<String> it = meseci.keySet().iterator();
        while (it.hasNext()){
            String imeMeseca = it.next();
            System.out.println(imeMeseca + " " + meseci.get(imeMeseca));
        }
    }

}
