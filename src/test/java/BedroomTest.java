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
    public void hasNumber(){
        assertEquals(69, boudoir.getRoomNum());
    }

    @Test
    public void hasCapacity(){
        assertEquals(16, boudoir.getCapacity());
    }

    @Test
    public void hasGuestsNumber(){
        assertEquals(0, boudoir.getGuestsNum());
    }

    @Test
    public void hasRoomType(){
        assertEquals("Boudoir", boudoir.getRoomType());
    }

    @Test
    public void canAddGuest(){
        Guest jim = new Guest("Jim");
        boudoir.addGuest(jim);
        assertEquals(1, boudoir.getGuestsNum());
    }

    @Test
    public void canRemoveGuest(){
        Guest jim = new Guest("Jim");
        boudoir.addGuest(jim);
        assertEquals(1, boudoir.getGuestsNum());
        boudoir.removeGuest();
        assertEquals(0, boudoir.getGuestsNum());
    }
}
