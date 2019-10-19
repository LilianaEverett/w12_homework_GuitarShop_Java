package accessories;

import behaviours.ISell;

public class Pedal extends Accessory {

    public Pedal(AccessoryType type, String brand, String model, double costPrice) {
        super(type, brand, model, costPrice);
    }

    public double sell() {
        double markup = getCostPrice() * 3;
        return setSellPrice(markup);
    }
}
