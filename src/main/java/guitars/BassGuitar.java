package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class BassGuitar extends Guitar implements IPlay {

    public BassGuitar(GuitarType type, String brand, String model, String colour, double costPrice) {
        super(type, brand, model, colour, costPrice);
    }

    public String play() {
        return "dirnt, dirnt, dirnt!";
    }

    public double sell() {
        double markup = getCostPrice() * 2.2;
        return setSellPrice(markup);
    }
}
