package accessories;

import behaviours.ISell;

public class Pedal extends Accessory implements ISell {

    public Pedal(String type, String brand, String model, double coastPrice) {
        super(type, brand, model, coastPrice);
    }

    public double sell() {
        return getCoastPrice() * 3;
    }
}
