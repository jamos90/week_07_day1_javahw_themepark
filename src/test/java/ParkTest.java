import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp(){
        park =  new Park("Eden Park");
    }

    @Test
    public void hasName(){
        assertEquals("Eden Park", park.getName());
    }

}
