package locations;

import java.util.ArrayList;
import java.util.List;

public class Floor extends Location {
    private int number;
    private List<Room> rooms;

    public Floor(int number) {
        this.number = number;
        rooms = new ArrayList<Room>();
        locationID = new LocationID(0, number);
        // locationID = new LocationID(0, number);
    }

    public void setBuilding(LocationID building) {
        locationID = new LocationID(building);
        locationID.setFloorNo(number);
    }

    public void addRoom(Room room) {
        room.setFloor(locationID);
        rooms.add(room);
    }

    public int getNumberOfRooms() {
        return rooms.size();
    }

    @Override
    public String opis() {
        StringBuilder sB = new StringBuilder();
        sB.append(" Floor number: " + number + "\t[" + locationID + "]\n");
        for (Room room : rooms) {
            sB.append(room.opis());
        }
        return sB.toString();
    }

}
