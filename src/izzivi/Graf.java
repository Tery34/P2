package izzivi;

import java.util.Scanner;

public class Graf {
    static int H = 25;
    static int W = 60;

    public static void main(String[] args) {
        double x,y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vpiši x1: ");
        double x1 = sc.nextFloat();
        System.out.println("Vpiši x2: ");
        double x2 = sc.nextFloat();
        System.out.println("Vpiši y1: ");
        double y1 = sc.nextFloat();
        System.out.println("Vpiši y2: ");
        double y2 = sc.nextFloat();
        System.out.println("Izberi funkcijo: 0(sin), 1(cos), 2(tan), 3(e^x)");
        int funkcija = sc.nextInt();



        char[][] zaslon = new char[W][H];

        praznaTabela(zaslon);

        // glavna funkcija za pretvorbo vredn
        for (int i = 0; i < W; i++){
            x = (x2 - x1)/(W-1) * i + x1;
            switch (funkcija){
                case 0: y = Math.sin(x); break;
                case 1: y = Math.cos(x); break;
                case 2: y = Math.tan(x); break;
                case 3: y = Math.pow(Math.E,x);
            }
            int j = (int) Math.round((H-1) * (y - y1) / (y2 - y1));
            if ((j >= 0) && (j < H)){
                zaslon[i][j] = '*';
            }
        }

        izpisiTabelo(zaslon);
    }
    static void praznaTabela(char tabela[][]){
        // tabelo spraznemo(napolnemo z presledki)
        for(int i=0; i<W; i++)
            for(int j=0; j<H; j++)
                tabela[i][j]=' ';
        // za lazjo predstabo dodamo osi
        for(int i=0;i<W;i++) tabela[i][H/2]='-';
        for(int j=0;j<H;j++) tabela[W/2][j]='|';
    }
    static void izpisiTabelo(char tabela[][]){
        for(int j=H-1; j>=0; j--) {
            for(int i=0; i<W; i++)
                System.out.printf("%c", tabela[i][j]);
            System.out.println();
        }
    }
}
