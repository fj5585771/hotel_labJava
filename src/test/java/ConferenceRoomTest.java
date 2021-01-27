import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    public ConferenceRoom midWestFurFest;

    @Before
    public void before(){
        midWestFurFest = new ConferenceRoom(1000, "Mid West Fur Fest");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1000, midWestFurFest.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Mid West Fur Fest", midWestFurFest.getName());
    }

    @Test
    public void guestListStartsEmpty(){
        assertEquals(0, midWestFurFest.getGuestNum());
    }


}
