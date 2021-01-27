import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private ArrayList<Guest> occupants;
    private String type;

    public Bedroom(int number, int capacity, String type) {
        this.number = number;
        this.capacity = capacity;
        this.occupants = new ArrayList<Guest>();
        this.type = type;
    }

    public int getRoomNum(){
        return number;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getGuestsNum(){
        return occupants.size();
    }

    public String getRoomType(){
        return type;
    }

    public void addGuest(Guest guest){
        occupants.add(guest);
    }

    public Guest removeGuest(){
        return occupants.remove(0);
    }
}
