
public class DN06 {
    public static void main(String[] args) {
        args = new String[]{"004000000000030002390700080400009001209801307600200008010008053900040000000000800"};



        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 9);
        StdDraw.setYscale(0, 9);
        StdDraw.clear(StdDraw.WHITE);

        izrisiMrezo();
        izpisiStevilke(args[0]);
    }
    private static void izrisiMrezo() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.002);


        for (int i = 0; i <= 9; i++) {
            StdDraw.line(i, 0, i, 9);
            StdDraw.line(0, i, 9, i);
        }


        StdDraw.setPenRadius(0.005);
        for (int i = 0; i <= 9; i += 3) {
            StdDraw.line(i, 0, i, 9);
            StdDraw.line(0, i, 9, i);
        }
    }
    private static void izpisiStevilke(String sudoku) {
        StdDraw.setPenColor(StdDraw.BLACK);

        for (int i = 0; i < 81; i++) {
            int vestica = 8 - i / 9;
            int stolpec = i % 9;

            char num = sudoku.charAt(i);
            if (num != '0') {
                StdDraw.text(stolpec + 0.5, vestica + 0.5, String.valueOf(num));
            }
        }
    }
}