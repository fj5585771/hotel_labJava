import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest colon;

    @Before
    public void before(){
        colon = new Guest("Colon");
    }
    @Test
    public void hasName(){
        assertEquals("Colon", colon.getName());
    }


}
