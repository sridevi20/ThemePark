import attraction.Visitors;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorsTest {
    Visitors visitors;

    @Before
    public void before() {
        visitors = new Visitors(20,162.56,100);
    }
    @Test
    public void hasAge(){
        assertEquals(20,visitors.getAge());
    }
    @Test
    public void hasHeight(){
        assertEquals(162.56, visitors.getHeight(),0.00);
    }
    @Test
    public void hasMoney(){
        assertEquals(100,visitors.getMoney(),0.00);
    }
}
