package DN;

public class DN02 {
    public static void main(String[] args) {
        if (args.length == 0) return;

        int koren = (int) Math.sqrt(args[0].length());
        if (koren * koren < args[0].length()) koren++;

        for (int i = 0; i < koren; i++){
            for (int j = 0; j < koren; j++){
                int index = i * koren + j;
                if (index < args[0].length()){
                    System.out.print(" " + args[0].charAt(index) + " ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}