import accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before() {
        strings = new Strings("Strings", "Ernie Ball", "Super Slinky 2223", 2.00);
    }

    @Test
    public void hasType() {
        assertEquals("Strings", strings.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Ernie Ball", strings.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Super Slinky 2223", strings.getModel());
    }

    @Test
    public void hasCoastPrice() {
        assertEquals(2.00, strings.getCoastPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        strings.sell();
        assertEquals(6.20, strings.getSellPrice(), 0.1);
    }
}
