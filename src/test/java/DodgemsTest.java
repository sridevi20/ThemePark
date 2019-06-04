import org.junit.Before;
import org.junit.Test;
import rides.Dodgems;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void before()  {
        dodgems = new Dodgems("BumperCar", 5);

    }
    @Test
    public void hasName(){
        assertEquals("BumperCar",dodgems.getName());
    }
    @Test
    public void canChangeName(){
        dodgems.setName("Retro");
        assertEquals("Retro",dodgems.getName());
    }
    @Test
    public void hasRating(){
        assertEquals(5, dodgems.getRating());
    }
    @Test
    public void canChangeRating(){
        dodgems.setRating(4);
        assertEquals(4, dodgems.getRating());
    }
}
