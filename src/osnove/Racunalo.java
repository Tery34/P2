package osnove;

public class Racunalo {

    public static void main(String[] args){
        if (args.length != 2) {
            System.out.println("Uporaba: java Racunalo x y");
            System.exit(1);
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d", x, y, x + y);

    }
}
