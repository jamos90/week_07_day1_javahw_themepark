import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    BeerTent beertent;
    Dodgems dodgems;

    @Before
    public void SetUp(){
        themePark = new ThemePark();
        beertent = new BeerTent("Veer Tent","Mr Smith",3,18,4);
       dodgems = new Dodgems("Dodgems",3);

    }

    @Test
    public void listStatsEmpty(){
        assertEquals(0, themePark.reviewedCount());
    }

    @Test
    public void canAddToList(){
        themePark.addReviewed(dodgems);
        assertEquals(1,themePark.reviewedCount());
    }

    @Test
    public void canAddStallToList(){
        themePark.addReviewed(beertent);
        assertEquals(1,themePark.reviewedCount());
    }

    @Test
    public void canAddBothToList(){
        themePark.addReviewed(beertent);
        themePark.addReviewed(dodgems);
        assertEquals(2,themePark.reviewedCount());
    }

    @Test
    public void canClearList(){
        themePark.addReviewed(beertent);
        themePark.addReviewed(dodgems);
        themePark.clear();
        assertEquals(0,themePark.reviewedCount());
    }


}
