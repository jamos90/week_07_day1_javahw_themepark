import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void SetUp(){
        themePark = new ThemePark();
    }

    @Test
    public void listStatsEmpty(){
        assertEquals(0, themePark.reviewedCount());
    }
}
