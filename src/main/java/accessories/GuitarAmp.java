package accessories;

import behaviours.ISell;

public class GuitarAmp extends Accessory implements ISell {

    public GuitarAmp(String type, String brand, String model, double coastPrice) {
        super(type, brand, model, coastPrice);
    }

    public double sell() {
        return getCoastPrice() * 2.3;
    }
}
