import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BedroomTest {

    public Bedroom boudoir;

    @Before
    public void before(){
        boudoir = new Bedroom(69, 16, "Boudoir");
    }

    @Test
    public void bedroomExists(){
        assertNotNull(boudoir);
    }

    @Test
    public void hadNumber(){
        assertEquals(69, boudoir.getRoomNum());
    }

    @Test
    public void hasCapacity(){
        assertEquals(16, boudoir.getCapacity());
    }
}
