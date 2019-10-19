import accessories.*;
import behaviours.ISell;
import guitars.*;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import kits.*;

import static org.junit.Assert.*;

public class GuitarKitTest {

    GuitarKit kit;
    ISell strings;
    ISell guitarAmp;
    ISell guitarBag;
    ISell strap;
    ISell standBy;

    @Before
    public void before() {
        strings = new Strings(AccessoryType.STRINGS, "Ernie Ball", "Super Slinky 2223", 2.00);
        standBy = new StandBy(AccessoryType.STAND,"Ortega", "OGS-1BK", 5.00);
        guitarAmp = new GuitarAmp(AccessoryType.AMP,"Fender", "FrontMan", 25.50);
        guitarBag = new GuitarBag(AccessoryType.BAG, "fender", "FE405", 9.50);
        strap = new Strap(AccessoryType.STRAP, "Hartwood", "deluxe", 7.20);
        kit = new GuitarKit();
        kit.addItem(strings);
        kit.addItem(standBy);
        kit.addItem(guitarBag);
        kit.addItem(guitarAmp);
        kit.addItem(strap);
    }

    @Test
    public void canAddItem() {
        kit.addItem(strings);
        assertEquals(6, kit.countItems());
    }

    @Test
    public void hasPrice() {
        assertEquals(119.95, kit.sell(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(70.75, kit.calculateMarkup(), 0.1);
    }

}
