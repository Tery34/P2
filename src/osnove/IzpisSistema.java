package osnove;

public class IzpisSistema {
    public static void main(String[] args){
        /*
         Program izpise tabelo za pretvorbo med desetiskim, osmiskim in
         sesnajstiskim sistemom. Velikost tabele (stevilo vrstic) doloci
         uporabnik s prvim argumentom ob klicu programa. Ce uporabnik
         argumenta ne poda, program izpise prvih 32 stevil.
        */
        // privzeto stevilo vrstic izpisa
        int vrstice = 32;
        // če je uporabnik podal argument, ga preberem
        if (args.length == 1){
            vrstice = Integer.parseInt(args[0]);
        }

        System.out.println("Desetisko | Osmisko | Sestnajstisko");     //zacetek tabele
        for(int i = 0; i < vrstice; i++){
            System.out.printf("%7d   | %5o   | %11X  \n", i, i, i);      //ostalo formatiranje
        }
    }
}
