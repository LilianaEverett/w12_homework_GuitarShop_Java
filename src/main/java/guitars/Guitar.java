package guitars;

public abstract class Guitar {

    private String type;
    private String brand;
    private String model;
    private String colour;
    private double coastPrice;
    private double sellPrice;

    public Guitar (String type, String brand, String model, String colour, double coastPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
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

    public String getColour() {
        return colour;
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
