package locations;

import java.util.ArrayList;
import java.util.List;

public class Floor extends Location {
    private int number;
    private List<Room> rooms;
    private String opis;
    private boolean floorHasChanged = true;

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
        floorHasChanged = true;
    }

    public int getNumberOfRooms() {
        return rooms.size();
    }

    // Lazy loading - pietro moze zostac stworzone, ale opis zostanie wygenerowany dopiero wtedy,
    // gdy ktos wywola metode opis()
    // dzieki temu bedziemy iterowac po pokojach tylko wtedy, gdy bedzie to konieczne
    @Override
    public String opis() {
        if (floorHasChanged) {
            generateOpis();
        }
        return opis;
    }

    private void generateOpis() {
        StringBuilder sB = new StringBuilder();
        sB.append(" Floor number: " + number + "\t[" + locationID + "]\n");
        for (Room room : rooms) {
            sB.append(room.opis());
        }
        this.opis = sB.toString();
        this.floorHasChanged = false;
    }

}
