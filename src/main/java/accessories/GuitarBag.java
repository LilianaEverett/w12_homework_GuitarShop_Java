package accessories;

import behaviours.ISell;

public class GuitarBag extends Accessory {

    public GuitarBag(AccessoryType type, String brand, String model, double costPrice) {
        super(type, brand, model, costPrice);
    }

    public double sell() {
        double markup = getCostPrice() * 2;
        return setSellPrice(markup);
    }
}
