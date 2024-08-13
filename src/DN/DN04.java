package DN;

public class DN04 {
    public static void main(String[] args) {
        if (args.length == 0) return;

        String [] znaki = args[0].split("(?<=\\G........)");//regex splitta vskaih n . (8znakov)
        String rezultat = "";

        for (String znak : znaki){
            int crka = 0;
            int bit = 1;
            for (int i = znak.length()-1; i >= 0; i--){
                crka += znak.charAt(i) == '1' ? bit : 0;
                bit *= 2;

            }
            rezultat += (char) crka;
        }
        System.out.print(rezultat);
    }

}

