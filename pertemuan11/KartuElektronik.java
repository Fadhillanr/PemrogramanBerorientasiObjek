package pertemuan11;

import pertemuan11.Kartu.kartu;

public class KartuElektronik implements kartu{
    private String kodeBank, pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    public boolean otentikasi(String pinInput) {
        if(pin.equals(pinInput))
            return true;
            else
                return false;
        }

    public String encode(String pin) {
        return null;
    }
}
