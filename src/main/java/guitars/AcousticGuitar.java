package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class AcousticGuitar extends Guitar implements IPlay {

    public AcousticGuitar(GuitarType type, String brand, String model, String colour, double costPrice) {
        super(type, brand, model, colour, costPrice);
    }

    public String play() {
        return "dling, gling, dlang!";
    }

    public double sell() {
        double markup = getCostPrice() * 2;
        return setSellPrice(markup);
    }
}
