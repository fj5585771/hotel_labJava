import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.name = name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getGuestNum(){
        return guests.size();
    }
}
