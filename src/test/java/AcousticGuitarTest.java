import guitars.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before() {
        acousticGuitar = new AcousticGuitar(GuitarType.ACOUSTIC_GUITAR, "Taylor", "Baby BT2" , "beije", 150.00);

    }

    @Test
    public void hasType() {
        assertEquals(GuitarType.ACOUSTIC_GUITAR, acousticGuitar.getType());
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
    public void hasCostPrice() {
        assertEquals(150.00, acousticGuitar.getCostPrice(), 0.1);
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