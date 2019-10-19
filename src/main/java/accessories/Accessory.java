package accessories;

public abstract class Accessory {

    private String type;
    private String brand;
    private String model;
    private double coastPrice;
    private double sellPrice;

    public Accessory(String type, String brand, String model, double coastPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.coastPrice = coastPrice;
        this.sellPrice = 0;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCoastPrice() {
        return coastPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double setSellPrice(double newSellPrice) {
        return sellPrice = newSellPrice;
    }
}
