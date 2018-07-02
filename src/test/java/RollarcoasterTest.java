import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollarcoasterTest {
    Rollarcoaster rollarcoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp(){
        rollarcoaster = new Rollarcoaster("Oblivion",4,12,150);
        visitor = new Visitor("James",18,180,40);
        visitor2 = new Visitor("Alan",10,100,40);
        visitor3 = new Visitor("Alan",18,100,40);
    }

    @Test
    public void hasName(){
        assertEquals("Oblivion", rollarcoaster.getName());

    }

    @Test
    public void hasAgeLimit(){
        assertEquals(12, rollarcoaster.getMinAge());
    }

    @Test
    public void canRideIfOverAge(){
        assertEquals(true, rollarcoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotRideIfUnderAge(){
        assertEquals(false,rollarcoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cannotRideIfOverAgeButTooSmall(){
        assertEquals(false,rollarcoaster.isAllowedTo(visitor3));
    }

    @Test
    public void canGetRating(){
        assertEquals(4,rollarcoaster.getRating());
    }

}
