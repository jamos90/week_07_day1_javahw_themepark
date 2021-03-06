import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcecreamStallTest {

    IcecreamStall icecreamStall;

    @Before
    public void setUp(){
        icecreamStall = new IcecreamStall("Lucas","Mr Luca",23, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Lucas", icecreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Mr Luca", icecreamStall.getOwner());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(23, icecreamStall.getParkingSpot());
    }

}
