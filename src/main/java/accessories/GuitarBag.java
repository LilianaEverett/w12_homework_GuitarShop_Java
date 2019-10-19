package accessories;

import behaviours.ISell;

public class GuitarBag extends Accessory implements ISell {

    public GuitarBag(String type, String brand, String model, double coastPrice) {
        super(type, brand, model, coastPrice);
    }

    public double sell() {
        return getCoastPrice() * 2;
    }
}
