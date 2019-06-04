import org.junit.Before;
import org.junit.Test;
import substall.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("pinkCandy","Kathy","candyStopPark",5);

    }

    @Test
    public void hasName(){
        assertEquals("pinkCandy",candyFlossStall.getName());
    }@Test
    public void hasOwnerName(){
        assertEquals("Kathy",candyFlossStall.getOwnerName());
    }
    @Test
    public void hasParkingSpot(){
        assertEquals("candyStopPark", candyFlossStall.getParkingSpot());
    }
    @Test
    public void hasRating(){
        assertEquals(5,candyFlossStall.getRating());
    }

}
