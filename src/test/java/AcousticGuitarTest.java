import guitars.AcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before() {
        acousticGuitar = new AcousticGuitar("Acoustic guitars.Guitar", "Taylor", "Baby BT2" , "beije", 150.00);

    }

    @Test
    public void hasType() {
        assertEquals("Acoustic guitars.Guitar", acousticGuitar.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Taylor", acousticGuitar.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Baby BT2", acousticGuitar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("beije", acousticGuitar.getColour());
    }

    @Test
    public void hasCoastPrice() {
        assertEquals(150.00, acousticGuitar.getCoastPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        acousticGuitar.sell();
        assertEquals(300.00, acousticGuitar.getSellPrice(), 0.1);
    }

    @Test
    public void canPlay() {
        assertEquals("dling, gling, dlang!", acousticGuitar.play());
    }
}