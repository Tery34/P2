
public class DN08 {
    public static void main(String[] args) {

        Lik[] liki = new Lik[args.length];
        for(int i = 0; i < args.length; i++){
            String[] temp = args[i].split(":");
            switch (temp[0]){
                case "kvadrat": liki[i] = new Kvadrat(Integer.parseInt(temp[1])); break;
                case "pravokotnik": liki[i] = new Pravokotnik(Integer.parseInt(temp[1]), Integer.parseInt(temp[2])); break;
                case "nkotnik": liki[i] = new NKotnik(Integer.parseInt(temp[1]), Integer.parseInt(temp[2])); break;
            }
        }
        System.out.println(skupniObseg(liki));
    }
    public static int skupniObseg(Lik[] liki){
       int vsota = 0;
       for(Lik lik : liki){
           vsota += lik.obseg();
       }
       return vsota;
    }
}
class Pravokotnik extends Lik{
    int a;
    int b;
    public Pravokotnik(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double obseg() {
        return this.a*2+this.b*2;
    }
}
class Kvadrat extends Lik{
    int a;

    public Kvadrat(int a){
        this.a = a;
    }
    @Override
    public double obseg() {
        return 4*a;
    }
}
class NKotnik extends Lik{
    int stranice;
    int a;
    public NKotnik(int stranice, int a){
        this.stranice = stranice;
        this.a = a;
    }
    @Override
    public double obseg() {
        return stranice*a;
    }
}
abstract class Lik {

    abstract public double obseg();
}