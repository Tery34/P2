package tabele;

public class Graf {
    static int H = 25;
    static int W = 60;

    public static void main(String[] args) {
        double x,y;

        double x1 = -2*Math.PI, x2 = 2*Math.PI;
        double y1 = -1.5, y2 = 1.5;

        char[][] zaslon = new char[W][H];

        // tabelo spraznemo(napolnemo z presledki)
        for(int i=0; i<W; i++)
            for(int j=0; j<H; j++)
                zaslon[i][j]=' ';
        // za lazjo predstabo dodamo osi
        for(int i=0;i<W;i++) zaslon[i][H/2]='-';
        for(int j=0;j<H;j++) zaslon[W/2][j]='|';

        // glavna funkcija za pretvorbo vredn
        for (int i = 0; i < W; i++){
            x = (x2 - x1)/(W-1) * i + x1;
            y = Math.sin(x);
            int j = (int) Math.round((H-1) * (y - y1) / (y2 - y1));
            if ((j >= 0) && (j < H)){
                zaslon[i][j] = '*';
            }
        }

        // izpis tabele
        for(int j=H-1; j>=0; j--) {
            for(int i=0; i<W; i++)
                System.out.printf("%c", zaslon[i][j]);
            System.out.println();

        }
    }
}
