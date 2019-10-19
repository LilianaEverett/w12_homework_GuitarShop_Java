import behaviours.ISell;
import guitars.Guitar;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public int countStock() {
        return stock.size();
    }


    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }
}
