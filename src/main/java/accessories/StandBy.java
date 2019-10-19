package accessories;

import behaviours.ISell;

public class StandBy extends Accessory {

    public StandBy(AccessoryType type, String brand, String model, double costPrice) {
        super(type, brand, model, costPrice);
    }

    public double sell() {
        double markup = getCostPrice() * 2.9;
        return setSellPrice(markup);
    }
}
