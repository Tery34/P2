package izzivi;

public class Postevanka {
    public static void main(String[] args){

        System.out.println("    |   1   2   3   4   5   6   7   8   9  10 ");
        System.out.println("----------------------------------------------");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%3s |", i);
            for(int j = 1; j <= 10; j++){
                System.out.printf("%4s", j * i);
            }
            System.out.println();
        }
    }
}
