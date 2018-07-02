import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Red Shell Attack", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Red Shell Attack", dodgems.getName());
    }

}
