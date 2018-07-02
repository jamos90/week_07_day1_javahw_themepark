import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerTentTest {

    BeerTent beerTent;
    Visitor visitor;

    @Before
    public void setUP(){
        beerTent = new BeerTent("Brauhaus","Heir Hanz",45,18);
        visitor = new Visitor("Ed", 14,120,40);
        visitor = new Visitor("Sebi", 19,180,100);
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

    @Test
    public void isNotAllowed(){
        assertEquals(false, beerTent.isAllowedTo(visitor));
    }
}
