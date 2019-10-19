package accessories;

import behaviours.ISell;

public class Strings extends Accessory {

    public Strings(AccessoryType type, String brand, String model, double costPrice) {
        super(type, brand, model, costPrice);
    }

    public double sell() {
        double markup = getCostPrice() * 3.1;
        return setSellPrice(markup);
    }
}
