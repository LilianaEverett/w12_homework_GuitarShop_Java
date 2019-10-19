package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private AccessoryType type;
    private String brand;
    private String model;
    public double costPrice;
    public double sellPrice;

    public Accessory(AccessoryType type, String brand, String model, double costPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.costPrice = costPrice;
        this.sellPrice = 0;
    }

    public AccessoryType getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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
