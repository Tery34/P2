package tabele;

import java.util.Random;

public class Loto2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] nakljucnaStevila = new int[7];
        boolean obstaja;

        for (int i = 0; i < 7; i++){
            do{
                nakljucnaStevila[i] = rnd.nextInt(39)+1;
                obstaja = false;

                for (int j = 0; j < i; j++){
                    if (nakljucnaStevila[i] == nakljucnaStevila[j]) {
                        obstaja = true;

                    }
                }
            }while(obstaja);
            System.out.printf("%d ", nakljucnaStevila[i]);
        }
    }
}
