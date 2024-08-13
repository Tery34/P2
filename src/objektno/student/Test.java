package objektno.student;

public class Test {
    public static void main(String[] args) {

        Student s = new Student("Tery",34);
        s.dodajOceno(9);
        s.dodajOceno(10);
        s.dodajOceno(10);
        System.out.print(s);
    }
}
