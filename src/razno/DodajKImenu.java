package razno;

public class DodajKImenu {
    public static void main(String[] args) {
        System.out.println(dodajKImenu("podatki.txt", "CRC"));
        System.out.println(dodajKImenu("podatki", "CRC"));
        System.out.println(dodajKImenu(".txt", "CRC"));
    }
    static String dodajKImenu(String ime, String dodatek){
        if (ime.contains("."))return new StringBuffer(ime).insert(ime.lastIndexOf("."),dodatek).toString();
        else return ime + dodatek;
    }
}
