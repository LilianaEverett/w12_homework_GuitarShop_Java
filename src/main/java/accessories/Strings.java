package accessories;

import behaviours.ISell;

public class Strings extends Accessory implements ISell {

    public Strings(String type, String brand, String model, double coastPrice) {
        super(type, brand, model, coastPrice);
    }

    public double sell() {
        double markup = getCoastPrice() * 3.1;
        return setSellPrice(markup);
    }
}
