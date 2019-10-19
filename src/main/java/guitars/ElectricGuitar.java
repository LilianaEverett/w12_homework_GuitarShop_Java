package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class ElectricGuitar extends Guitar implements IPlay, ISell {

    public ElectricGuitar(String type, String brand, String model, String colour, double coastPrice) {
        super(type, brand, model, colour, coastPrice);
    }

    public String play() {
        return "wa, wa, wa, wa, wa!";
    }

    public double sell() {
        return getCoastPrice() * 1.8;
    }
}
