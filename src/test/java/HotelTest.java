import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    public Hotel codeClanTowers;
    public Bedroom mouseTrap;
    public Guest dewFaceLoudFeathers;

    @Before
    public void before() {
        codeClanTowers = new Hotel("Code Clan Towers");
        mouseTrap = new Bedroom(71, 100, "Chamber");
        dewFaceLoudFeathers = new Guest("Dewface Loudfeathers");
    }

    @Test
    public void hasName() {
        assertEquals("Code Clan Towers", codeClanTowers.getName());
    }

    @Test
    public void roomListStartsEmpty() {
        assertEquals(0, codeClanTowers.getRoomCount());
    }

    @Test
    public void canAddRoom() {
        Bedroom furryFunZone = new Bedroom(20, 4, "Double"); //given when we have and empty room list and a room to add
        codeClanTowers.addRoomToList(furryFunZone); //when we add room to list
        assertEquals(1, codeClanTowers.getRoomCount()); //room list count will increase
    }

    @Test
    public void canAddGuestToBedroomFromHotel() {
        assertEquals(0, mouseTrap.getGuestsNum());
        mouseTrap.addGuest(dewFaceLoudFeathers);
        assertEquals(1, mouseTrap.getGuestsNum());
    }

    @Test
    public void canRemoveGuestFromBedroomInHotel() {
        assertEquals(0, mouseTrap.getGuestsNum());
        mouseTrap.addGuest(dewFaceLoudFeathers);
        assertEquals(1, mouseTrap.getGuestsNum());
        Guest removedGuest = mouseTrap.removeGuest();
        assertEquals(0, mouseTrap.getGuestsNum());
        assertEquals(dewFaceLoudFeathers, removedGuest);
    }
}