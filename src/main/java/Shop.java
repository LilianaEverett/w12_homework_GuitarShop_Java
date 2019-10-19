import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    protected ArrayList<ISell> stock;
    private ArrayList<ISell> itemsSold;
    private double till;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.itemsSold = new ArrayList<ISell>();
        this.till = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public ArrayList<ISell> getItemsSold() {
        return itemsSold;
    }

    public double getTill() {
        return till;
    }

    public int countStock() {
        return stock.size();
    }

    public int countItemsSold() {
        return itemsSold.size();
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }

    public void sellItem(ISell item) {
        till += item.sell();
        itemsSold.add(item);
        removeItem(item);
    }

    public double profit() {
        double sellPriceItems = 0;
        for (ISell item : this.itemsSold) {
            sellPriceItems += item.calculateMarkup();
        }
        return sellPriceItems;
    }

    public double potentialProfit() {
        double sellPriceItems = 0;
        for (ISell item : this.stock) {
            sellPriceItems += item.calculateMarkup();
        }
        return sellPriceItems;
    }
}
