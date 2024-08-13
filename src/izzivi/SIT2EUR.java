package izzivi;

public class SIT2EUR {

    public static void main(String[] args){
        if (args.length != 2) {
            System.out.println("Uporaba: java SIT2EUR.java n VALUTA");
            System.exit(1);
        }
        if (args[1].equals("SIT")){
            System.out.printf("%.2f SIT = %.2f EUR",Double.parseDouble(args[0]),Double.parseDouble(args[0]) / 239.64);
        }
        if (args[1].equals("EUR")) {
            System.out.printf("%.2f EUR = %.2f SIT",Double.parseDouble(args[0]),Double.parseDouble(args[0]) * 239.64);
        }
    }
}
