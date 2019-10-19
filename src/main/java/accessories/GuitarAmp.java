package accessories;

public class GuitarAmp extends Accessory {

    public GuitarAmp(AccessoryType type, String brand, String model, double costPrice) {
        super(type, brand, model, costPrice);
    }

    public double sell() {
        double markup = getCostPrice() * 2.3;
        return setSellPrice(markup);
    }
}
