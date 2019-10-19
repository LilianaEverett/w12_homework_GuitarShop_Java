import accessories.*;
import guitars.*;
import org.junit.Test;
import kits.*;

public class GuitarKitTest {

    GuitarKit kit;
    Guitar guitar;
    Accessory strings;
    Accessory guitarAmp;
    Accessory guitarBag;
    Accessory strap;
    Accessory standBy;

    @Test
    public void before() {
        strings = new Strings("Strings", "Ernie Ball", "Super Slinky 2223", 2.00);
        guitar = new ElectricGuitar(GuitarType.ELECTRIC_GUITAR, "Dean", "Vendetta XM Tremolo", "metallic red", 45.00);
        standBy = new StandBy("guitar stand","Ortega", "OGS-1BK", 5.00);
        guitarAmp = new GuitarAmp();
        guitarBag = new GuitarBag();
        strap = new Strap();
        kit = new GuitarKit();

    }

}
