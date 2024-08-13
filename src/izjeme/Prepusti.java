package izjeme;

import java.io.*;

public class Prepusti {

    public static void preberiVse(InputStream in) {
        int i;
        try {
            while ((i = preberiZnak(in)) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static int preberiZnak(InputStream in) throws IOException {
        return in.read();
    }

    public static void main(String[] argv) {
        preberiVse(System.in);
    }
}