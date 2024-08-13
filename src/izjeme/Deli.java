package izjeme;

public class Deli {
    public static void main(String[] args) {
        try {
            int a = 3 / 0;
        } catch (Exception e) {
            System.out.println("e.toString" + e.toString());
            System.out.println("e.getmessage" + e.getMessage());
            System.out.println("e.getStackTrace");
            e.printStackTrace(System.out);
        }
    }
}
