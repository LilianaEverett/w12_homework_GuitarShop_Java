package kits;

import accessories.Accessory;
import behaviours.ISell;

import java.util.ArrayList;

public class GuitarKit implements ISell {

    protected ArrayList<ISell> kitItems;

    public GuitarKit() {
        this.kitItems = new ArrayList<ISell>();
    }

    public double sell() {
        double itemsValue = 0;
        for (ISell item : kitItems) {
            itemsValue += item.sell();
        }
        return itemsValue;
    }

    public double calculateMarkup() {
        double kitMarkup = 0;
        for (ISell item : kitItems) {
            kitMarkup += item.calculateMarkup();
        }
        return kitMarkup;
    }

    public int countItems() {
        return kitItems.size();
    }

    public void addItem(ISell item) {
        kitItems.add(item);
    }
}
