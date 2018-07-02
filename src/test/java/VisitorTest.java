import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp(){
        visitor = new Visitor("Harry", 29,190,200);
        visitor2 = new Visitor("John", 35,170,140);
    }

    @Test
    public void hasName(){
        assertEquals("Harry",visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(35,visitor2.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(190,visitor.getHeight(),0.1);
    }

    @Test
    public void hasMoney(){
        assertEquals(140,visitor2.getMoney(),0.1);
    }
}
