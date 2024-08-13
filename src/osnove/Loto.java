package osnove;
import java.util.Random;

public class Loto {
    public static void main(String[] args) {
        Random rnd = new Random();

        for(int i = 0; i < 7; i++){

            int nakljucnoStevilo = rnd.nextInt(39) + 1;
            System.out.printf("%d ",nakljucnoStevilo);
        }
    }
}
