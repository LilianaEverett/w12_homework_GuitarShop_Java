package accessories;

import behaviours.ISell;

public class Strap extends Accessory implements ISell {

    public Strap(String type, String brand, String model, double coastPrice) {
        super(type, brand, model, coastPrice);
    }

    public double sell() {
        return getCoastPrice() * 3;
    }
}
