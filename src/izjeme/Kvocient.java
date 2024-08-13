package izjeme;

import java.util.Scanner;

public class Kvocient {
    public static void main(String[] args) {
        int i, j, k;
        int [] tabela1 = {0,23,3,23,321,134,5,5};
        int [] tabela2 = {0,43,321,42,5,435,45,5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Vpiši prvi index: ");
        i = sc.nextInt();

        System.out.println("Vpiši drugi index: ");
        j = sc.nextInt();
        try {
            k = tabela1[i] / tabela2[j];
            System.out.printf("%d / %d = %d", tabela1[i], tabela2[j], k);
        }catch (ArithmeticException e){
            System.out.print("Napaka: Deljeneje z 0");
        }
        catch (IndexOutOfBoundsException e){
            System.out.print("Napaka: Neveljaven index tabele");
        }
    }

}
