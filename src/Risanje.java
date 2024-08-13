public class Risanje {
    public static void graf() {
        double X1=-4, X2 = 4;
        double Y1 =-10, Y2 = 10;

        double W = 100;
        double H = 100;
        StdDraw.setXscale(0,W);
        StdDraw.setYscale(0,H);

        StdDraw.line(0,H/2, W, H/2);
        StdDraw.line(W/2, 0 , W/2, H);

        double pI =0, pJ = 0;
        for(int i=0; i<=W; i++) {
            double x = i*(X2-X1)/ W + X1;  // i = 0; x = -2PI
            double y = Math.exp(x);        // y = 0
            double j = H*(y-Y1)/(Y2-Y1);   // 100*(0-(-1))/(1-(-1)) = 50

            StdDraw.line(pI,pJ,i,j);
            pI = i; pJ = j;
        }
    }

    public static void main(String[] args) {
        graf();
    }
}
