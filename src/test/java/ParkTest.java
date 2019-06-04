import org.junit.Before;
import org.junit.Test;
import park.Park;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Park park;

    @Before
    public void before() {
        park = new Park("AltonPark",5);
    }
    @Test
    public void hasName(){
        assertEquals("AltonPark", park.getName());
    }
    @Test
    public void canChangeName() {
        park.setName("ThorpePark");
        assertEquals("ThorpePark", park.getName());
    }
    @Test
    public void hasRating(){
        assertEquals(5,park.getRating());
    }
    @Test
    public void canChangeRating(){
        park.setRating(4);
        assertEquals(4,park.getRating());
    }

}
