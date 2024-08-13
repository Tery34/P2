package izjeme;

import java.io.*;

public class Ulovi {

    public static void preberiVse(InputStream in) {
        int i;
        while ((i = preberiZnak(in)) != -1) {
            System.out.print((char) i);
        }
    }

    public static int preberiZnak(InputStream in) {
        try {
            return in.read();
        } catch (IOException e) {
            System.out.println(e.toString());
            return -1;
        }
    }

    public static void main(String[] argv) {
        preberiVse(System.in);
    }
}