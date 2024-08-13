package fis;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Drzave {
    static HashMap<String,Drzava> preberiDrzave() throws Exception {
        HashMap<String,Drzava> drzave = new HashMap<String,Drzava>();
        String drzava;

        Scanner sc = new Scanner(new File("Viri/drzave.txt"));

        while (sc.hasNext()) {
            drzava = sc.nextLine();
            String[] podatki = drzava.split(":");
            Drzava tekmovalec = new Drzava(podatki[0], podatki[1], Integer.parseInt(podatki[2]));
            drzave.put(podatki[0], tekmovalec);
        }
        sc.close();

        return drzave;
    }

    static void izpisDrzavTipkovnica(HashMap<String, Drzava> drzave){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Vpisi kratico drzave: ");
            String kratica = sc.nextLine().toUpperCase();
            if(kratica.isEmpty()){
                break;
            }
            Drzava d = drzave.get(kratica);
            if(d == null){
                System.out.println("Drzava ne tekmuje");
            }else{
                System.out.println(d);
            }
        }
    }
    static void izpisDrzavPoVrednostih(HashMap<String, Drzava> drzave){
        Iterator<Drzava> it = drzave.values().iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
    static void izpisDrzavPoKljucih(HashMap<String, Drzava> drzave){
        Iterator<String> it = drzave.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void main(String[] args) throws Exception {
        HashMap<String, Drzava> drzave;
        drzave = preberiDrzave();
        izpisDrzavTipkovnica(drzave);
        izpisDrzavPoVrednostih(drzave);
        izpisDrzavPoKljucih(drzave);
    }
}

