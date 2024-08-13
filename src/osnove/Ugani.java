package osnove;

import java.util.Scanner;
import java.util.Random;

public class Ugani {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Stevilo naj bo manjse od: ");
        int maxStevilo = sc.nextInt();
        int Thestevilo = rnd.nextInt(maxStevilo) + 1;
        int stevilo;
        int poteze = 0;

        do {
            poteze++;
            System.out.printf("Ugani stevilo (poskus st.%3d): ",poteze);
            stevilo = sc.nextInt();
            if (stevilo > Thestevilo){
                System.out.println("Prevec");
            }
            else if (stevilo < Thestevilo){
                System.out.println("Premalo");
            }
            else if (stevilo == Thestevilo){
                System.out.printf("BRAVO, uganil si v %d potezah", poteze);

                break;
            }
        }while(true);
    }
}
