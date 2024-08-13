package osnove;

public class Stetje {
    public static void main(String[] args) {
        int counter = 0;

        String[] besede = new String[]{"pomlad", "jabolko", "jesen", "zima", "lopar", "bor"};

        String abeceda = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i <= abeceda.length()-1; i++) {
            for (int j = 0; j <= besede.length-1; j++) {
                if (besede[j].charAt(0) == abeceda.charAt(i)){
                    counter++;
                }
            }
            System.out.printf("Število besed na črko '%c': %d\n", abeceda.charAt(i), counter);
            counter = 0;

        }
    }
}
