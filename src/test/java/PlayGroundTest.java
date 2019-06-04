import attraction.Visitors;
import org.junit.Before;
import org.junit.Test;
import park.Park;
import park.PlayGround;

import static org.junit.Assert.*;

public class PlayGroundTest {
    PlayGround playGround;

    @Before
    public void before() {
        playGround = new PlayGround("sand",5);
    }

    @Test
    public void hasName(){
        assertEquals("sand", playGround.getName());
    }
    @Test
    public void canChangeName() {
        playGround.setName("outDoorGames");
        assertEquals("outDoorGames", playGround.getName());
    }
    @Test
    public void hasRating(){
        assertEquals(5,playGround.getRating());
    }
    @Test
    public void canChangeRating(){
        playGround.setRating(4);
        assertEquals(4,playGround.getRating());
    }
    @Test
    public void checkVisitorAllowed(Visitors visitor){

    visitor.getAge();
       assertEquals(true, playGround.isAllowedto(boolean));
    }
}
