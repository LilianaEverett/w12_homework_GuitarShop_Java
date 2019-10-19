package kits;

import behaviours.ISell;

import java.util.ArrayList;

public class GuitarKit implements ISell {

    private ArrayList<ISell> kitItems;

    public GuitarKit() {
        this.kitItems = new ArrayList<ISell>();
    }

    public double sell() {
        return 0;
    }

    public double calculateMarkup() {
        return 0;
    }
}
