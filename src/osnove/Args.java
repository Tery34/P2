package osnove;

public class Args {
    public static void main(String[] args){
        int st_argumentov = args.length; //stevilo argumentov
        System.out.printf("Stevilo argumentov: %d\n", st_argumentov);

        for(int i = 0; i < st_argumentov; i++){
            System.out.printf("Argument %d: %s\n",i,args[i]); //args[i] podan argument na indexu i
        }
    }
}
