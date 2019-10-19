package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class BassGuitar extends Guitar implements IPlay, ISell {

    public BassGuitar(String type, String brand, String model, String colour, double coastPrice) {
        super(type, brand, model, colour, coastPrice);
    }

    public String play() {
        return "dirnt, dirnt, dirnt!";
    }

    public double sell() {
        return getCoastPrice() * 2.2;
    }
}
