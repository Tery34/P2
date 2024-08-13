package objektno.hotel;

public class HotelBazen extends Hotel{
    private int volumen;
    HotelBazen(String imeHotela, int steviloSob, int volume) {
        super(imeHotela, steviloSob);
        this.volumen = volume;
    }
    public String toString() {
        return super.toString() + ". Imamo bazen";
    }
}
