package VAJE.VAJE05.nakupovanje;

import VAJE.VAJE05.zbirke.Seznam;

import java.util.Scanner;

public class NakupovalniSeznam {

    /**
     * Izpis navodil za interaktivno uporabo seznama.
     */
    private static void izpisiNavodila() {
        System.out.println("Navodila:");
        System.out.println("1: ustvari seznam, 2: dodaj element na konec, 3: vrini element na mesto, 4: odstrani element na mestu, 5: vrni dolžino seznama, 6: izpiši seznam, 7: izpiši 64-bitno, 8: uniči seznam, q: izhod, h: pomoč");
    }

    /**
     * Program za pripravo nakupovalnega seznama.
     * Omogoča ustvarjanje seznama, dodajanje in brisanje posameznih elementov ter izpis seznama.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Priprava nakupovalnega seznama ...");
        System.out.println("h: pomoč, q: izhod");
        char ukaz;
        String element;
        int mesto, dol;
        do {
            System.out.print(">> ");
            ukaz = sc.next().toLowerCase().charAt(0);
            switch (ukaz) {
                case 'q':
                    System.out.println("Izhod.");
                    break;
                case 'h':
                    izpisiNavodila();
                    break;
                case '1': // ustvari seznam
                    System.out.println("Ustvari seznam.");
                    System.out.print("Vnesi dolžino seznama: ");
                    dol = sc.nextInt();
                    if (Seznam.narediSeznam(dol))
                        System.out.printf("Seznam dolžine %d je ustvarjen.%n", dol);
                    else
                        System.out.println("NAPAKA: Seznam je že narejen ali podana dolžina ni prava.");
                    break;
                case '2': // dodaj element na konec seznama
                    System.out.println("Dodaj element na konec seznama.");
                    System.out.print("Nov element: ");
                    element = sc.next();
                    if (Seznam.dodajNaKonecSeznama(element))
                        System.out.printf("Element <%s> je dodan na konec seznama.%n", element);
                    else
                        System.out.println("NAPAKA: Seznam še ni narejen ali pa je že poln.");
                    break;
                case '3': // vrini element na podano mesto
                    System.out.println("Dodaj element na podano mesto.");
                    System.out.print("Nov element: ");
                    element = sc.next();
                    System.out.print("Mesto vrinjenega elementa (od 1 naprej): ");
                    mesto = sc.nextInt();
                    if (Seznam.dodajVSeznam(element, mesto))
                        System.out.printf("Element <%s> je dodan v seznam na mesto %d.%n", element, mesto);
                    else
                        System.out.println("NAPAKA: Seznam še ni narejen, je že poln ali pa je podano napačno mesto.");
                    break;
                case '4': // odstrani element na podanem mestu
                    System.out.println("Odstrani element na podanem mestu.");
                    System.out.print("Mesto brisanega elementa: ");
                    mesto = sc.nextInt();
                    element = Seznam.odstraniIzSeznama(mesto);
                    if (element != null)
                        System.out.printf("Element <%s> je odstranjen iz seznama.%n", element);
                    else
                        System.out.printf("NAPAKA: Seznam še ni narejen ali element na mestu %d ne obstaja.%n", mesto);
                    break;
                case '5': // vrni dolžino seznama
                    dol = Seznam.dolzinaSeznama();
                    if (dol >= 0)
                        System.out.printf("Dolžina seznama je %d.%n", dol);
                    else
                        System.out.println("NAPAKA: Seznam še ni narejen.");
                    break;
                case '6': // izpiši seznam
                    Seznam.izpisiSeznam();
                    break;
                case '7': // izpiši 64-bitno
                    Seznam.izpisiSeznam64Bit();
                    break;
                case '8': // uniči seznam
                    if (Seznam.uniciSeznam())
                        System.out.println("Seznam je uničen.");
                    else
                        System.out.println("NAPAKA: Seznam ne obstaja.");
                    break;
                default:
                    System.out.println("Ukaz ni veljaven. Za navodila izberite h. Za izhod izberite q.");
            }
        } while (ukaz != 'q');
    }
}
