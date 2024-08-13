package DN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DN07 {
    public static void main(String[] args) throws FileNotFoundException {
        args = new String[]{"Viri/planeti.txt", "mArs+uranu+neptun"};

        Planet[] planeti = preberiPlanete(args[0]);
        String[] planetiToPrint = args[1].split("[+]");
        double vsota = 0;
        for(int i = 0 ; i < planetiToPrint.length; i++){
            for (Planet planet : planeti) {
                if (planet.ime.equalsIgnoreCase(planetiToPrint[i])) {
                    vsota += planet.povrsina();

                }
            }
        }
        System.out.printf("Povrsina planetov \"%s\" je %d milijonov km2", args[1], (int)(vsota/1000000));
    }

    public static Planet[] preberiPlanete(String datoteka) {
        try {
            Planet[] planeti = new Planet[8];
            Scanner sc = new Scanner(new File(datoteka));
            for (int i = 0; sc.hasNextLine(); i++) {
                String[] vrstica = sc.nextLine().split(":");
                planeti[i] = new Planet(vrstica[0], Integer.parseInt(vrstica[1]));
            }
            sc.close();
            return planeti;
        }catch (FileNotFoundException e){
            return new Planet[0];
        }
    }
}

class Planet {
    String ime;
    int radij;

    public Planet(String ime, int radij){
        this.ime = ime;
        this.radij = radij;
    }
    public double povrsina(){
        return 4*Math.PI*radij*radij;

    }

}
