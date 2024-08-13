package strukt;

public class SwitchSteviloDni {
    public static void main(String[] args) {
        System.out.println(steviloDni(1,3));
    }
    static int steviloDni(int dan, int mesec){
        int dnevi = dan-1;
        switch (mesec){

            case 12:
                dnevi += 30;
            case 11:
                dnevi += 31;
            case 10:
                dnevi += 30;
            case 9:
                dnevi += 31;
            case 8:
                dnevi += 31;
            case 7:
                dnevi += 30;
            case 6:
                dnevi += 31;
            case 5:
                dnevi += 30;
            case 4:
                dnevi += 31;
            case 3:
                dnevi += 28;
            case 2:
                dnevi += 31;
        }

        return dnevi;
    }
}
