package objektno.hotel;

public class Graditelj {
    public static void main(String[] args) {
        Hotel.cenaNocitve = 50;
        System.out.println("Gradil bom hotele, cena nocitve:" + Hotel.cenaNocitve + "€");

        Hotel a = new Hotel("Šmarješke",250);
        Hotel b = new Hotel("Čatež",150);
        Hotel c = new HotelBazen("Laško",300,1000);

        System.out.println(b);
        a.registracija("Marjan",4);
        a.registracija("Tomaž",100);
        a.registracija("Lojze",0);
        System.out.println(a);
        System.out.printf("Dnevni promet v hotelu %s je %.2f\n",a.getImeHotela(),a.promet());

        System.out.println(c);

    }
}
