import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollarcoasterTest {
    Rollarcoaster rollarcoaster;

    @Before
    public void setUp(){
        rollarcoaster = new Rollarcoaster("Oblivion");
    }

    @Test
    public void hasName(){
        assertEquals("Oblivion", rollarcoaster.getName());

    }

}
