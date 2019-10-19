import accessories.Accessory;
import accessories.*;
import behaviours.ISell;
import guitars.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell acousticGuitar;
    ISell electricGuitar;
    ISell standBy;
    ISell strings;

    @Before
    public void before() {
        electricGuitar = new ElectricGuitar(GuitarType.ELECTRIC_GUITAR, "Dean", "Vendetta XM Tremolo", "metallic red", 45.00);
        acousticGuitar = new AcousticGuitar(GuitarType.ACOUSTIC_GUITAR, "Taylor", "Baby BT2" , "beije", 150.00);
        standBy = new StandBy(AccessoryType.STAND,"Ortega", "OGS-1BK", 5.00);
        strings = new Strings(AccessoryType.STRINGS, "Ernie Ball", "Super Slinky 2223", 2.00);
        shop = new Shop("Strings & Things");
        shop.addItem(acousticGuitar);
        shop.addItem(strings);
        shop.addItem(standBy);
        shop.addItem(electricGuitar);

    }

    @Test
    public void hasName() {
        assertEquals("Strings & Things", shop.getName());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(acousticGuitar);
        shop.addItem(strings);
        assertEquals(6, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(acousticGuitar);
        shop.addItem(strings);
        shop.removeItem(strings);
        assertEquals(5, shop.countStock());
    }

    @Test
    public void canSellItem() {
        shop.sellItem(acousticGuitar);
        assertEquals(3, shop.countStock());
        assertEquals(1, shop.countItemsSold());
        assertEquals(300.00, acousticGuitar.sell(), 0.1);
        assertEquals(300.00, shop.getTill(), 0.1);
    }

    @Test
    public void canCalculateProfit() {
        shop.sellItem(electricGuitar);
        shop.sellItem(strings);
        assertEquals(40.2, shop.profit(), 0.1);
        assertEquals(81.00, electricGuitar.sell(), 0.1);
        assertEquals(36.00, electricGuitar.calculateMarkup(), 0.1);
        assertEquals(4.2, strings.calculateMarkup(), 0.1);
        assertEquals(87.20, shop.getTill(), 0.1);
        assertEquals(2, shop.countItemsSold());
    }

    @Test
    public void canCalculatePotentialProfit() {
        assertEquals(199.70, shop.potentialProfit(), 0.1);
        assertEquals(150.00, acousticGuitar.calculateMarkup(), 0.1);
        assertEquals(36.00, electricGuitar.calculateMarkup(), 0.1);
        assertEquals(4.2, strings.calculateMarkup(), 0.1);
        assertEquals(9.5, standBy.calculateMarkup(), 0.1);
    }


}
