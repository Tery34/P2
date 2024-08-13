package zbirke;

import java.util.ArrayList;
import java.util.Iterator;

public class Delitelji {
    public static void main(String[] args) {
        Iterator<Integer> it = seznamDeliteljev(42).iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    public static ArrayList<Integer> seznamDeliteljev(int n){
        ArrayList<Integer> delitelji = new ArrayList<>();
        for(int i = 1; i <= n/2; i++){
            if (n % i == 0){
                delitelji.add(i);
            }
        }
        return  delitelji;
    }
}
