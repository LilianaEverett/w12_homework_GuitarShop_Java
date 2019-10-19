package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class ElectricGuitar extends Guitar implements IPlay {

    public ElectricGuitar(GuitarType type, String brand, String model, String colour, double costPrice) {
        super(type, brand, model, colour, costPrice);
    }

    public String play() {
        return "wa, wa, wa, wa, wa!";
    }

    public double sell() {
        double markup = getCostPrice() * 1.8;
        return setSellPrice(markup);
    }
}
