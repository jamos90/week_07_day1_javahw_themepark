import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerTentTest {

    BeerTent beerTent;

    @Before
    public void setUP(){
        beerTent = new BeerTent("Brauhaus","Heir Hanz",45,18);
    }

    @Test
    public void hasName(){
        assertEquals("Brauhaus", beerTent.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Heir Hanz", beerTent.getOwner());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(45,beerTent.getParkingSpot());
    }
}
