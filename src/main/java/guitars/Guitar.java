package guitars;

import behaviours.ISell;

public abstract class Guitar implements ISell {

    private GuitarType type;
    private String brand;
    private String model;
    private String colour;
    public double costPrice;
    public double sellPrice;

    public Guitar (GuitarType type, String brand, String model, String colour, double costPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.costPrice = costPrice;
        this.sellPrice = 0;
    }

    public GuitarType getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double setSellPrice(double newSellPrice) {
        return sellPrice = newSellPrice;
    }

    public double calculateMarkup() {
        return sell() - costPrice;
    }
}
