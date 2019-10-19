import accessories.Accessory;
import accessories.Strings;
import behaviours.ISell;
import guitars.AcousticGuitar;
import guitars.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell acousticGuitar;
    ISell strings;

    @Before
    public void before() {
        shop = new Shop("Strings & Things");
        acousticGuitar = new AcousticGuitar("Acoustic guitars.Guitar", "Taylor", "Baby BT2" , "beije", 150.00);
        strings = new Strings("Strings", "Ernie Ball", "Super Slinky 2223", 2.00);

    }

    @Test
    public void hasName() {
        assertEquals("Strings & Things", shop.getName());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(acousticGuitar);
        shop.addItem(strings);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(acousticGuitar);
        shop.addItem(strings);
        shop.removeItem(strings);
        assertEquals(1, shop.countStock());
    }
}
