package accessories;

import behaviours.ISell;

public class StandBy extends Accessory implements ISell {

    public StandBy(String type, String brand, String model, double coastPrice) {
        super(type, brand, model, coastPrice);
    }

    public double sell() {
        return getCoastPrice() * 2.9;
    }
}
