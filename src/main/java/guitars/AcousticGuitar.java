package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class AcousticGuitar extends Guitar implements IPlay, ISell {

    public AcousticGuitar(String type, String brand, String model, String colour, double coastPrice) {
        super(type, brand, model, colour, coastPrice);
    }

    public String play() {
        return "dling, gling, dlang!";
    }

    public double sell() {
        double markup = getCoastPrice() * 2;
        return setSellPrice(markup);
    }
}
