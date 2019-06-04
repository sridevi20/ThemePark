import attractionstall.Stall;
import org.junit.Before;
import org.junit.Test;
import substall.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;
    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("creamBar","Abby","creamParkOnly",5);
    }
    @Test
    public void hasName(){
        assertEquals("creamBar",iceCreamStall.getName());
    }@Test
    public void hasOwnerName(){
        assertEquals("Abby",iceCreamStall.getOwnerName());
    }
    @Test
    public void hasParkingSpot(){
        assertEquals("creamParkOnly", iceCreamStall.getParkingSpot());
    }
    @Test
    public void hasRating(){
        assertEquals(5,iceCreamStall.getRating());
    }
}
