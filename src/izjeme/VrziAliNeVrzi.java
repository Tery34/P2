package izjeme;
class IzjemaDeljenje extends ArithmeticException {
    public String getMessage() {
        return "Napaka Deljeneje z 0";
    }
}

public class VrziAliNeVrzi {

    public static void main(String[] args) {
        izpisDeljenjaTest();
        try {
            izpisDeljenja();
        }catch (IzjemaDeljenje e){
            System.out.println(e.getMessage());
        }
    }
    static double deljenje(double x, double y) throws IzjemaDeljenje{
        if (y == 0){
            throw new IzjemaDeljenje();
        }else{
            return x / y;
        }
    }
    static void izpisDeljenja() throws IzjemaDeljenje{
        for (int i = 10; i >=0 ; i--){
            System.out.println(deljenje(10,i));
        }
    }
    static void izpisDeljenjaTest(){
        try{
            for (int i = 10; i >=0 ; i--){
                System.out.println(deljenje(10,i));
            }
        }catch (IzjemaDeljenje e){
            System.out.println(e.getMessage());
        }
    }
}


