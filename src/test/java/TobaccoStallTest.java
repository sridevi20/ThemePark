import attraction.Visitors;
import org.junit.Before;
import org.junit.Test;
import substall.TobaccoStall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    @Before
    public void before(){
        tobaccoStall= new TobaccoStall("creamBar","Abby","creamParkOnly",5);
    }
    @Test
    public void hasName(){
        assertEquals("creamBar",tobaccoStall.getName());
    }@Test
    public void hasOwnerName(){
        assertEquals("Abby",tobaccoStall.getOwnerName());
    }
    @Test
    public void hasParkingSpot(){
        assertEquals("creamParkOnly", tobaccoStall.getParkingSpot());
    }
    @Test
    public void hasRating(){
        assertEquals(5,tobaccoStall.getRating());
    }
    @Test
    public void checkVisitorAllowed(Visitors  visitor){
        visitor.getAge(19);
        assertEquals(true,tobaccoStall.isAllowedto(boolean));
    }

}
