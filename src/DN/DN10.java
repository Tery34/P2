package DN;
import java.io.FileInputStream;

public class DN10 {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream(args[0]);
            fis.skip(8);

            while (fis.available() > 0) {
                int len = (fis.read() << 24) | (fis.read() << 16) | (fis.read() << 8) | fis.read();
                byte[] typeBytes = new byte[4];

                fis.read(typeBytes);
                String type = new String(typeBytes);
                fis.skip(len);
                fis.skip(4);
                System.out.printf("Chunk: %s, length: %d%n", type, len);

                if ("IEND".equals(type)) {
                    break;
                }
            }
            fis.close();
        } catch (Exception e) {

        }
    }
}
