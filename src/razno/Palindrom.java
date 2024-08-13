package razno;

public class Palindrom {
    public static void main(String[] args) {
        String niz = "To ni palindrom";
        System.out.printf("'%s' %s palindrom \n",
                niz, jePalindrom(niz)?" JE ":" NI ");

        niz = "Ata nima laminata";
        System.out.printf("'%s' %s palindrom \n",
                niz, jePalindrom(niz)?" JE ":" NI ");
    }
    static boolean jePalindrom(String niz){
        niz = niz.replaceAll(" ", "");
        niz = niz.toUpperCase();
        int i = 0;
        boolean ujema = true;
        while(i < niz.length()/2){
            if (niz.charAt(i) != niz.charAt(niz.length()-1-i)){
                ujema = false;
                break;
            }
            i++;
        }
        return ujema;
    }
}
