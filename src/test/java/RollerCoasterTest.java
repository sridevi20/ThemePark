import org.junit.Before;
import org.junit.Test;
import rides.RollerCoaster;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {
    RollerCoaster rollerCoaster;
    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Acceleration",3);
    }
    @Test
    public void hasName(){
        assertEquals("Acceleration",rollerCoaster.getName());
    }
    @Test
    public void canChangeName(){
        rollerCoaster.setName("Acrobat");
        assertEquals("Acrobat",rollerCoaster.getName());
    }
    @Test
    public void hasRating(){
        assertEquals(3,rollerCoaster.getRating());
    }
    @Test
    public void canChangeRating(){
        rollerCoaster.setRating(2);
        assertEquals(2, rollerCoaster.getRating());
    }
}
