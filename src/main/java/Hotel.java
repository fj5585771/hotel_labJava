import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> roomList;
    private Bedroom bedroom;

    public Hotel(String name){
        this.name = name;
        this.roomList = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getRoomCount(){
        return roomList.size();
    }

    public void addRoomToList(Bedroom bedroom){
        this.roomList.add(bedroom);
    }

    public void addGuestToBedroom(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }





}
